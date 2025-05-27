const events = [
  { name: "Rock Concert", type: "music", date: "2025-06-15" },
  { name: "Baking Workshop", type: "workshop", date: "2025-06-20" },
  { name: "Jazz Night", type: "music", date: "2025-06-25" },
];

events.push({ name: "Painting Workshop", type: "workshop", date: "2025-07-01" });

const musicEvents = events.filter(event => event.type === "music");

const displayCards = events.map(event => `${event.type.charAt(0).toUpperCase() + event.type.slice(1)} on ${event.name}`);

console.log("All events:", events);
console.log("Music events:", musicEvents);
console.log("Display cards:", displayCards);
