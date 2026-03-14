class laptop{
     String name;
     int prize;

public laptop(int p, String n){
    this.name=n;
    this.prize=p;

}

void display(){
    System.out.println(name + "    " + prize);
}
}







 class classes {
    public static void main(String[]args){
        laptop l1=new laptop(5000, "RAM");
        l1.display();
    }
}

