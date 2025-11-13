import { useState } from "react";
export function ButtonDemo(){

    function handleContextMenu(){
        document.oncontextmenu = function(){
            alert(`right click is not allowed`)
            return false;
        }
    }

    function handleDoubleClick(){
        document.open('m1.png','Mobile','width=400 height=400');
    }

    return(
        <div className="container-fluid " onContextMenu={handleContextMenu}>
            <h2>Button Demo</h2>
            <img src="m1.png" onDoubleClick={handleDoubleClick}/>
            <p>double click to view large image</p>
        </div>
    )
}