import java.util.Scanner;

public class IT22175670Lab8Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[6];
        int count = 0;

        System.out.println("Enter 6 positive numbers:");

        while (count < 6) {
            System.out.print("Enter a Positive Number (" + (count + 1) + "/6): ");
            int input = scanner.nextInt();

            if (input > 0) {
                numbers[count] = input;
                count++;
            } else {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            }
        }

        // Find the maximum number
        int maxNumber = numbers[0];
        System.out.println("\nArray Contents: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }

        System.out.println("\nThe Maximum Number Entered: " + maxNumber);
            }
}