import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

        int[] myArray = new int[5];

        System.out.println("Enter 5 numbers:");

        // Input numbers into the array
        int i = 0;

        while (i < 5) {
            myArray[i] = sc1.nextInt();
            i++;
        }

        // Print numbers in reverse order
        System.out.println("Numbers in reverse order:");

        int j = 4;

        while (j >= 0) {
            System.out.println(myArray[j]);
            j--;
        }
    }
}
