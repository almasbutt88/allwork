import React from "react";


const MunroDetail = ({munro}) =>{ //this function will need a data, which is will be a munro

    if(!munro) return "Please select a Munro";
    return(
        <div>
           <h1> {munro.name}</h1>

        </div>


    )


}
export default MunroDetail;