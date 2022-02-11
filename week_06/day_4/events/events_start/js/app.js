//first we have an element which is a  document, that is the whole page
//then we have a method, takes two arguements, DOMContentLoaded, and an anonymous function  
//execute code / function

//so three things, Element, Event, Execute code / function

//html dom events website lists all the dom events, like click, input, change etc. 

document.addEventListener('DOMContentLoaded', () => {
  console.log('JavaScript has loaded');

  const button = document.querySelector('#button') //all your elements live in document, we have done 1, element
  button.addEventListener('click', handleButtonClick); //listening for a click event, creating a new function called handleButtonClick which is a reference, dont want it to execute too fast, so its a call back, like a placeholder or a pointer

  document.querySelector('#input').addEventListener("input", handleInput);

  document.querySelector('#select').addEventListener("change", handleSelectChange);

  document.querySelector('#form').addEventListener("submit", handleFormSubmit);

});
const handleButtonClick = function (){
  const resultParagraph = document.querySelector('#button-result'); //we are accessing the element
  resultParagraph.textContent = "That button has now been clicked fo sho"
};

const handleInput = function (event){ // it might appear as e or evt

// console.log(event); // in browser console you can see target being the #input and value is whatever you type, so event.target will take us to the target, and then target.value will take you to the value, like key value pairs
  //get value from input
document.querySelector('#input-result').textContent = `You typed: ${event.target.value}`
// you can do it like document.querySelector(#input). something something. Graeme's idea
  //update text


};

const handleSelectChange = function(e){
  // console.log("selection made") // to test if the logic is working, check in browser console
  document.querySelector('#select-result').textContent = `You selected ${e.target.value}`;
};

const handleFormSubmit = function (e){
e.preventDefault(); //stops the form from executing immediately
// console.log(e.target.first_name.value); //target is coming from the browser console
document.querySelector('#form-result').textContent = `Your name is: ${e.target.first_name.value} ${e.target.last_name.value}`
// you could do the above line as ${this.first_name.value} ${this.last_name.value} but you have to do an anonymous function which means dont pass the e into the function
};

//we have done the button, next we do the input

//we can do the above using THIS keyword

//we need to go to event.target always


// from line 38..if you were to change it to arrow function then on line 60 you need to do this.select.value
const handleSelectChange = ()=>{
  // console.log("selection made") // to test if the logic is working, check in browser console
  document.querySelector('#select-result').textContent = `You selected ${e.target.value}`; // change this to this.select.value, select comes from your index.html where the value is stored, in a select tag
};
//arrow function doesnt take context or reference from above
//anonymous function takes its reference from above where we do document.querySelector