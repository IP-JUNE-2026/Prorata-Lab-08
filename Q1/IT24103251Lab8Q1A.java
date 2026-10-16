import java.util.Scanner;

public class IT24103251Lab8Q1A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] myArray = new int[5];

        // get 5 numbers from the user
        System.out.println("Enter 5 numbers :");
        for (int i = 0; i < 5; i++) {
            myArray[i] = sc.nextInt();
        }

        // print them in reverse order
        System.out.println("Reverse order :");
        for (int i = 4; i >= 0; i--) {
            System.out.println(myArray[i]);
        }
    }
}