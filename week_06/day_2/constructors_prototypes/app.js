const Pet = require('./pet.js'); //this is us imp-orting the pet file , requiring and exporting
const Person = require('./person.js');

const scooby = new Pet("Scooby Doo", "Dog")


const shaggy = new Person("Shaggy Rogers", scooby);


shaggy.feedPet("Scooby Snack");

