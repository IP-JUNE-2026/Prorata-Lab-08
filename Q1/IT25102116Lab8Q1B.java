
import java.util.Scanner;

public class IT25102116Lab8Q1B {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] myArray = new int[5];
        int[] evenArray = new int[5];

        int i = 0;
        int count = 0;

        System.out.println("Please enter 5 numbers:");

        while (i < 5) {

            System.out.print("Enter number " + (i + 1) + " : ");
            myArray[i] = input.nextInt();

            i++;
        }

        i = 0;

        while (i < 5) {

            if (myArray[i] % 2 == 0) {

                evenArray[count] = myArray[i];
                count++;
            }

            i++;
        }

        System.out.println("\nmyArray Contents:");

        i = 0;

        while (i < 5) {

            System.out.print(myArray[i] + " ");
            i++;
        }

        System.out.println("\n\nevenArray Contents:");

        i = 0;

        while (i < 5) {

            System.out.print(evenArray[i] + " ");
            i++;
        }
    }
}
