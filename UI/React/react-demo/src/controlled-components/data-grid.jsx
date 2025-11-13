export function DataGrid(props){

    if(props.layout === 'grid'){
        return(
            <table className="table table-hover caption-top">
                <caption>{props.caption}</caption>
                <thead>
                    <tr>
                        {
                            props.fields.map((field, index)=>
                            
                                <th key={index}>{field}
                                    <div className="dropdown d-inline">
                                        <button data-bs-toggle="dropdown" className="bi bi-three-dots-vertical btn"></button>
                                        <ul className="dropdown-menu">
                                            <li className="dropdown-item">
                                                <span className="dropdown-item-text"> Sort Ascending <span className="bi bi-sort-alpha-down"></span> </span>
                                            </li>
                                            <li className="dropdown-item"> 
                                                <span className="dropdown-item-text"> Sort Descending <span className="bi bi-sort-alpha-up"></span> </span> 
                                            </li>
                                            <li className="dropdown-item" >
                                                <span className="dropdown-item-text">Filter<span className="bi bi-flask"></span></span>
                                            </li>
                                        </ul>
                                    </div>
                                </th>
                            )
                        }
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        props.data.map((item,index)=>
                            <tr key={index}>
                                {
                                    Object.keys(item).map((key,index) =>
                                        <td key={index}>{item[key]}</td>
                                    )
                                }
                                <td>
                                    <button className="btn btn-warning bi bi-pen-fill"></button>
                                    <button className="btn btn-danger bi bi-trash-fill mx-2"></button>
                                </td>
                            </tr>
                        )
                    }
                </tbody>
            </table>
        )
    }
    else{
        return(
            <div className="d-flex flex-wrap">
            {
                props.data.map((item,index) => 
                <div className="card m-2 p-2 " style={{width:'200px'}}>
                    <div className="card-header">
                    {
                        Object.keys(item)[0]
                    }
                    </div>
                    <div className="card-body">
                    {
                        item[Object.keys(item)[0]]
                    }
                    </div>
                </div>
                )
            }
            </div>
        )
    }
}