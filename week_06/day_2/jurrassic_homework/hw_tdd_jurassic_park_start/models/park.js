const Park = function(name, ticket_price, visitorsPerDay){
this.name = name;
this.ticket_price = ticket_price;
this.visitorsPerDay = visitorsPerDay;
this.dinos = []
}


Park.prototype.addDino = function(dino){
    this.dinos.push(dino);
}

Park.prototype.removeDino = function(dino){
    const dinoNumber = this.dinos.indexOf(dino);
    this.dinos.splice(dinoNumber, 1);

}

Park.prototype.famousDino = function () {
    let attractiveDino = this.dinos[0];
    for (const dino of this.dinos){
        if(dino.guestsAttractedPerDay > attractiveDino.guestsAttractedPerDay){
            attractiveDino = dino;
        };
  
    return attractiveDino;
    }}

Park.prototype.findSpecies = function(species){
const foundDinos= [];
for (const dino of this.dinos){
    if(dino.species === species){
        foundDinos.push[dino];
    }
    return foundDinos;
}


}



module.exports = Park;