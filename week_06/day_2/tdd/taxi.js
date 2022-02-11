const Taxi = function(manufacturer, model, driver){
    this.manufacturer = manufacturer
    this.model = model;
    this.driver = driver;
    this.passengers = []; //because our list is empty, we dont want to initialise it at the top on line 1
};

Taxi.prototype.numberOfPassengers = function(){
    return this.passengers.length;
};
Taxi.prototype.addPassenger = function(passenger){
    this.passengers.push(passenger)
}
Taxi.prototype.removeByName = function(passenger){
    const indexOfPassenger = this.passengers.indexOf(passenger);
    this.passengers.splice(indexOfPassenger, 1) // splice cuts and changes the original list
}
Taxi.prototype.removeAllPassengers = function (){
    this.passengers.splice(0, this.numberOfPassengers())
}



module.exports = Taxi;


//Add a driver property to our taxi. This should be a String containing the driver's name.

// Write a test to ensure that our taxi has a driver.
// Add a driver property to the taxi.


//Employing TDD, add the following methods to your taxi:

// numberOfPassengers
// addPassenger
// removePassengerByName
// removeAllPassengers

// A passenger should be represented as a String containing the passenger's name.
