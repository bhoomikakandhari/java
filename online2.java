
import java.util.Scanner;

public class online2 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        
        switch (a) {
            case 1 :
            System.out.println("hello");
                
                break;
                case 2:
                System.out.println("namaste");
                break;
                case 3:
                System.out.println("bonjour");
            default:
                throw new AssertionError();
        }
    }
    
}
