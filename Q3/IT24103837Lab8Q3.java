import java.util.Scanner;

public class IT24103837Lab8Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[6];
        int count = 0;

        // Accept exactly 6 positive numbers; reject zero and negatives
        while (count < numbers.length) {
            System.out.print("Enter positive number " + (count + 1) + ": ");
            int value = input.nextInt();

            if (value <= 0) {
                System.out.println("Error: Please enter a positive number.");
            } else {
                numbers[count] = value;
                count++;
            }
        }

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Maximum number: " + max);
        input.close();
    }
}
