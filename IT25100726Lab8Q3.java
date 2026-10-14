
import java.util.Scanner;

public class IT25100726Lab8Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[6];
        int i = 0;

        while (i < 6) {
            System.out.print("Enter a positive number: ");
            int num = input.nextInt();

            if (num > 0) {
                numbers[i] = num;
                i++;
            } else {
                System.out.println("Error! Enter a positive number.");
            }
        }

        int max = numbers[0];

        for (int j = 1; j < numbers.length; j++) {
            if (numbers[j] > max) {
                max = numbers[j];
            }
        }

        System.out.println("Maximum number is: " + max);

        input.close();
    }
}
