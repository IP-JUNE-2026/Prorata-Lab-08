import java.util.Scanner;

public class IT24103251Lab8Q1B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] myArray = new int[5];
        int[] evenArray = new int[5];   // biggest possible size is 5
        int count = 0;

        System.out.println("Enter 5 numbers :");
        for (int i = 0; i < 5; i++) {
            myArray[i] = sc.nextInt();
        }

        // find the even numbers and put them into evenArray
        for (int i = 0; i < 5; i++) {
            if (myArray[i] % 2 == 0) {
                evenArray[count] = myArray[i];
                count++;
            }
        }

        // print only the part we filled
        System.out.println("Even numbers :");
        for (int i = 0; i < count; i++) {
            System.out.println(evenArray[i]);
        }
    }
}