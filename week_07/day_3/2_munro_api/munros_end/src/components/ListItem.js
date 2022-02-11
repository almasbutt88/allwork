import React from 'react';
import './ListItem.css';
//The ListItem has props of munro.
//This component is rendering the Munro's name as an li
const ListItem = ({munro, onMunroClick}) => {

  const handleClick = function(){
    onMunroClick(munro);
  }


  return <li onClick={handleClick}>{munro.name}</li>
}

export default ListItem;