import java.util.Scanner;

public class  IT23648340Lab8Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[6];
        int count = 0;

        // Input 6 positive numbers
        while (count < 6) {
            System.out.print("Enter a positive number: ");
            int num = input.nextInt();

            if (num > 0) {
                numbers[count] = num;
                count++;
            } else {
                System.out.println("Error! Please enter a positive number greater than zero.");
            }
        }

        // Find maximum number
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Display array contents
        System.out.print("Array Contents: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        System.out.println("Maximum Number: " + max);

        input.close();
    }
}