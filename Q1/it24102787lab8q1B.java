import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 5 numbers:");

        int[] myArray = new int[5];
        int[] evenArray = new int[5];
        int i;
        int count = 0;

        // Input array
        for (i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            myArray[i] = input.nextInt();
        }

        System.out.print("myArray Contents: ");
        for (i = 0; i < 5; i++) {
            System.out.println(myArray[i] + " ");
        }

        // Extract even numbers
        for (i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                evenArray[count] = myArray[i];
                count++;
            }
        }

        // Print even numbers
        System.out.println("Even numbers: ");
        for (i = 0; i < count; i++) {
            System.out.print(evenArray[i] + " ");
        }
    }
}
