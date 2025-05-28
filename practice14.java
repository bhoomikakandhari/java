import java.util.Scanner;
public class practice14 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the character");
        char ch = in.next().charAt(0);

        switch(ch){
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            System.out.println(ch +"is a vowel");
            break;
            default :
            System.out.println(ch +"is a consonant");
        }
              

    }
    
}
