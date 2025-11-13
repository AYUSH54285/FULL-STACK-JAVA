import {useState} from 'react'
import './style-demo.css';

export function StyleDemo(){

    const [imageAnimation] = useState({animationName:'spin', animationDuration:'5s', animationItertionCount:'infinite', animationTimingFunction:'linear', animationDirection:'alternate'})
    return(
        <div className="d-flex justify-content-center align-items-center" style={{height:'100vh'}}>
            <img style={imageAnimation} src="react.svg" width="200" height="200"></img>
        </div>
    )
}