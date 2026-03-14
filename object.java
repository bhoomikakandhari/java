class calculator{
    int a;
    int b;

    public calculator(int a, int b){
        
    }
    void add(int a, int b){
      System.out.println(a+b);
    }

    void subtract(int a, int b){
        System.out.println(a-b);
    }

    void multiply(int a, int b){
        System.out.println(a*b);
    }

    void divide(int a, int b){
        System.out.println(a/b);
    }
}







public class object {
    public static void main(String[]args){
        calculator c1=new calculator(7,7);
        c1.add(7,7);
         c1.subtract(7,7);
         c1.multiply(7,7);
         c1.divide(7,7);
    }
}
