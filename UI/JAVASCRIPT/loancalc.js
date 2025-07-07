//defining a function for calc interest amount
function calcAmount()
{
  let p,t,r,iamt,tamt;	//local vars
  
  //data coll
  p=+pamt.value;
  t=+time.value;
  r=+roi.value;
  
  //calc's
  iamt=p*t*r/100;
  tamt=p+iamt;
  
  //display op's
  intAmt.innerHTML="Interest Amount	&#8377;"+iamt;   // it allows the string data as well as inner html code
  totAmt.innerHTML="Total Amount	&#8377;"+tamt;
}