import java.util.Scanner;

public class IT24103837Lab8Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArray = new int[5];
        int evenCount = 0;

        // Input 5 numbers into myArray
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            myArray[i] = input.nextInt();
        }

        // Count even numbers so evenArray has the correct size
        for (int number : myArray) {
            if (number % 2 == 0) {
                evenCount++;
            }
        }

        int[] evenArray = new int[evenCount];
        int index = 0;

        // Store even numbers from myArray in evenArray
        for (int number : myArray) {
            if (number % 2 == 0) {
                evenArray[index] = number;
                index++;
            }
        }

        System.out.println("Even numbers in evenArray:");
        for (int number : evenArray) {
            System.out.println(number);
        }

        input.close();
    }
}
