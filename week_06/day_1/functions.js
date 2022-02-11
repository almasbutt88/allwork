function sayHello(greeting, name = "World"){//here you are passing a default value to the function incase no parameter is passed
    return `${greeting} ${name}`;
}
// }

// console.log(sayHello("Hello", "Almas")); //you could do hoisting and declare this before your function but that is bad practice. Code will still work
// console.log(sayHello());

var add = function (num1, num2){ //its a variable storing a function, not a first class object like a function, arrays, objects etc.

    return num1+ num2;
};
    
console.log(add(1, 5));

var multiply = (num1, num2) => { //arrow function is also an anonymous function - ie has no name for function

    return num1 * num2;
};
var multiply = (num1, num2) => num1 * num2; // expressed arrow function, named, anonymous, arrow, named function can do hoisting
console.log(multiply(5,5));

//const scope is block. Let block. var global. Dont use var anymore. use const.
// const cant be updated, cant be redeclared, cant be declared without initialisation.
//let scope is block. updated yes, redeclared no, declared without initialisation yes.

