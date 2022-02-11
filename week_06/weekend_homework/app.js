document.addEventListener("DOMContentLoaded", () => {
console.log("Javascript has loaded");


const button = document.querySelector("#button")
button.addEventListener("click", buttonClick);

})

const buttonClick = function (){
const buttonResult = document.querySelector("#button-result");
buttonResult.textContent = "The Server is up and running. You can go ahead and start listing your favourite films!"
}