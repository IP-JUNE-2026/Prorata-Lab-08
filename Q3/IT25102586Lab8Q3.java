import java.util.Scanner;

public class IT25102586Lab8Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[6];
        int count = 0;

        while (count < 6) {
            System.out.print("Enter a Positive Number (" + (count + 1) + "/6): ");
            int input = scanner.nextInt();

            if (input <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                numbers[count] = input;
                count++;
            }
        }

        System.out.println("\nArray Contents:");
        int max = numbers[0];
        for (int num : numbers) {
            System.out.print(num + " ");
            if (num > max) {
                max = num;
            }
        }

        System.out.println("\nThe Maximum Number Entered: " + max);

        scanner.close();
    }
}