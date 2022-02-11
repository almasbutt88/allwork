// const Person = function (){
    //dont return anythinng in the constructor function as it will always just return that value
//   this.name = "Shaggy Rogers"; //this acts like self. this.name is like self.name
  //this allows us to change the name by doing it like this.name = "whatever

const Pet = require("./pet");


  //task Assign a pet property in the Person constructor via a parameter

// Add a feedPet method to Person.prototype which:
// Accepts a food parameter
// Outputs a string containing the person and pet's names and the food. For example: 'Shaggy Rogers fed Scooby Doo a Scooby Snack'
// Invokes the pet's eat method and passes the food to it

const Person = function (name, pet){
    this.name = name;
    this.pet = pet;
  
    // this.greet = function(){
    //     console.log(`Hi my name is ${this.name}`);
    // }
}
Person.prototype.feedPet = function(food){
    console.log(`${this.name} fed ${this.pet.name} a ${food}`); // you are just creating a shell of a function here, they will be compiled in the app.js file
    this.pet.eat(food);
}

Person.prototype.greet = function(){ // this greet function is no longer attached to the person, it will just be available as and when we need it.
    console.log(`Hi! My name is ${this.name}`);
}
//the code first checks if shaggy.greet() function has a .greet() method. 
//if it does, it runs shaggy's greet method from there, but if not
//it checks if the prototype has a greet method, and if so, it will run that

const shaggy = new Person("Shaggy Rogers");
// console.log("shaggy:", shaggy.name);
// shaggy.greet();

const Velma = new Person("Velma Dinkley");
// console.log(Velma.name);

// console.log("shaggy's prototype:", Object.getPrototypeOf(shaggy))
// console.log("velma's prototype:", Object.getPrototypeOf(Velma))

module.exports = Person // this exports to our third file app.js where we are importing it
// prints out:
//shaggy's prototype: { greet: [Function (anonymous)] } // greet is a key, function is a value
//velma's prototype: { greet: [Function (anonymous)] }





//Add a name property with the value 'Shaggy Rogers' to the object that is returned from our constructor
//console.log only shaggy's name property instead of the entire object