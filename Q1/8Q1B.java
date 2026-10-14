import java.util.Scanner;

public class 8Q1B {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArray = new int[5];
        int[] evenArray = new int[5];
        int i, j, p = 0, q = 0;

        System.out.println("Enter 5 Numbers:");

        for (i = 0; i <= 4; i++) {
            System.out.print("Enter Number " + i + " : ");
            myArray[i] = input.nextInt();

            if (myArray[i] % 2 == 0) {
                evenArray[p] = myArray[i];
                p++;
            }
        }

        System.out.println("\nmyArray Contents :");

        for (j = 0; j <= 4; j++) {
            System.out.print(myArray[j] + " ");
        }

        System.out.println("\nevenArray Contents :");

        for (q = 0; q <= p; q++) {
            System.out.print(evenArray[q] + " ");
        }
    }
}