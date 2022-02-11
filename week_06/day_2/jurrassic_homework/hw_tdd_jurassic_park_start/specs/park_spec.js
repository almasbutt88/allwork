const assert = require('assert');
const Park = require('../models/park.js');
const Dinosaur = require('../models/dinosaur.js');

describe('Park', function() {
  let park;
  let big;
  let medium;
  let small;

  beforeEach(function () {
  park = new Park("Jurrassic Park", 100, 1000);

  big = new Dinosaur("t-rex", "carnivor", 120);
  medium = new Dinosaur("velociraptor", "carnivore", 55);
  small = new Dinosaur("spinosaurus", "omnivore", 30);

  });

  it('should have a name', function(){
    const actual = park.name
    assert.equal(actual, "Jurrassic Park")
  });

  it('should have a ticket price', function(){
    const actual = park.ticket_price;
    assert.equal(actual, 100);
  });

  it('should have a collection of dinosaurs', function(){
    const actual = park.dinos;
    assert.deepStrictEqual(actual, [])
  });

  it('should be able to add a dinosaur to its collection', function(){
    park.addDino(big);
    const actual = park.dinos;
    assert.deepStrictEqual(actual, [big])
  });

  it('should be able to remove a dinosaur from its collection', function(){
    park.addDino(big);
    park.addDino(medium);
    park.removeDino(big);
    const actual = park.dinos;
    assert.deepStrictEqual(actual, [medium]);
  });

  it('should be able to find the dinosaur that attracts the most visitors', function(){
    park.addDino(big);
    park.addDino(medium);
    park.addDino(small);
    const actual = park.famousDino();
    assert.deepStrictEqual(actual, big);

  });




  it('should be able to find all dinosaurs of a particular species', function(){
    
    park.addDino(big);
    park.addDino(medium);
    park.addDino(small);
    const actual = park.findSpecies(big);
    assert.deepStrictEqual(actual, ["t-rex"])

  });
  

  it('should be able to calculate the total number of visitors per day');

  it('should be able to calculate the total number of visitors per year');

  it('should be able to calculate total revenue for one year');

});
