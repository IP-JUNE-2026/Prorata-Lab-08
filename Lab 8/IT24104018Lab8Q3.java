import java.util.Scanner;

public class IT24104018Lab8Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[6];
        int count = 0;

        // Input 6 positive numbers
        while (count < 6) {

            System.out.print("Enter positive number " + (count + 1) + ": ");
            int number = input.nextInt();

            if (number <= 0) {
                System.out.println("Error! Please enter a positive number.");
            }
            else {
                numbers[count] = number;
                count++;
            }
        }

        // Assume first number is maximum
        int maximum = numbers[0];

        // Find maximum number
        for (int i = 1; i < 6; i++) {

            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }

        System.out.println("Maximum number = " + maximum);

        input.close();
    }
}