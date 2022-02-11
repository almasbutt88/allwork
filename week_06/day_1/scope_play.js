// var pinCode;

// const secretsFunction = function(){
//     const pinCode = [5,4,3,9];
 
// }

// secretsFunction()
// console.log(pinCode);

//we want to look through a list of names called filterdNames and store it in a variable called students

const filterNames = function(names, letter){
    var filterdNames = []; // is a list

    for (let name of names){ //you can use var but let only exists within the scope of this function, use let in a for loop
        if(name[0] === letter){ //checks the first letter of names against each name in the array
            filterdNames.push(name)
        }
    }
    return filterdNames;
}

var students = ["Alice", "Bob", "Alyssia"]
var filteredStudents = filterNames(students, "A");
console.log(filteredStudents);