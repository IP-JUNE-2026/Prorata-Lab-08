import java.util.Scanner;

public class IT22175670Lab8Q1B  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Arrays for input and even numbers
        int[] myArray = new int[5];
        int[] evenArray = new int[5];

        // Input: Reading numbers into myArray
        System.out.println("Enter 5 Numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            myArray[i] = input.nextInt();

            // Check and store even numbers into evenArray
            if (myArray[i] % 2 == 0) {
                evenArray[i] = myArray[i];
            } else {
                evenArray[i] = 0; // Assign 0 for odd numbers
            }
        }

        // Output: Displaying myArray and evenArray
        System.out.println("\nmyArray Contents:");
        for (int num : myArray) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nevenArray Contents:");
        for (int num : evenArray) {
            System.out.print(num + " ");
        }
    }
}
