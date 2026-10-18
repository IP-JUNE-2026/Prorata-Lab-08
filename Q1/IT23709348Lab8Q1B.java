import java.util.Scanner;

public class IT23709348Lab8Q1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myArray = new int[5];
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            myArray[i] = sc.nextInt();
        }
        System.out.println("Array in reverse order:");
        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.println(myArray[i]);
        }

        int evenCount = 0;
        for (int n : myArray) {
            if (n % 2 == 0) {
                evenCount++;
            }
        }
        int[] evenArray = new int[evenCount];
        int index = 0;
        for (int n : myArray) {
            if (n % 2 == 0) {
                evenArray[index++] = n;
            }
        }

        System.out.println("Even numbers in myArray:");
        for (int n : evenArray) {
            System.out.println(n);
        }
    }
}
