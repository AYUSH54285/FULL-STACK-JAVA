// defining Arrow Funcitons

//AF w/o params & return 
// NOTE -> // arrow function with refernce variable(myfun)           
const myfun = () => {   
                        document.write(`Hi, I am arrow func`);
                    }

//AF with params & explicit return statement
const add = (x,y) => {
                        return x+y;
                    }

//AF with para & implicit return (system is returning not us)
//NOTE - to use implicit return we have to remove the Curly brackets , if we don't remove then we have to use explicit return statement
const product = (x,y) => x*y; // if we have single line of code then we don't need to curly braces and
                             // it is a implit return so we don't need to write the return keyword it will return automaticlly x*y, if we write return keyword in single line then error comes



// AF with 1 param & explicit return
const natSum = n => {    // if we have single paramenters then we don't need brackets
                    return n*(n+1)/2;
                }

//AF with 1 param & implicit return 
const area = r =>  Math.PI*r*r;
// Math.pow
// Math.sqrt(36);
// Math.PI
// Math.E
// Math.log(10)
// Math.log10(10)     






























