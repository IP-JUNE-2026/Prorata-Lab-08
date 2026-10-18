import java.util.Scanner;

public class IT23709348Lab8Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[6];
        int i = 0;
        while (i < numbers.length) {
            System.out.print("Enter positive number " + (i + 1) + ": ");
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Error! Please enter a positive number.");
            } else {
                numbers[i] = n;
                i++;
            }
        }
        int max = numbers[0];
        for (int n : numbers) {
            if (n > max) {
                max = n;
            }
        }
        System.out.println("Maximum number: " + max);
    }
}
