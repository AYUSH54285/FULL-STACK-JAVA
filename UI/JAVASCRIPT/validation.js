//defining a function for data validation

//const frm=document.forms[0];

document.querySelector("#f1").addEventListener("submit", checkData );

function checkData(frm)
{
  //fullname checking
  const fnaexp=/^[a-zA-Z ]*$/;
  const fn=document.querySelector("#fna").value;
  if(fnaexp.test(fn)===false || fn===""){
	document.querySelector("#errfna").innerHTML=`plz enter a valid name`;
	frm.preventDefault();  //don't submit
  }else
    document.querySelector("#errfna").innerHTML=``;

  //phone checking
  const phexp=/^[6-9]\d{9}$/;
  const p=document.querySelector("#ph").value;
  if(phexp.test(p)===false){
	document.querySelector("#errph").innerHTML=`plz enter a valid contact number`;
	frm.preventDefault();  //don't submit
  }else
    document.querySelector("#errph").innerHTML=``;

  //PINCODE	 checking
  const pcexp=/^\d{6}$/;
  const pc=document.querySelector("#pin").value;
  if(pcexp.test(pc)===false){
	document.querySelector("#errpin").innerHTML=`plz enter a valid pincode`;
	frm.preventDefault();  //don't submit
  }else
    document.querySelector("#errpin").innerHTML=``;

  //password checking
  const pwexp=/^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%&*]).{8,20}$/;
  const pw=document.querySelector("#pwd").value;
  if(pwexp.test(pw)===false){
	document.querySelector("#errpwd").innerHTML=`pw should be comb of lower,upper,digit and symbol`;
	frm.preventDefault();  //don't submit
  }else
    document.querySelector("#errpwd").innerHTML=``;  
} //end fun