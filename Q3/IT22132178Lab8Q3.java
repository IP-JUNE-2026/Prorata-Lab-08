import java.util.Scanner;

public class IT22132178Lab8Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[6];
        int count = 0;
        while (count < numbers.length) {
            System.out.print("Enter a Positive Number (" + (count + 1) + "/6): ");
            int number = input.nextInt();
            if (number <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                numbers[count] = number;
                count++;
            }
        }
        int maximum = numbers[0];
        System.out.println("Array Contents:");
        for (int number : numbers) {
            System.out.print(number + " ");
            if (number > maximum) {
                maximum = number;
            }
        }
        System.out.println();
        System.out.println("The Maximum Number Entered: " + maximum);
    }
}
