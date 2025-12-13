// import { useState } from "react";
// export function DataBinding(){
//     // var name = 'John';

//     const [getName] = useState('John'); // it is 1 way binding
//     //const [getName,setName] = useState('John'); // it is 2 Way Binding

//     return (
//         <div className="container-fluid">
//             <h2>Data Binding</h2>
            
//             <p>Hello! {getName}</p>
//             <input type="text" value={getName} readOnly/>

//             {/* it is 2 way binding process and here we use the onchange method defined in react */}
//             {/* <input type="text" value={getName} onChange={(e) => setName(e.target.value)}/>  */}

            
//         </div>
//     )
// }



//26/7/25
// Array
// import { useState } from "react";

// export function DataBinding(){
//     const[categories] = useState(['All','Electronics','Fashion','Footwear']);

//     return(
//         <div className="container-fluid">
//             <h1>Array Binding</h1>
//             <header className="border border-1 p-2 d-flex justify-content-between fs-4">
//                 <h3>Amazon</h3>
//                 <nav>
//                     {
//                         categories.map((category,index)=><a className="mx-4" key={index} href="#">{category}</a>)
//                     }
//                 </nav>
//             </header>

//             <ol>
//                 {
//                     categories.map((category,index)=><li key={index}>{category}</li>)
//                 }
//             </ol>

//             <select>
//                 {
//                     categories.map((category,i)=><option key={i}>{category}</option>)
//                 }
//             </select>
            
//             <ul className="list-unstyled">
//                 {
//                     categories.map((category,i)=><li key={i}><input type="checkbox"/><label>{category}</label></li>)
//                 }
//             </ul>
//         </div>
//     )

// }


//Object
// import {useState} from "react";
// export function DataBinding(){
//     const [product] = useState({Id:2, Name:"TV", Price:45000, ShippedTo:['Delhi','Hyd'], Rating:{Rate:4.3, Count:500}});
//     return (
//         <div className="contatiner-fluid">
//             <h2>Product details</h2>
//             <dl>
//                 <dt>Product Id</dt>
//                 <dd>{product.Id}</dd>
//                 <dt>Name</dt>
//                 <dd>{product.Name}</dd>
//                 <dt>Price</dt>
//                 <dd>{product.Price.toLocaleString('en-in',{style:'currency',currency:'INR', minimumFractionDigits:0})}</dd>
//                 <dt>Shipped to Cities</dt>
//                 <dd>
//                     <ul>
//                         {
//                             product.ShippedTo.map((city,i)=><li key={i}>{city}</li>)
//                         }
//                     </ul>
//                 </dd>
//                 <dt>Rating</dt>
//                 <dd>{product.Rating.Rate}<span className="bi bi-star-fill"></span>[{product.Rating.Count}]</dd>
//             </dl>
//         </div>
//     )
// }


// XMLHttpRequest (getting the data from local db.json)

// import { useEffect, useState } from "react";
// export function DataBinding(){
//     const [product,setProduct] = useState({title:'', price:0, image:null, rating:{rate:0,ratings:0,reviews:0}, offers:[]});

//     useEffect(()=>
//     {
//         var http = new XMLHttpRequest();
//         http.open("get","db.json",true);
//         http.send();

//         http.onreadystatechange = function(){
//             if(http.readyState===4){
//                 setProduct(JSON.parse(http.responseText));
//             }
//         }
//     })
//     return (
//         <div className="container-fluid">
//             <div className="row mt-2">
//                 <div className="col-3">
//                     <img src={product.image} width="100%"/>
//                 </div>
//                 <div className="col-9">
//                     <div className="fs-4">{product.title}</div>
//                     <div className="mt-2">
//                         <span className="badge bg-success text-white rounded">{product.rating.rate}<span className="bi bi-star-fill"></span></span>
//                         <span className="text-secondary fw-bold">{product.rating.ratings.toLocaleString()} ratings & {product.rating.reviews} reviews</span>
//                     </div>
//                     <div className="mt-3">
//                         <h5>Available Offers</h5>
//                         <ul className="list-unstyled">
//                             {
//                                 product.offers.map(offer => <li className="bi bi-tag-fill my-3 text-success" key={offer}><span className="text-secondary">{offer}</span></li>)
//                             }
//                         </ul>
//                     </div>
//                 </div>
//             </div>
//         </div>
//     )
// }


// 28/7/25
//using fetch
// import {useEffect, useState} from "react";
// export function DataBinding(){
//     const [product, setProduct] = useState({title:'',price:0,image:null,rating:{rate:0,ratings:0,reviews:0},offers:[]});

//     useEffect(()=>{
//         fetch("db.json")
//         .then(response => response.json())
//         .then(product=>{
//             setProduct(product);
//         })
//     })
//     return (
//         <div className="container-fluid">
//             <div className="row mt-2">
//                 <div className="col-3">
//                     <img src={product.image} width="100%" />
//                 </div>
//                 <div className="col-9">
//                     <div className="fs-4">{product.title}</div>
//                     <div className="mt-2">
//                         <span className="badge bg-success text-white rounded"> {product.rating.rate} <span className="bi bi-star-fill"></span> </span>
//                         <span className="text-secondary fw-bold"> {product.rating.ratings.toLocaleString()} ratings & {product.rating.reviews} reviews </span>
//                     </div>
//                     <div className="mt-3">
//                         <div className="h1">{product.price.toLocaleString('en-in', {style:'currency', currency:'INR', minimumFractionDigits:0})}</div>
//                     </div>
//                     <div className="mt-3">
//                         <h5>Available Offers</h5>
//                         <ul  className="list-unstyled">
//                             {
//                                 product.offers.map(offer=><li className="bi bi-tag-fill my-3 text-success" key={offer}> <span className="text-secondary">{offer}</span> </li>)
//                             }
//                         </ul>
//                     </div>
//                 </div>
//             </div>
//         </div>
//     )
// }


//using axios
// import {useEffect, useState} from "react";
// import axios from "axios";

// export function DataBinding(){
//     const [product,setProduct] = useState({title:null,price:0,image:null,rating:{rate:0,ratings:0,reviews:0},offers:[]});

//     useEffect(()=>{
//         axios.get("db.json")
//         .then(response => {
//             setProduct(response.data); // the actual data (usually JSON)
//             console.log(response);
//         })
//     },[]) //A dependency is a variable (like a piece of state or prop) that the useEffect depends on — meaning, if that value changes, the useEffect should run again.

//     return(
//         <div className="container-fluid">
//             <div className="row mt-2">
//                 <div className="col-3">
//                     <img src={product.image} width="100%" />
//                 </div>
//                 <div className="col-9">
//                     <div className="fs-4">{product.title}</div>
//                     <div className="mt-2">
//                         <span className="badge bg-success text-white rounded"> {product.rating.rate} <span className="bi bi-star-fill"></span> </span>
//                         <span className="text-secondary fw-bold"> {product.rating.ratings.toLocaleString()} ratings & {product.rating.reviews} reviews </span>
//                     </div>
//                     <div className="mt-3">
//                         <div className="h1">{product.price.toLocaleString('en-in', {style:'currency', currency:'INR', minimumFractionDigits:0})}</div>
//                     </div>
//                     <div className="mt-3">
//                         <h5>Available Offers</h5>
//                         <ul  className="list-unstyled">
//                             {
//                                 product.offers.map(offer=><li className="bi bi-tag-fill my-3 text-success" key={offer}> <span className="text-secondary">{offer}</span> </li>)
//                             }
//                         </ul>
//                     </div>
//                 </div>
//             </div>
//         </div>
//     )
// }