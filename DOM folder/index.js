// let  id = document.getElementById("myid");
// console.dir(id);

// let heading= document.getElementsByClassName("myclass");
// console.dir(heading);

// let header= document.getElementsByTagName("p");
// console.dir(header);

// let h2= document.querySelector("h2");
// console.dir(h2);
// h2.innerText = h2.innerText + "From Apna College";


let divs = document.querySelectorAll(".box");

let idx=1;
for(div of divs){
    div.innerText = `unique value ${idx}`;
    idx++;
    
    
}
