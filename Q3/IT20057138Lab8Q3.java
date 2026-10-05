
import java.util.Scanner;

public class IT20057138Lab8Q3 {

    public static void main(String[]args) {

        int[]arr = new int[6];

        System.out.println("Enter the positive 6 numbers");

        Scanner sc1 = new Scanner(System.in);

        int i = 0;

        while (i < 6) {

            int num = sc1.nextInt();

            if (num < 0) {

                System.out.println("Please enter the positive number");
                continue;

            } else {

                arr[i] = num;

            }

            i++;

        }

        int j = 0;

        int max = arr[0];

        while (j < 6) {

            if (arr[j] > max) {

                max = arr[j];

            } else {}

            j++;

        }

        System.out.println("Max value is" + max);

    }

}
