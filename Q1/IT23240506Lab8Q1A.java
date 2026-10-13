import java.util.Scanner;

public class IT23240506Lab8Q1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myArray = new int[5];

        System.out.println("Enter 5 Numbers:");
        
        // reading inputs
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            myArray[i] = sc.nextInt();
        }

        System.out.println("\nArray in Reverse Order:");
        // printing in reverse
        for (int i = 4; i >= 0; i--) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
    }
}