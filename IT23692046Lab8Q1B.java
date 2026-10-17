import java.util.Scanner;

public class IT23692046Lab8Q1B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declare myArray of size 5
        int[] myArray = new int[5];

        // Input numbers via the keyboard
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            myArray[i] = scanner.nextInt();
        }

        // First, count how many even numbers are in myArray to size evenArray appropriately
        int evenCount = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                evenCount++;
            }
        }

        // Declare evenArray with a size equal to the number of even elements found
        int[] evenArray = new int[evenCount];

        // Store even numbers into evenArray
        int index = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                evenArray[index] = myArray[i];
                index++;
            }
        }

        // Print the contents of evenArray
        System.out.println("\nEven numbers stored in evenArray:");
        if (evenCount > 0) {
            for (int i = 0; i < evenArray.length; i++) {
                System.out.print(evenArray[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("No even numbers were entered.");
        }

        scanner.close();
    }
}