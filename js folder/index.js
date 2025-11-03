// name="bhoomika kandhari";
// console.log(name);
// age=34;
// console.log(age);
// x=null;
// console.log(x);
// y=undefined;
// console.log(y);
// isfollow = true;
// console.log(isfollow);
// let a;
// console.log(a);
// const student ={
//     fullName: "bhoomika kandhari",
//     age : "20",
//     cgpa:8.6,
//     isPass:true,


// };
// student["fullName"] = "archie yadav";
// console.log(student["fullName"]);
// student["age"] = student[age] +1;
// console.log(student["age"]);

//arithemetic operators
// let a = 5;
// let b = 2;

// console.log("a = ", a, "& b = ",b);
// console.log("a + b =", a + b);
// console.log("a - b =", a - b);
// console.log("a * b =", a * b);
// console.log("a / b =", a / b);

//practice question

//  let num = prompt("enter a number :" );
//  if(num % 5 === 0){
//     console.log(num, "is multiple of 5");
//  }else{
//      console.log(num, "is not a multiple of 5");
//  }

// let grade = prompt("enter marks");
// if(grade >=80 && grade <= 100){
//     console.log("grade is A");
// }else if(grade >=70 && grade <= 80){
//     console.log("grade is B");

// }else if(grade >= 60 && grade <= 70){
//     console.log("grade is C");
// }else{
//     console.log("grade is D");
// }

// for(let i = 1; i<=10000; i++){
//     console.log("bhoomika kandhari");
// }
// console.log("loop has ended");

//calculate sum of 1 to 5
// let sum =0;
// for(let i = 1; i<=20 ;i++){
//     sum = sum + i;
// }
// console.log("sum =", sum);

// let i =1;
// while(i<=100){
//     console.log("i=", i);
//     i++;
// }

// let i=1;
// do{
//     console.log("bhoomikaaaa");
//     i++;
// }while(i<=100);

// let str ="bhoomikaaa";
// for( let i of str){
//     console.log("i = ", i);
// }

// let student = {
//     name:"bhoomika kandhari",
//     age : "20",
//     cgpa:"7.6",
//     ispass:"true",
// };
// for(let key in student){
//     console.log("key=", key, "value=" , student[key]);
// }

// let gamenum= 79;
// let usernum= prompt("enter the game number");
// while(usernum != gamenum){
//     usernum = prompt("you entered the wrong number, try again");
// }
// console.log(" CONGATULATIONS , you entered the correct number");

// let fullName= prompt("enter your fullname");
// let username= "@" + fullName + fullName.length;
// console.log(username);

// let marks = [98, 87, 65, 45,55];
// // console.log(marks);

// let heroes= ["ironman", "batman", "spiderman", "hulk", "captain america"];
// for(let idx = 0; idx < heroes.length; idx++){
//     console.log( heroes[idx]);
// }
// for(let idx of heroes){
//     console.log(idx);
// }


// let marks =[85, 97, 44, 37, 76, 60,];
// let sum = 0;
// for( let val of marks){
//     sum= sum + val;
   
// }
// let avg = sum/marks.length;

// console.log(avg);
// let items =[250, 900, 300, 450, 690, 780];
// for(let i =0; i<items.length; i++){
//     let offer = items[i]/10;
//     items[i]-=offer;
// }
// console.log(items);


// let companies=["bloomberg"," microsoft", "uber", "google", "ibm", " netflix"];
// console.log(companies);
//  let deletedcompany =companies.shift();
// console.log(deletedcompany);
// console.log(companies);
// companies.splice(1,1,"ola");
// console.log(companies);
// companies.push("amazon");
// console.log(companies);


// function myfunction(){
//     console.log("this is my function");
//     console.log("i am learning javascript");
// }

// myfunction();
// myfunction();
// myfunction();
// myfunction();
// myfunction();


// function sum( x, y){
//     s = x+y;
//     return s;
// }
// let val = sum(3,56);
// console.log(val);

//arrow functions

// const arrowmul=(a,b) => {
//     return(a * b);

// };


// function string(str){
//     let count = 0;
//     for(const char of str){
//         if(char==="a" || char==="e" || char==="i" || char==="o" || char==="u" ){
//             count++;
//         }
        


//     }
//     console.log(count);
// }


// const countvowels =(str)=>{
//     let count = 0;
//     for(const char of str){
//         if(char==="a" || char==="e" || char==="i" || char==="o" || char==="u" ){
//             count++;
//         }
        


//     }
//     console.log(count)
// }

// let arr=[1,2,3,4,5,6];
// arr.forEach((num) => {
    
//      console.log(num**2);
// });

// let arr =[45, 69, 56];
// let newArr= arr.map((val)=>{
//     return(val**2);
// })

// console.log(newArr);



// let marks = [66,78,56,89,90,96,75,80,98,92,55,43,59];
// let newArr= marks.filter((val)=>{
//     return val>90;
// })
// console.log(newArr);


// let n= prompt("enter a number: ");
// let arr = [];

// for(let i =1; i<=n; i++){
//     arr[i-1]=i;
// }
// console.log(arr);
 
//  let mul= arr.reduce((res, curr)=>{

//     return res * curr;
// })
// console.log(mul);

// let newbtn = document.createElement("button");
// newbtn.innerText = "Click me!!";
// newbtn.style.backgroundColor="red";
// newbtn.style.color="white";
// let body= document.querySelector("body").prepend(newbtn);


// let btn= document.querySelector("#mode");
// let currmode= "light";
// btn.addEventListener("click", ()=>{
//     if(currmode === "light"){
//         currmode= "dark";
//         document.querySelector("body").style.backgroundColor="black";
//     }
//     else{
//         currmode= "light";
//         document.querySelector("body").style.backgroundColor="white";
//     }
//     console.log(currmode);
// })

let boxes= document.querySelectorAll(".box");
let reset = document.querySelector("#reset-btn");
let newgamebtn = document.querySelector("#new-btn");
let msgcontainer=document.querySelector(".msg-container");
let msg=document.querySelector("#msg");

let turnX = true;

const winpattern=[
    [0,1,2],
    [0,4,8],
    [0,3,6],
    [3,4,5],
    [6,7,8],
    [2,4,6],
    [1,4,7],
    [2,5,8],

];

const resetgame=() =>{
    turnX = true;
    enablebox();
    msgcontainer.classList.add("hide");

};

boxes.forEach((box)=>{
    box.addEventListener("click", ()=>{
        console.log("box was clicked");
        if(turnX){
            box.innerText="X";
            turnX=false;
        }else{
            box.innerText="O";
            turnX= true;
        }
        box.disabled=true;
        checkwinner();
    })
})
const disablebox=() =>{
     for(let box of boxes){
        box.disabled=true;
     }
};
const enablebox=() =>{
     for(let box of boxes){
        box.disabled=false;
        box.innerText="";
     }
};
const showWinner=(winner)=>{
      msg.innerText=`Congratulations, winner is ${winner}`;
      msgcontainer.classList.remove("hide");
      disablebox();
};
const checkwinner=() =>{
    for(let pattern of winpattern){
        let pos1val=boxes[pattern[0]].innerText;
        let pos2val=boxes[pattern[1]].innerText;
        let pos3val=boxes[pattern[2]].innerText;
        if(pos1val!="" && pos2val!=""&& pos3val!="" ){
            if(pos1val===pos2val && pos2val===pos3val){
                console.log("winner",pos1val);
                showWinner(pos1val);
            }
        }
    }
};

newgamebtn.addEventListener("click",resetgame);
reset.addEventListener("click",resetgame);