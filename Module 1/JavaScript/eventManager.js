const events = [
  { name: "Tech Meetup", date: "2025-08-01", seats: 20 },
  { name: "AI Workshop", date: "2024-12-01", seats: 0 }, 
  { name: "Hackathon", date: "2023-11-15", seats: 50 }, 
  { name: "Web Dev Bootcamp", date: "2025-09-10", seats: 15 }
];

const today = new Date();

const list = document.getElementById("eventList");

events.forEach(event => {
  const eventDate = new Date(event.date);

  if (eventDate > today && event.seats > 0) {
    
    const li = document.createElement("li");
    li.textContent = `${event.name} — ${event.date} — Seats: ${event.seats}`;
    list.appendChild(li);

    try {
      registerUser(event);
    } catch (error) {
      console.error(`Error registering for ${event.name}: ${error.message}`);
    }
  } else {
    console.log(`Skipping: ${event.name} (Past or Full)`);
  }
});

function registerUser(event) {
  if (event.seats <= 0) {
    throw new Error("No seats available!");
  }
  event.seats--;
  console.log(`User registered for ${event.name}. Remaining seats: ${event.seats}`);
}
