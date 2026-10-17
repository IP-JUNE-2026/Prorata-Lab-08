package Lab8;

import java.util.Scanner;

public class IT23692046Lab8Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[6];
        int count = 0;

        System.out.println("Please enter 6 positive numbers:");

        // Loop until 6 valid positive numbers are stored
        while (count < 6) {
            System.out.print("Enter number " + (count + 1) + ": ");
            int input = scanner.nextInt();

            if (input > 0) {
                numbers[count] = input;
                count++;
            } else {
                System.out.println("Invalid input! Zero or negative numbers are not allowed. Please try again.");
            }
        }

        // Find the maximum number in the array
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Display the stored numbers and the maximum value
        System.out.print("\nArray elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + (i < numbers.length - 1 ? ", " : ""));
        }
        
        System.out.println("\nThe maximum number is: " + max);

        scanner.close();
    }
}