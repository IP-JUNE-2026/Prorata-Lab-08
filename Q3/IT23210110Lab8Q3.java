package Question3;

import java.util.Scanner;

public class IT23210110Lab8Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[6];
        int count = 0;
        int max = Integer.MIN_VALUE;

        while (count < 6) {
            System.out.print("Enter a Positive Number (" + (count + 1) + "/6): ");
            int num = scanner.nextInt();

            if (num <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                array[count] = num;
                if (num > max) {
                    max = num;
                }
                count++;
            }
        }

        System.out.println("\nArray Contents:");
        for (int i = 0; i < 6; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nThe Maximum Number Entered: " + max);

        scanner.close();
    }
}
