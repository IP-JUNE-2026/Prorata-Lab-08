
import java.util.Scanner;

public class IT25100726Lab8Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] myArray = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = input.nextInt();
        }

        System.out.println("Numbers in reverse order:");

        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.println(myArray[i]);
        }

        input.close();
    }
}
