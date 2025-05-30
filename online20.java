public class online20 {
    public static void main(String[] args) {
        for(int i =5; i>=1; i--){
            for(int j =1; j<=5-i; j++){
                System.out.print(" ");
            }
             for(int k=1; k>=1; k--){
                System.out.print(k);
            }
            for(int k=2; k<=i; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
    
}
