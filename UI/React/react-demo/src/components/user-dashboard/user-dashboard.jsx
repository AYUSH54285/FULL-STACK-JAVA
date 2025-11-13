import { useState } from 'react'

export function UserDashboard(){
    const[username,SetUserName] = useState(null);

    function handleNameChange(e){
        SetUserName(e.target.value);
    }

    function handleSigninClick(){
        window.localStorage.setItem("uname",username)
        window.location.reload();
    }

    function handleSignoutClick(){
        window.localStorage.removeItem("uname");
        window.location.reload();
    }

    return(
        <div className='container-fluid'>
            <header className='d-flex align-items-ceter justify-content-between p-3 border border-1 mt-3'>
                <div className='fs-4 fw-bold'>Amazon</div>
                <div>
                    <span>Home</span>
                    <span className='mx-4'>Shop</span>
                    <span>Offers</span>
                </div>
                <div>
                    {
                        (window.localStorage.getItem('uname')===null)
                        ?
                        <div className='input-group'>
                            <input type='text' onChange={handleNameChange} placeholder='User Name' className='form-control' />
                            <button onClick={handleSigninClick} className='btn btn-danger bi bi-person-circle'> Signin </button>
                        </div>
                        :
                        <div>
                        <span className='fw-bold fs-5'>
                            {window.localStorage.getItem("uname")}
                        </span>
                        <button onClick={handleSignoutClick} className='btn btn-danger mx-2'>
                            Signout
                        </button>
                        </div>
                    }
                </div>
            </header>
        </div>
    )
}

