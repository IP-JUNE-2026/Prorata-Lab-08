import java.util.Scanner;

public class IT24103837Lab8Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArray = new int[5];

        // Input 5 numbers into myArray
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            myArray[i] = input.nextInt();
        }

        // Print the array in reverse order
        System.out.println("Numbers in reverse order:");
        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.println(myArray[i]);
        }

        input.close();
    }
}
