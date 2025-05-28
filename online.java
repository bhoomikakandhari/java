

import java.util.Scanner;
public class online {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int diff = (a*b)/ (a-b);
        System.out.println(diff);

    }
}