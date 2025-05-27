console.log("Welcome to the Community Portal");
window.onload = function () {
  alert("The Community Portal page has fully loaded!");
  
  const eventName = "Tech Community Meetup";
  const eventDate = "July 15, 2025";

  let availableSeats = 50;

  const eventInfo = `Event: ${eventName}\nDate: ${eventDate}\nAvailable Seats: ${availableSeats}`;
  console.log(eventInfo);

  availableSeats--;
  console.log(`A user registered. Remaining Seats: ${availableSeats}`);
};
