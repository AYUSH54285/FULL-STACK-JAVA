/*

Expressional Function syntax : function(args){    (but it is old feature of JS and it support this keyword)
                                 statemnets
                                }
Arrow Functions : (args)=>{               ( it is new feature of JS(Ecma Script) and it support this keyword)
                    statements
                }

Note-1. Both of these functions are anynomus functions beacuse both have no name.
2. As we know functions and array are non primitive datatypes and we know array has reference it means funcition has also refernce variable.
3. We can access the anynomus function with refernace variable.
4. We call these funcitons to perform callbacks
5. sending anynomus function as a parameter with funcitons is known as CALLBACKS or defining the function as parameters in any function is also called 'CALLBACKS'.
6. we perform CALLBACKS beacuse to extend the functionality and add additional logic to existing functions.
 */

//defining expr funcitons
const add = function(x,y){
                return x+y;
            }

const product = function(x,y){
                return x*y;
            }