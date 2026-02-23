public class palindrome {
    public static void main(String[] args) {
        int a=121;
        int b=0;
        int c=a;
        while(a!=0){
            b=b*10+(a%10);
            a=a/10;
        }
        if(c==b){
            System.out.println("a is palindrome");
        }else{
            System.out.println("a is not palindrome");
        }
    }
}
