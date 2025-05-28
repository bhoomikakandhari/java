public class EmojiPyramid {
    public static void main(String[] args) {
        int rows = 5; // You can change this for a bigger pyramid
        
         // Unicode for 

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces for alignment
            for (int j = i; j < rows; j++) {
                System.out.print("  ");
            }

            // Print emojis with space
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("❤️");
            }

            // Move to next line
            System.out.println();
        }
    }
}
