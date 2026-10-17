import java.util.Scanner;

public class IT23692046Lab8Q1A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declare an array of size 5 named myArray
        int[] myArray = new int[5];

        // Input numbers via the keyboard
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            myArray[i] = scanner.nextInt();
        }

        // Print the contents of myArray in reverse order
        System.out.println("\nContents of myArray in reverse order:");
        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}