function getResult(){
    let hm,cm,jm,bm,tot,avg,grad; //local vars

    //data coll
    hm=+html.value;
    cm=+css.value;
    jm=+bs.value;
    bm=+bs.value;

    //calc's
    tot=hm+cm+jm+bm;
    avg=tot/4;

    //grade checking
    if(hm>39 && cm>39 && jm>39 && bm>39){
        //pass
        grd=avg>=90 ? 'A+' : avg>=80 ? 'A' : avg>=70 ? 'B' : avg>=50 ? 'C' : 'D'; 
    }
    else{
        grd = 'fail';
    }

    //display op's
    total.value='Total Marks '+ tot;
    average.value = 'Average Marks '+avg;
    grade.value = 'Grade '+grd;
}