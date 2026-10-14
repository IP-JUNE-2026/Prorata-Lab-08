
import java.util.Scanner;

public class IT25100726Lab8Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] myArray = new int[5];
        int[] evenArray = new int[5];
        int count = 0;

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = input.nextInt();
        }

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                evenArray[count] = myArray[i];
                count++;
            }
        }

        System.out.println("Even numbers:");

        for (int i = 0; i < count; i++) {
            System.out.println(evenArray[i]);
        }

        input.close();
    }
}
