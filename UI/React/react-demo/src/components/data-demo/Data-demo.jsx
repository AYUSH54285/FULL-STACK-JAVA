import {useState} from 'react';
import { DataGrid } from '../../controlled-components/data-grid';

export function DataDemo(){
    const[layoutName,setLayoutName] = useState("grid");

    function handleLayoutChange(e){
        setLayoutName(e.target.value);
    }

    return(
        <div className='container-fluid'>
            <h1>Date Demo - Conditional Rendering</h1>
            <DataGrid layout='grid' caption='Employee Details' fields={['First Name','Last Name','Designation']} data={[{FirstName:'Raj',LastName:'Kumar',Designation:'Clerk'},{FirstName:'Kiran',LastName:'Kumar',Designation:'Admin'}]} />
            <h2>Products</h2>
            <div className='my-2 w-25'>
                <select onChange={handleLayoutChange} className='form-select'>
                    <option value='grid'>Grid</option>
                    <option value='card'>Card</option>
                </select>
            </div>
            <DataGrid layout={layoutName} caption='Products in Offer' fields={['Name','Price']} data={[{Name:'TV', Price:24000},{Name:'Mobile',Price:12000},{Name:'Watch',Price:2400}]}/>
        </div>
    )
}