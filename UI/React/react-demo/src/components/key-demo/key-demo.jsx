import axios from "axios";
import { useState, useEffect } from "react";

export function KeyDemo(){

    const[users, setUsers] = useState([{user_id:null}])
    const[msg, setMsg] = useState(null)
    const[ErrorClass, setErrorClass] = useState(null)
    const[pwdStatus, setPwdStatus] = useState(null)
    const[styleObj, setStyleObj ] = useState(null)
    const[progressClass, setProgressClass] = useState(null)

    function LoadUsers(){
        axios.get('users.json')
        .then(response => {
            setUsers(response.data)
        })
    }

    useEffect(()=>{
        LoadUsers();
    })

    function VerifyUser(e){
        const value = e.target.value.trim();
        const alphabetRegex = /^[A-Za-z]+$/;

        if(!alphabetRegex.test(value)){
            setMsg("❌ Username must contain only alphabets (no spaces or numbers)");
            setErrorClass("text-danger");
            return;
        }
        for(var user of users){
            
            if(user.user_id===value ){
                setMsg("User Id is Already exist- Try Another!!")
                setErrorClass("text-danger")
                break;
            }
            else{
                setMsg("User Id valid :)")
                setErrorClass("text-success")
            }
        }
    }
    function VerifyPassword(e){
        var regExp = /(?=.*[A-Z])\w{4,15}/;
        if(e.target.value.match(regExp)){
            setPwdStatus("Strong Password")
            setStyleObj({width:'100%'})
            setProgressClass('progress-bar bg-success progress-bar-striped progress-bar-animated')
        }
        else{
            if(e.target.value.length<4){
                setPwdStatus("Poor Password")
                setStyleObj({width:'20%'})
                setProgressClass('progress-bar bg-danger progress-bar-striped progrees-bar-animated')
            }
            else{
                setPwdStatus("Weak Password")
                setStyleObj({width:'50%'})
                setProgressClass('progress-bar bg-warning progress-bar-striped progress-bar-animated')
            }
        }
    }

    return(
        <div className="container-fluid">
                <h2>Register User</h2>
                <dl className="w-25">
                    <dt>User Id</dt>
                    <dd><input type="text" onKeyUp={VerifyUser}></input></dd>
                    <dd className={ErrorClass}>{msg}</dd>
                    <dt>Password</dt>
                    <dd><input type="password" onKeyUp={VerifyPassword}></input></dd>
                    <dd>
                        <div className="progress">
                            <div className={progressClass} style={styleObj}>
                                {pwdStatus}
                            </div>
                        </div>
                    </dd>
                </dl>
        </div>
    )
}