import React from 'react';
import './ListItem.css';

const ListItem = ({munro, onMunroSelected}) => {
  return <li onClick={ handleClick}>{ munro.name}</li>
}

export default ListItem;