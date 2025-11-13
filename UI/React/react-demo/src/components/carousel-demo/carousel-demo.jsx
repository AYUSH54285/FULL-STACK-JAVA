import axios from "axios";
import { useState,useEffect,useRef } from "react";
export function CarouselDemo(){

    const[product,setProduct] = useState({id:0, title:null, image:null, description:null, category:null, price:0, rating:{rate:0,count:0}})
    const[status, setStatus] = useState(null);

    let productId = useRef(1);
    let thread = useRef(null);

    function LoadProductManually(id){
        axios(`https://fakestoreapi.com/products/${id}`)  // it is not compulsory to use get
        .then(Response => {
            setProduct(Response.data)
        })
        setStatus('Slide-Show Manual')
    }
    function LoadProductAuto(){
        productId.current = productId.current + 1
        axios.get(`https://fakestoreapi.com/products/${productId.current}`)
        .then(response => {
            setProduct(response.data);
        })
    }

    function handlePrevClick(){
        productId.current = productId.current - 1;
        LoadProductManually(productId.current);
    }
    function handleNextClick(){
        productId.current = productId.current + 1;
        LoadProductManually(productId.current); 
    }
    function handleTrackbarChange(e){
        productId.current = parseInt(e.target.value);
        LoadProductManually(productId.current);
    }
    function handlePlayClick(){
        thread.current = setInterval(LoadProductAuto,3000)
        setStatus("Slide Show - Running")
    }
    function handlePauseClick(){
        clearInterval(thread.current);
        setStatus("Slide Show - Stopped")
    }
    useEffect(()=>{
        LoadProductManually(1);
    },[])

    return (
        <div className="container-fluid">
            <div className="card mt-4 p-2 w-50">
                <div className="card-header text-center overflow-auto" style={{height:'80px'}}>
                    <div>{product.title}</div>
                    <div className="fw-bold">{status}</div>
                </div>
                <div className="card-body row"> 
                    <div className="col-1 d-flex flex-column justify-content-center align-items-center">
                        <button onClick={handlePrevClick} className="bi bi-chevron-left btn btn-dark" ></button>
                    </div>
                    <div className="col-10 position-relative">
                        <img src={product.image} width="100%" height="300"/>
                        <div className="badge bg-danger text-white rounded p-2 fs-6 position-absolute end-0 top-0 rounded-circle">
                            {product.price.toLocaleString('en-us',{style:'currency',currency:'USD'})}
                        </div>
                        <div className="mt-3">
                            <input type="range" onChange={handleTrackbarChange} value={productId.current} className="form-range" min="1" max="20"/>
                        </div>
                    </div>
                    <div className="col-1 d-flex flex-column justify-content-center align-items-center">
                        <button onClick={handleNextClick} className="bi bi-chevron-right btn btn-dark"></button>
                    </div>
                </div>
                <div className="card-footer text-center">
                    <button onClick={handlePlayClick} className="btn btn-success bi bi-play-fill">
                    </button>
                    <button onClick={handlePauseClick} className="btn btn-danger mx-2 bi bi-pause-fill">
                    </button>
                </div>
            </div>
        </div>
    )
}
