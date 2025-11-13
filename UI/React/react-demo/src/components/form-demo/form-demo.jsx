// import { useFormik } from "formik";
// export function FormDemo(){

//     const formik = useFormik({
//         initialValues :{
//             UserName:'',
//             Mobile:'',
//             City:'',
//             Gender:''
//         },
//         onSubmit:(user) => {
//             console.log(user);
//         }
//     })
//     return(
//         <div className="container-fluid">
//             <h2>Register User</h2>
//             <form onSubmit = {formik.handleSubmit}>
//                 <dl>
//                     <dt>User Name</dt>
//                     <dd><input type="text" onChange={formik.handleChange} name="UserName"/></dd>
//                     <dt>Mobile</dt>
//                     <dd><input type="text" onChange={formik.handleChange} name="Mobile"/></dd>
//                     <dt>City</dt>
//                     <dd>
//                         <select name="City" onChange={formik.handleChange}>
//                             <option>Choose City</option>
//                             <option>Gurgaon</option>
//                             <option>Noida</option>
//                         </select>
//                     </dd>
//                     <dt>Gender</dt>
//                     <dd>
//                         <input type="radio" onChange={formik.handleChange} name="Gender" value="Male"/>
//                         <label>Male</label>
//                         <input type="radio" onChange={formik.handleChange} name="Gender" value="Female"/>
//                         <label>Female</label>
//                     </dd>
//                 </dl>
//                 <button type="submit" > Register</button>
//             </form>
//         </div>
//     )
// }




// 6/8/25 -> validations
// import { useFormik } from "formik";
// export function FormDemo(){

//     function ValidateForm(formData){
//         var errors = {};

//         //UserName
//         if(formData.UserName.length===0){
//             errors.UserName='User Name Required';
//         }
//         else if (formData.UserName.length < 4) {
//             errors.UserName = 'Name too short';
//         }

//         //Mobile
//         if(formData.Mobile.length===0){
//             errors.Mobile = 'Mobile Required';
//         }
//         else if (!/^\+91\d{10}$/.test(formData.Mobile)) {
//             errors.Mobile = 'Invalid Mobile';
//         }

//         //City
//         if(!formData.City || formData.City === '-1'){
//             errors.City = 'Please select your city'
//         }
        

//         //Gender
//         if(formData.Gender===''){
//             errors.Gender = "Please select the Gender"
//         }
        

//         return errors;
//     }

//     const formik = useFormik({
         
//         initialValues:{
//             UserName:'',
//             Mobile:'',
//             City:'-1',
//             Gender:''
//         },

//         validate : ValidateForm,
//         onSubmit: (user) => {
//             console.log(user)
//         }
//     })

//     return(
//         <div className="container-fluid">
//             <h2>Register User</h2>
//             <form onSubmit={formik.handleSubmit}>
//                 <dl>
//                     <dt>User Name</dt>
//                     <dd><input type="text" onChange={formik.handleChange} name="UserName"/></dd>
//                     <dd className="text-danger">{formik.errors.UserName}</dd>
//                     <dt>Mobile</dt>
//                     <dd><input type="text" onChange={formik.handleChange} name="Mobile"/></dd>
//                     <dd className="text-danger">{formik.errors.Mobile}</dd>
//                     <dt>Your City</dt>
//                     <dd>
//                         <select name="City" onChange={formik.handleChange}>
//                             <option value="-1">Choose City</option>
//                             <option>Delhi</option>
//                             <option>Hyderabad</option>
//                         </select>
//                     </dd>
//                     <dd className="text-danger">{formik.errors.City}</dd>
//                     <dt>Gender</dt>
//                     <dd>
//                         <input type="radio" onChange={formik.handleChange} name="Gender" value="Male"/><label>Male</label>
//                         <input type="radio" onChange={formik.handleChange} name="Gender" value="Female"/><label>Female</label>
//                     </dd>
//                 </dl>
//                 <button type="submit">Register</button>
//             </form>
//         </div>
//     )
// }


// Yup library for Validation( ValidationSchema )
import * as yup from "yup";
import { useFormik } from "formik";

export function FormDemo(){
    const formik = useFormik({
        initialValues:{
            UserName:'',
            Mobile:'',
            City:'',
            Gender:''
        },
        validationSchema: yup.object({
            UserName: yup.string().required('Please enter user name for proceed').min(4,'Name too short'),
            Mobile: yup.string().required('Mobile Required').matches(/\+91\d{10}/,'Invalid Mobile')
        }),
        onSubmit : (user) => {
            console.log(user)
        }
    })
    return(
        <div className="container-fluid">
            <h2>Rgister User</h2>
            <form onSubmit={formik.handleSubmit}>
            <dl>
                <dt>User Name</dt>
                <dd><input type="text" name="UserName" onChange={formik.handleChange}/></dd>
                <dd className="text-danger">{formik.errors.UserName}</dd>
                <dt>Mobile</dt>
                <dd><input type="text" name="Mobile" onChange={formik.handleChange}/></dd>
                <dd className="text-danger">{formik.errors.Mobile}</dd>
                <dt>Your City</dt>
                <dd>
                    <select name="City" onChange={formik.handleChange}>
                        <option value="-1">Choose City</option>
                        <option>Delhi</option>
                        <option>Hyderabad</option>
                    </select>
                </dd>
                <dd className="text-danger">{formik.errors.City}</dd>
                <dt>Gender</dt>
                <dd>
                <input type="radio" onChange={formik.handleChange} name="Gender" value="Male" /> <label>Male</label>
                <input type="radio" onChange={formik.handleChange} name="Gender" value="Female" /> <label>Female</label>
                </dd>
                <dd className="text-danger">{formik.errors.Gender}</dd>
                </dl>
                <button type="submit">Register</button>
            </form>
        </div>
    )
}