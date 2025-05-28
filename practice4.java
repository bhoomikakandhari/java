import java.util.Scanner;
public class practice4 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        System.out.println("enter a number (n):");
        int n =in.nextInt();

       // if(num % 2==0){
         //   System.out.println("even");
       // }else{
        //    System.out.println("odd");
      //  }

     // if(num>0){
      //  System.out.println("positive");
     // }else if(num<0){
      //  System.out.println("negative");
      // } else{
     //   System.out.println("zero");
     // }
     //System.out.println("numbers from 1 to" + n + ":");
    // for(int i = 1; i<= n; i++){
       // System.out.println( i +" ");
    // }
    int sum = 0;
    int i = 1;
    while(i<=n){
        sum += i;
        i++;
    }
    System.out.println("sum of first" + n + "natural munber is" +sum);
    }
    
}
