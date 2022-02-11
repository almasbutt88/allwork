const assert = require("assert");
const Taxi = require('../taxi.js'); //.. indicates going up a level


describe('Taxi', function(){ //taxi is just a string here, you can call it anything but makes sense to name it after your file
    let taxi;
    beforeEach(function(){ // you are setting a default value so the test is always against this
        taxi = new Taxi("Toyota", "Prius", "Almas"); //this is the range now
    }) // 
    it('should have a manufacturer', function(){
        // const taxi = new Taxi("Toyota", "Prius"); // called range
        const actual = taxi.manufacturer //called actual
        assert.strictEqual(actual, "Toyota"); //called assert
    }); //it should do something, triggers the function
    it('should have a model', function(){ // putting x in front of it would skip the test
        
        const actual =  taxi.model
        assert.strictEqual(actual, "Prius");
    });

    it('should have a driver', function(){
       
        const actual = taxi.driver
        assert.strictEqual(actual, "Almas")
    });

describe("passengers", function(){
    it("should start with no passengers", function(){
        const actual = taxi.passengers;
        assert.deepStrictEqual(actual, [])
    });

    it("should show number of passengers", function(){
        const actual = taxi.numberOfPassengers();
        assert.deepStrictEqual(actual, 0)
    });

    it("should be able to add passengers", function(){
        taxi.addPassenger("Nicole"); // creating a new function called addPassenger
        const actual = taxi.numberOfPassengers(); // adding nicole to taxi with that function
        assert.deepStrictEqual(actual, 1)
    });

    it("should be able to remove a passenger by name", function(){
        taxi.addPassenger("Nicole");
        taxi.addPassenger("Andrew");
        taxi.removeByName("Nicole");
        const actual = taxi.passengers;
        assert.deepEqual(actual, ["Andrew"]);
    });
    it("should be able to remove all passengers from the taxi", function(){
        taxi.addPassenger("Nicole");
        taxi.addPassenger("Andrew");
        taxi.removeAllPassengers();
        const actual = taxi.numberOfPassengers();
        assert.strictEqual(actual, 0); //assert equal because you wa
    }
       
    )
});
});

//describe takes two parameters, the file you are testing, Taxi,  and a function

//Employing TDD, add the following methods to your taxi:

// numberOfPassengers
// addPassenger
// removePassengerByName
// removeAllPassengers

// A passenger should be represented as a String containing the passenger's name