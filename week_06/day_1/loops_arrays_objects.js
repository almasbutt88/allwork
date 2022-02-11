/* lists are called arrays in js , slice wouldnt modify original array, splice will. Slice will return
the 2 values you tell it to remove and return. slice(1, 3) will remove items at index 1 and 3 and return them
to you.
if you do slice(2), it will remove and return to you everything from index 2 onwards.
splice will do the same but modify the original list*/


// var  sports = ["football", "basketball", "baseball", "hockey"];
// var numberOfElements = sports.length;
// console.log(numberOfElements);
// var firstSport = sports[0];
// console.log(firstSport)
// sports.push("snooker");
// console.log(sports);
// sports.pop();
// console.log(sports);
// sports.shift(); // removes the first element of the array
// console.log(sports);
// sports.unshift(); // adds an element to the beginning of the array
// console.log(sports);
// var removedSport = sports.splice(1, 2) // removes the sport at index 2 , and 1 indicates how many indexes to delete
// console.log(removedSport);

// for (var sport of sports){
//     var upperCaseSport = sport.toUpperCase();
//     console.log(upperCaseSport);
// }
//same result achived by the following for loop
// for (var i = 0; i < sports.length; i++){ // start at 0, for as long as i is less than length of sports array, increment i by 1 in each cycle
//     var currentSport = sports[i];
//     var upperCase = currentSport.toUpperCase();
//     console.log(upperCase);
//}

var movie = {
    title: "It's a wonderful life",
    year: 1946,
    language: "Spanish",
};

console.log(movie["title"]); // bracket notation to access values of an object
console.log(movie.title); // dot notation to do the same, object.key

movie.cast = ['James Stewart', "Donna Reed"];
movie.language = "English";
//movie.subtitle-language = "Spanish"; wont work because of the -
movie["subtitle-language"] = "Spanish;"
console.log("Movie:", movie);

// delete movie.year;
movie.ratings = {
crictics:94,
audience: 80,
}; // ratings is one object doesnt matter how many things it hsa inside it
console.log("new line ----------------");
console.log(movie.ratings.audience);
console.log("new line ----------------");
for (var key in movie){
    var value = movie[key];
    console.log(`The ${key} is ${value}`); // this is the formatting function
}
console.log("new line ----------------");

var banana = Object.keys(movie); // var banana can be called anything, it has nothing to do with Object.keys(movie);
console.log(banana);

