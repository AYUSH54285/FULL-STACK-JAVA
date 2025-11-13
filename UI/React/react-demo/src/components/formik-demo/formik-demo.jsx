// import {Formik, Form, Field, ErrorMessage } from "formik";
// import * as yup from "yup";

// export function FormikDemo(){
//     return(
//         <div className="container-fluid">
//             <h2>Register User</h2>
//             <Formik initialValues ={{UserName:'',Mobile:''}} 
//                     validationSchema={yup.object(
//                                                     {
//                                                     UserName:yup.string().required('Name Required').min(4,'Name to Short'),
//                                                     Mobile:yup.string().required('Mobile Required').matches(/\+91\d{10}/,'Invalid Mobile number')
//                                                     }
//                                                 ) 
//                                     }
//                     onSubmit={(values)=>{console.log(values)}}>

//                     <Form>
//                         <dl>
//                             <dt>User Name</dt>
//                             <dd><Field type="text" name="UserName"/></dd>
//                             <dd className="text-danger"><ErrorMessage name="UserName"/></dd>

//                             <dt>Mobile</dt>
//                             <dd><Field type="text" name="Mobile"/></dd>
//                             <dd className="text-danger"><ErrorMessage name="Mobile"/></dd>
//                         </dl>
//                         <button type="submit">Submit</button>
//                     </Form>
//             </Formik>
//         </div>
//     )
// }


import {Formik, Form, Field, ErrorMessage} from 'formik';
import * as yup from 'yup';

export function FormikDemo(){
    return (
        <div className='container-fluid'>
            <h2>Register User</h2>
            <Formik initialValues={{UserName:'',Mobile:''}} 
                    validationSchema={yup.object({
                        UserName:yup.string().required('Name Required').min(4,'Name to Short'),
                        Mobile:yup.string().required("Mobile Required").matches(/\+91\d{10}/,'Invalid Mobile Number')
                    })}
                    onSubmit={(values)=>{console.log(values)}}
                    >
                    {
                        form => 
                            <Form>
                                <dl>
                                    <dt>User Name</dt>
                                    <dd><Field type="text" name="UserName" /></dd>
                                    <dd className='text-danger'><ErrorMessage name='username' /></dd>
                                    <dt>Mobile</dt>
                                    <dd><Field type="text" name="Mobile"/></dd>
                                    <dd className='text-danger'><ErrorMessage name='username' /></dd>
                                </dl>
                                <button type='submit' disabled={(form.isValid)?false:true}>Submit</button>
                                <div className='mt-4 text-danger' style={{display:(form.isValid?'none':'block')}}>
                                    <h4>Please check the following errors</h4>
                                    <ul>
                                        {
                                            Object.keys(form.errors).map(key => 
                                                                            <li key={key}> {form.errors[key]} </li>
                                                                        )
                                        }
                                    </ul>
                                </div>
                            </Form>
                    }
            </Formik>
        </div>
    )
}