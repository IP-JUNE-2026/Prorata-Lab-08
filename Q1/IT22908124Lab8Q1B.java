import java.util.Scanner;

public class IT22908124Lab8Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArray = new int[5];
        int[] evenArray = new int[5];
        int evenCount = 0;

        System.out.println("Enter 5 Numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            myArray[i] = input.nextInt();
            if (myArray[i] % 2 == 0) {
                evenArray[evenCount] = myArray[i];
                evenCount++;
            }
        }

        System.out.println();
        System.out.println("myArray Contents:");
        for (int i = 0; i < 5; i++) {
            System.out.print(myArray[i]);
            if (i < 4) {
                System.out.print(" ");
            }
        }
        System.out.println();

        System.out.println();
        System.out.println("evenArray Contents:");
        for (int i = 0; i < 5; i++) {
            System.out.print(evenArray[i]);
            if (i < 4) {
                System.out.print(" ");
            }
        }
        System.out.println();

        input.close();
    }
}
