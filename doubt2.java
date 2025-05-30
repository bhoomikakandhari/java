import java.util.Scanner;  

public class doubt2 {  

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter the number of rows for Pascal's Triangle: ");  
        int rows = scanner.nextInt();  

        // Generate Pascal's Triangle  
        for (int i = 0; i < rows; i++) {  
            // Print leading spaces for formatting  
            for (int j = 0; j < rows - i; j++) {  
                System.out.print(" ");  
            }  
            // Calculate and print the values in the row  
            int number = 1; // The first value in each row  
            for (int j = 0; j <= i; j++) {  
                System.out.print(number + " ");  
                number = number * (i - j) / (j + 1); // Update number for the next value in the row  
            }  
            // Move to the next line after printing each row  
            System.out.println();  
        }  

        scanner.close();  
    }  
}