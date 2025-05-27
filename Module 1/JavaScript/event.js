function Event(name, date, location, seatsAvailable) {
  this.name = name;
  this.date = date;
  this.location = location;
  this.seatsAvailable = seatsAvailable;
}

Event.prototype.checkAvailability = function() {
  if (this.seatsAvailable > 0) {
    return `${this.seatsAvailable} seats are available for ${this.name}`;
  } else {
    return `Sorry, no seats available for ${this.name}`;
  }
};

const concert = new Event("Rock Concert", "2025-06-15", "Stadium", 150);

console.log(concert.checkAvailability()); 

console.log(Object.entries(concert));
