import { useState,useEffect } from "react";

export function ThrottleDemo(){

    const[timer,setTimer] = useState(null);

    function Clock(){
        const now = new Date();
        setTimer(now.toLocaleTimeString())
    } 

    useEffect(()=>{
        setInterval(Clock,1000);
    },[])

    return (
        <div className="container-fluid">
            <h1 className="mt-4 text-center">{timer}</h1>
        </div>
    )
}