import java.util.Scanner;

public class  IT23648340Lab8Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] myArray = new int[5];
        int[] evenArray = new int[5]; // maximum possible size
        int count = 0;

        // Input numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            myArray[i] = input.nextInt();
        }

        // Find even numbers
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                evenArray[count] = myArray[i];
                count++;
            }
        }

        // Print even numbers
        System.out.println("\nEven numbers are:");
        for (int i = 0; i < count; i++) {
            System.out.println(evenArray[i]);
        }

        input.close();
    }
}