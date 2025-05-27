let events = [];

function addEvent(name, date, seats, category) {
  events.push({ name, date, seats, category });
}

function registerUser(event) {
  if (event.seats <= 0) {
    throw new Error(`No seats left for ${event.name}`);
  }
  event.seats--;
  console.log(`User registered for ${event.name}. Remaining: ${event.seats}`);
}

function filterEventsByCategory(category, callback) {
  return events.filter(event => {
    return event.category === category && callback(event);
  });
}

function createCategoryTracker() {
  const counts = {};

  return function (category) {
    if (!counts[category]) {
      counts[category] = 0;
    }
    counts[category]++;
    console.log(`Total registrations in ${category}: ${counts[category]}`);
  };
}

const trackRegistration = createCategoryTracker(); 

addEvent("JavaScript Bootcamp", "2025-09-01", 10, "Tech");
addEvent("Yoga Class", "2025-08-15", 5, "Wellness");
addEvent("AI Summit", "2025-10-10", 20, "Tech");
addEvent("Nutrition Workshop", "2025-07-25", 0, "Wellness"); 

const availableTechEvents = filterEventsByCategory("Tech", (event) => event.seats > 0);

const list = document.getElementById("eventList");

availableTechEvents.forEach(event => {
  const li = document.createElement("li");
  li.textContent = `${event.name} - ${event.date} - Seats: ${event.seats}`;
  list.appendChild(li);
  try {
    registerUser(event);
    trackRegistration(event.category); 
  } catch (err) {
    console.error(err.message);
  }
});
