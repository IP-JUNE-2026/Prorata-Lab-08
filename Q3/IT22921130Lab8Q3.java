import java.util.Scanner;

public class IT22921130Lab8Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[6];

        int count = 0;

        while(count < 6) {

            System.out.print("Enter a positive number: ");
            int num = input.nextInt();

            if(num > 0) {
                numbers[count] = num;
                count++;
            }
            else {
                System.out.println("Error! Please enter a positive number.");
            }
        }

        int max = numbers[0];

        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Maximum Number = " + max);

        input.close();
    }
}

