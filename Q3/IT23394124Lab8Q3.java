import java.util.Scanner;

public class IT23394124Lab8Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[6];

        // Keep asking for the same position until a positive number is entered
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a Positive Number (" + (i + 1) + "/6):                 ");
            int value = input.nextInt();

            while (value <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
                System.out.print("Enter a Positive Number (" + (i + 1) + "/6): ");
                value = input.nextInt();
            }

            numbers[i] = value;
        }

        // Find the maximum
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println();
        System.out.println("Array Contents:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("The Maximum Number Entered: " + max);
    }
}