package test;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        // Create a Random object to generate a random number of rows
        Random random = new Random();
        int numRows = random.nextInt(15) + 1; // Random number between 1 and 15

        // Print the multiplication table
        System.out.println("Multiplication Table");
        System.out.println("--------------------");

        // Outer loop for rows
        for (int i = 1; i  <= numRows; i++) {
            // Inner loop for columns
            for (int j = 1; j <= 11; j++) {
                // Calculate and print the product
                System.out.printf("%4d", i * j);
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}