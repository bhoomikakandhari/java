import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number :");
        int num = in.nextInt();
        int reversed = 0;

        while(num != 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num/10;

        }
        System.out.println("reversed number :" + reversed);
        
        
    }
    
}
