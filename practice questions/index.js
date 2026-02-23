let DATA ="secret information";

class User{
constructor(name,email){
    this.name = name;
    this.email = email;


}

viewData(){
    console.log("data =",DATA);
}
}

let student=new User("Bhoomika","bhoomika@email.com");
let student2=new User("Rishabh","rishabh@email.com");