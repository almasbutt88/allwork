document.addEventListener('DOMContentLoaded', () => { //method on document object, first arguement which event we are listening out for and 2nd is our call back with an arrow function
// console.log("Yo world")// will print in the browser console using js engine built into browser. we arent running node here like we did for all the testing\
const title = document.querySelector('h1'); // this will return the first h1 tag and you are saving it in the title variable
title.textContent = "Javascript says hello";
const welcomePara = document.querySelector('#welcome-paragraph');
welcomePara.textContent = "Absolutely not welcome!";   


const listItems = document.querySelectorAll('li'); // will return all list items as a node list
console.dir(listItems);

// const obj = {
//     userName: "Almas",
//     password: "securepw",
// //     account: "premium" 
// }
// console.table(obj); // useful to view your obj in a table form, makes it more readable
// console.log(obj);
// console.dir(obj);

const redElement = document.querySelector('li.red'); // .red to access the class, #red to access id
redElement.textContent = "changed to black";

//if you wanted to access the second red element you could do li.red inside query selector

//create a new DOM element // just coz we create a new dom element, doesnt mean it is attached to anything
const newListItem = document.createElement('li'); //dom element is created which is a list
//Prepare the DOM element
newListItem.textContent = "Purple";
newListItem.classList.add('purple'); // adding css class purple to the list of classes that apply to the newListItem //css class called purple which has been defined in css file as purple
// Access the element that we want to attach it to the ul
newListItem.style = "color: blue"; // colour blue has been added via this inline style. it overwrites whats in html or css
const list = document.querySelector('ul');
// attach the new element to the existing element
list.appendChild(newListItem); //append means add to the end of that list //thing you are adding to is the parent


console.dir(welcomePara);

});
//text


//create , prepare, access and attach. CPAA to create a dom element

//index gets loaded, browser loads dom and gets js file and tries to immediately run the js file but the dom hasnt been created which takes a few micro seconds to happen. 
//so we want to tell the browser, once you have loaded the dom, then run this function
//browser creates an "event" when it has completed creating the dom. call backs are useful for this
//because you can create a function and pass it another function and say run this when the dom is ready
//document.querySelector('#welcome-paragraph');
// document.querySelector('.blue'): // will give us the first element with class of blue, using id is more common though as in the above line with #welcome-paragraph
//document.querySelectorAll('.blue') // will return an array or a node list of all classes that are blue
//document.querySelectorAll('li') // will return an array or a node list of all li's
//document.getElementById('welcome-paragraph) // redundant way, query selectors are better

//react will do a lot of things for us. 

// Task (5 minutes)
// - Use document.querySelector to access the paragraph with the ID 'welcome-paragraph' from the DOM.
// - What is the difference in output when you use console.log and console.dir?





















