// Make your own example of the following high order functions:





// forEach() // should return undefined so you need to do something to make it return a value


// const fruits = ["apples", "peaches", "pairs", "plums"];

// let list = []
// fruits.forEach(function(fruit){
//     list.push(fruit.toUpperCase());
// });
// return list;
// console.log(list);



// map() //array.map(The map() method creates a new array populated with the
//results of calling a provided function on every element in the calling array.

// const arrayB = fruits.map(x => x.toUpperCase());
// console.log(arrayB);

let numbers = [1, 2, 3, 4, 5, 6];
// const multiplyByTwo = function(banana){
//     const result = numbers.map((banana)=> banana*2); //.map creates a new array
//     return result;
// };
// console.log(multiplyByTwo(numbers));






// filter()The filter() method creates a new array with all elements that
//pass the test implemented by the provided function.

// const getEvens = function(arr){
//     const result = arr.filter((number) =>{ // takes your filter and creates new array
//         return number % 2 ===0;//return number where modulo 2 equals 0, no need for if statement coz of truthy falsy
//     });
//     return result;
// };
// console.log(getEvens(numbers));


// const short_list = fruits.filter(alphabet => alphabet.includes("a"));
// console.log(short_list);

// reduce()

const sumNumbers = function (array){
    const total = array.reduce((acc, currentValue) =>{ // accumulator and current value, min it takes is two arguments, you dont need to pass the values of these, it will just go to the array above and take them from there
        return acc + currentValue;
    }, 5); // this is the second part of the reduce function, 5 is the initial value
    return total;
};
console.log(sumNumbers(numbers));

//all these functions take a call back function.
//we never invoke the call back.we invoke the HOF function
//

// YourOwn