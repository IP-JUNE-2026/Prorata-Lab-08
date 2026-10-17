import java.util.Scanner;

public class IT22889942Lab8Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[6];
        int count = 0;    // how many valid numbers stored so far

        System.out.println("Enter 6 positive numbers:");

        while (count < 6) {
            System.out.print("Enter Number " + (count + 1) + ": ");
            int num = input.nextInt();

            if (num <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
                continue;   // do not store, do not count
            }

            numbers[count] = num;
            count++;
        }

        // Find maximum
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("\nThe Maximum number is: " + max);

        input.close();
    }
}