public class online17 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                if(j==1 ||j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int k=1; k<=2*(5-i); k++){
                System.out.print(" ");
            }
            for(int p=1; p<=i; p++){
                if(p==1 ||p==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=5; i>=1; i--){
            for(int j=1; j<=i; j++){
                if(j==1 ||j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int k=1; k<=2*(5-i); k++){
                System.out.print(" ");
            }
            for(int p=1; p<=i; p++){
                if(p==1 ||p==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}
