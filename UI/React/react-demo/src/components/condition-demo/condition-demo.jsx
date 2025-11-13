import { useState } from 'react';
import { EMICalculator } from '../state-event-demo/state-event-demo';
import { Weather } from '../../controlled-components/weather';

export function ConditionDemo(){

    const[view, setView] = useState(null);

    function handleEMIClick(){
        setView(<EMICalculator />)
    }
    function handleWeatherClick(){
        setView(<Weather />)
    }

    return (
        <div className='container-fluid'>
            <h1>Condition Demo</h1>
            <button onClick={handleEMIClick} className='btn btn-primary'>EMI Calculator</button>
            <button onClick={handleWeatherClick} className='btn btn-warning mx-2'>Weather App</button>

            <hr/>
            <div className='mt-3'>
                {
                    view
                }
            </div>
        </div>
    )
}