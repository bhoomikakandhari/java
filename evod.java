public class evod {
    public static void main(String[] args) {
        int a=123;
        int b=0;
        while(a!=0){
          b=a%10;
          if(b%2==0){
            System.out.println(b+"is even");
          } else{
            System.out.println(b+"is odd");
          }
          a=a/10;
        }
    }
}
