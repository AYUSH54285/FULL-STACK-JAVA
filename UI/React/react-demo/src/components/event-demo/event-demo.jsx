// 1/8/25
// for achieving two way binding we have to use only the "onChange" event
// import {useState} from 'react';
// export function EventDemo(){
//     const[username, setUserName] = useState('John');
//     function handlerchangeName(e){
//         setUserName(e.target.value);
//     }
//     return (
//         <div className='container-fluid'>
//             <div className='mt-4'>
//                 USER NAME: <input onChange={handlerchangeName} type='text' value={username}></input>
//                 <h2>Hello! {username}</h2>
//             </div>
//         </div>
//     )
// }


// How to pass custom arguments?
// import { useState } from "react";
// export function EventDemo(){

//     const [username, setUserName] = useState();

//     function handleDetailsClick(...product){
//         var[id,name,stock]=product;
//         alert(` id=${id} \n Name=${name} \n Stock=${stock}`);
//     }

//     return (
//         <div className="container-fluid">
//             <button onClick={()=>{handleDetailsClick(1,'John',true)}}>Details</button>
//         </div>
//     )
// }


// How to pass both default and custom arguments?
import { useState } from "react";
export function EventDemo(){
    function handleDetailsClick(e, ...product){
        var[id,name,stock]=product;
        alert(` event_name=${e.target.name} \n id=${id} \n Name=${name} \n Stock=${stock}`)
    }
    return (
        <div className="container-fluid">
            <button onClick={(e)=>handleDetailsClick(e,1,'TV',true)} name='Details' id="btnDetails" >Details</button>
        </div>
    )
}


