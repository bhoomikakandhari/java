class teacher{
    int rollno;
    String name;

    public teacher(int r,String n) {
        this.rollno =r;
        this.name= n;
        
    }

    void details(){
        System.out.println( rollno  +"   " + name);
    }
}







public class student {
   public static void main(String[] args) {
       teacher t1= new teacher(76, "bhoomika");
       teacher t2=new teacher(66, "adiii");
       t1.details();
       t2.details();
   } 
}
