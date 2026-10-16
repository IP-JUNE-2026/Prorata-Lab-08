import java.util.Scanner;

public class IT24103251Lab8Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[6];
        int count = 0;

        // keep asking until we have 6 positive numbers
        while (count < 6) {
            System.out.print("Enter positive number " + (count + 1) + " : ");
            int num = sc.nextInt();

            if (num <= 0) {
                System.out.println("Error! Number must be positive.");
            }
            else {
                numbers[count] = num;
                count++;
            }
        }

        // assume the first one is the max, then check the rest
        int max = numbers[0];
        for (int i = 1; i < 6; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Maximum number is : " + max);
    }
}