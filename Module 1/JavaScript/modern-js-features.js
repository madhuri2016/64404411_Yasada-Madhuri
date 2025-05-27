const events = [
  { id: 1, name: "Rock Concert", type: "music", date: "2025-06-15" },
  { id: 2, name: "Baking Workshop", type: "workshop", date: "2025-06-20" },
  { id: 3, name: "Jazz Night", type: "music", date: "2025-06-25" },
];

function displayEvents(eventList = events) {

  const clonedEvents = [...eventList];

  const musicEvents = clonedEvents.filter(({ type }) => type === "music");

  musicEvents.forEach(({ id, name, date }) => {
    console.log(`Event #${id}: ${name} on ${date}`);
  });
}

displayEvents();
