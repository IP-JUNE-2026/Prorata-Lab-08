import java.util.Scanner;

public class IT23240506Lab8Q1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myArray = new int[5];
        int[] evenArray = new int[5];

        System.out.println("Enter 5 Numbers:");
        
        // input numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            myArray[i] = sc.nextInt();
        }

        // find even numbers
        int index = 0;
        for (int i = 0; i < 5; i++) {
            if (myArray[i] % 2 == 0) {
                evenArray[index] = myArray[i];
                index++;
            }
        }

        // print myArray
        System.out.println("\nmyArray Contents:");
        for (int i = 0; i < 5; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

        // print evenArray
        System.out.println("\nevenArray Contents:");
        for (int i = 0; i < 5; i++) {
            System.out.print(evenArray[i] + " ");
        }
        System.out.println();
    }
}