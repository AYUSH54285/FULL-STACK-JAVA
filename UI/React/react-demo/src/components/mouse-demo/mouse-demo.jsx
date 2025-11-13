
// onMouseOver
// import axios from "axios";
// import {useState,useEffect} from "react";
// import './mouse-over.css';

// export function MouseOver(){
//     const[mobiles,setMobiles] = useState([{img_src:null}]);
//     const[previewImage, setPreviewImage] = useState('m1.png')

//     useEffect(()=>{
//         axios.get('mobiles.json')
//         .then((response)=>setMobiles(response.data))
//     },[]);

//     function handleMouseOver(e){
//         setPreviewImage(e.target.src)
//     }

//     return(
//         <div className="container-fluid">
//             <div className="row mt-4">

//                 <div className="col-1">
//                     {
//                         mobiles.map(mobile => 
//                         <div key={mobile.img_src} className="my-4">
//                             <img onMouseOver={handleMouseOver} className="border-style" width="50" height="50" src={mobile.img_src}/>
//                         </div>
//                         )
//                     }
//                 </div>

//                 <div className="col-11">
//                     <img width="400" height="400" src={previewImage}/>
//                 </div>

//             </div>
//         </div>
//     )
// }



//onMouseDown
// import { useState } from "react";
// import './mouse-down.css';

// export function MouseDown(){

//     const [imageAnimation, setImageAnimation] = useState({animationName:'Spin', animationDuration:'5s', animationIterationCount:'infinite', animationTimingFunction:'Linear'});

//     function handleMouseDown(){
//         setImageAnimation({animationName:'Spin', animationDuration:'1s', animationIterationCount:'infinite', animationTimingFunction:'Linear'})
//     }

//     function handleMouseUp(){
//         setImageAnimation({animationName:'Spin', animationDuration:'5s', animationIterationCount:'infinite', animationTimingFunction:'Linear'})
//     }

//     return(
//         <div className="container-fluid">
//             <div className="d-flex justify-content-center align-items-center" style={{height:'100vh'}}>
//                 <img style={imageAnimation} onMouseDown={handleMouseDown} onMouseUp={handleMouseUp} src='react.svg' width='200' height='200'></img>
//             </div>
//         </div>
//     )
// }




// onMouseMove
import { useState } from 'react'
export function MouseMove(){
    const [imgStyles, setImgStyles] = useState({position:null,left:null, top:null});
    function handleMouseMove(e){
        setImgStyles({
            position:'fixed',
            left : e.clientX + 'px',
            top : e.clientY + 'px'
        })
    }
    return (
        <div onMouseMove={handleMouseMove}>
            <div style={{height:'1000px'}}>
                <h1>Move Mouse Pointer to test</h1>
            </div>
            <img src='flag.gif' style={imgStyles} width="50" height="50"/>
        </div>
    )
}
