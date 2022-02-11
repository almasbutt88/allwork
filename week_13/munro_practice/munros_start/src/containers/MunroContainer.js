import React, { useState, useEffect } from 'react';
import MunroList from '../components/MunroList';
import './MunroContainer.css';
import MunroDetails from '../components/MunroDetail';

const MunroContainer = () => {
    const [munros, setMunros] = useState([]);
    const [selectedMunro, setSelectedMunro] = useState(null);

    useEffect(() => {
      getMunros();
    }, [])
    const getMunros = function(){
        fetch('https://munroapi.herokuapp.com/munros') //we are getting state from here
        .then(res => res.json())
        .then(munros => setMunros(munros))
    }
//lets create a function in our container
    const onMunroSelected = (munro) => {
        console.log("hello");
         setSelectedMunro(selectedMunro);
 }
    return (
        <div className="main-container">
            
            <MunroDetails munro = {selectedMunro}/> 
            <MunroList munros={munros} onMunroSelected = {onMunroSelected}/>  
        </div> //MunroList is a component which is responsible for performing the .map function to return an array of munros. 
    )
}
export default MunroContainer;


//have all the complexity as high up as possible and then have dumb elements lower down.

