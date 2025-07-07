// defining named functions

/* 
Stack Area Frame : where functions contains after calling and execute line by line and after execution it will delete from SAF
 paramenters and arguments will delete from SAF after execution

*/ 
function add(x,y){ // if you want to pass more parameters then used array
    return x+y;
}
function isPrime(n){
    let flag = true;
    for(let i=2 ; i<=n/2 ;i++){
        if(n%i==0){
            flag =false;
            break;
        }
    }
    return flag?'Prime number':'not a prime number';
}