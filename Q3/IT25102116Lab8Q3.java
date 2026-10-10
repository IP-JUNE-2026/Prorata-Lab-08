
import java.util.Scanner;

public class IT25102116Lab8Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] myArray = new int[6];

        int i = 0;

        while (i < 6) {

            System.out.print("Enter a Positive Number (" + (i + 1) + "/6): ");

            int number = input.nextInt();

            if (number <= 0) {

                System.out.println("Error: Please Enter ONLY Positive Numbers");

            } else {

                myArray[i] = number;
                i++;
            }
        }

        int max = myArray[0];

        i = 1;

        while (i < 6) {

            if (myArray[i] > max) {

                max = myArray[i];
            }

            i++;
        }

        System.out.println("\nArray Contents:");

        i = 0;

        while (i < 6) {

            System.out.print(myArray[i] + " ");
            i++;
        }

        System.out.println("\nThe Maximum Number Entered: " + max);
    }
}
