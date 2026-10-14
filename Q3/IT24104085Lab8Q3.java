import java.util.Scanner;

public class IT24104085Lab8Q3 {
    public static void main(String[] args) {
        int[] numbers = new int[6];
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (count < 6) {
            System.out.print("Enter a positive number: ");
            int input = scanner.nextInt();

            if (input > 0) {
                numbers[count] = input;
                count++;
            } else {
                System.out.println("Error: Please enter a positive number.");
            }
        }

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("The maximum number is: " + max);
    }
}
