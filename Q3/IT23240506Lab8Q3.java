import java.util.Scanner;

public class IT23240506Lab8Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[6];
        int count = 0;

        // get 6 positive numbers
        while (count < 6) {
            System.out.print("Enter a Positive Number (" + (count + 1) + "/6): ");
            int input = sc.nextInt();

            if (input > 0) {
                numbers[count] = input;
                count++;
            } else {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            }
        }

        // print array elements
        System.out.println("\nArray Contents:");
        for (int i = 0; i < 6; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // find max number
        int max = numbers[0];
        for (int i = 1; i < 6; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("The Maximum Number Entered: " + max);
    }
}