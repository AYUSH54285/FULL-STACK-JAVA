import './login.css';
export function Login(){
    return (
        <main className='main-style'>
            <form className="form-style">
                <h3 className='bi bi-person-circle'>User Login</h3>
                <dl>
                    <dt>User Name</dt>
                    <dd><input type="text" className='form-control' /></dd>
                    <dt>Password</dt>
                    <dd><input type="password" className='form-control' /></dd>
                </dl>
                <button className='btn btn-warning w-100'>Login</button>
            </form>
        </main>
    )
}