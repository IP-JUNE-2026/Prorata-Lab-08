
import java.util.Scanner;

public class IT22344038Lab8Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[6];

        for (int i = 0; i < 6; ) {
            System.out.print("Enter positive number "
                    + (i + 1) + ": ");

            int num = input.nextInt();

            if (num <= 0) {
                System.out.println("Error: Enter a positive number.");
            } else {
                numbers[i] = num;
                i++;
            }
        }

        int max = numbers[0];

        for (int i = 1; i < 6; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Maximum number: " + max);

        input.close();
    }
}
