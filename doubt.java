public class doubt {
    public static void main(String[] args) {  
    int n = 5; // Size of the rhombus  
    
    for (int i = 1; i <= n; i++) {  
        // Print leading spaces for the rhombus shape  
        for (int j = 1; j <= n - i; j++) {  
            System.out.print(" ");  
        }  
        
        // Print the hollow part of the rhombus  
        for (int k = 1; k <= n; k++) {  
            if (k == 1 || k == n || i == n) { // Print '*' for the first and last columns and the last row  
                System.out.print("*");  
            } else {  
                if (i==1) { // Print '*' on the diagonal  
                    System.out.print("*");  
                } else {  
                    System.out.print(" ");  
                }  
            }  
        }  
        System.out.println(); // Move to the next line after finishing a row  
    }  
}
    
}
