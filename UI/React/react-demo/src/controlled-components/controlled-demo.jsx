import { Navbar } from "./navbar";
export function ControlledDemo(){
    return (
        <div className="container-fluid p-3">
            <header className="mt-3">
                <Navbar theme="bg-warning" brandName="Amazon" menuitems={['Home','Shop','Offers','Contact','Business']} />
                <Navbar theme="bg-dark text-white" brandName="Flipkart" menuitems={['Electronic','Fashion','Footwear']} />
            </header>
            <section className="mt-4">
                <h3>Controlled Component</h3>
            </section>
        </div>
    )
}





