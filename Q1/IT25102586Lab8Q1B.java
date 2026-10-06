import java.util.Scanner;

public class IT25102586Lab8Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[5];
        int[] evenArray = new int[5];
        int evenCount = 0;

        System.out.println("Enter 5 Numbers:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            myArray[i] = scanner.nextInt();

            if (myArray[i] % 2 == 0) {
                evenArray[evenCount] = myArray[i];
                evenCount++;
            }
        }

        System.out.println("\nmyArray Contents:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }

        System.out.println("\n\nevenArray Contents:");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenArray[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}