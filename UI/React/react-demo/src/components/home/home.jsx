
import { BrowserRouter, Routes, Route, Link } from "react-router-dom"
import { EMICalculator } from "../state-event-demo/state-event-demo"
import { Weather } from "../../controlled-components/weather"
import { CarouselDemo } from "../carousel-demo/carousel-demo"
import { Carousel } from "bootstrap"
export function Home(){
    return (
        <div className="container-fluid">
            <BrowserRouter>
                <header className="mt-3 p-3 border text-center border-1">
                    <h1>React Project - Home</h1>
                    <nav>
                        <span><Link to="/emi" >EMI Calculator</Link> </span>
                        <span><Link to="/weather" >Weather App</Link></span>
                        <span><Link to="carousel">Carousel App</Link></span>
                    </nav>
                </header>
                <section className="mt-4">
                    <Routes>
                        <Route path="/" element={<div>You can Browse your project here...</div>}></Route>
                        <Route path="emi" element={<EMICalculator />}></Route>
                        <Route path="weather" element={<Weather />}></Route>
                        <Route path="carousel" element={<Carousel />}></Route>
                        <Route path="*" element={<div><h1>Sorry - Requested Component Not Found</h1></div>}></Route>
                    </Routes>
                </section>
            </BrowserRouter>
        </div>
    )
}