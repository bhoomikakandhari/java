public class sum1 {
    public static void main(String[] args) {
        int a = 123;
        int orginal= a;
       // int res = 0;

       // while(a>0){
        //    int digit = a%10;
         //   res = res * 10 + digit;
         int sum =0;

         while(a>0){
            int digit = a%10;
            sum= sum +digit;
            a=a/10;
         }
         System.out.println(sum);


        }

    }

    

