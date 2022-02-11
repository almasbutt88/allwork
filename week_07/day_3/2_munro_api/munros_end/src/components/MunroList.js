import React from 'react';
import ListItem from './ListItem';

const MunroList = ({munros, onMunroClick}) => {
//The Munros data is passed down to the MunroList component as props.
//This is a ul and for each munro in the array of munros that have been
//passed down as props a ListItem component is rendered.
    const munrosItems = munros.map((munro, index) => {
      return <ListItem munro={munro} key={index} onMunroClick={onMunroClick} />
    })

  return (
    <div>
    <ul>
      {munrosItems}
    </ul>
  </div>
  )
}

export default MunroList;