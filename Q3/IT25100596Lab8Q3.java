import java.util.Scanner;

public class IT25100596Lab8Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[6];

        for (int i = 0; i < 6; i++) {

            System.out.print("Enter positive number " + (i + 1) + ": ");
            int number = input.nextInt();

            if (number <= 0) {
                System.out.println("Error: Please enter a positive number.");
                i--;
            } else {
                numbers[i] = number;
            }
        }

        int maximum = numbers[0];

        for (int i = 1; i < 6; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }

        System.out.println("Maximum number = " + maximum);
    }
}