//defining constructor

function Book(){
    //properties Initilisation
    this.title = 'html';
    this.author='tim';
    this.price=400;

    //METHOD
    this.getBook=function(){
        document.write(`${this.title}&nbsp;${this.author}&nbsp;${this.price}<br>`)
    }    
}


/*
Constructor
		types: 
			> non-parameter constructor 
			> parameter constructor 

Non-parameter constructor 
	constructor created without any parameter is called Non-parameter constructor.
	Adv: used for static initialization of objects, means each and every object was initialized with the same data	
*/
//creating non-parameter constructor
//   function Book()  
//   {				
// 	//properties init
//     this.name = "C Prog";  
//     this.year = 2021;
// 	this.author = "DR"
// 	this.price = 340;
//   }



  /*
parameter constructor 
	constructor created with parameters is called "Parameter constructor".
	Adv:  used for dynamic initialization of objects, means every object initialized with different data
*/
//creating parameter constructor
	 function Book(name="", year="", author="", price=0) // we can also use default parameter values
	 {				
		//properties init
		this.name = name;	//property = parameter
		this.year = year;
		this.author = author;
		this.price = price;
		this.getBook=function(){
			document.write(`<br>${this.name} &nbsp; ${this.year} &nbsp; ${this.author} &nbsp; ${this.price}`);
		}
	  }





