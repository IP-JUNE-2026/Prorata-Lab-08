import java.util.Scanner;
public class IT24103255Lab8Q1B {
    public static void main(String[] args) {
         int[] myArray = new int[5];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 5 numbers");

        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Number" + (i + 1) + ":");
            myArray[i] = sc.nextInt();
        }

         // Find even numbers and store them in evenArray
        int[] evenArray = new int[myArray.length];
        int evenCount = 0; 

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                evenArray[evenCount] = myArray[i]; 
                evenCount++;
            }
        }

        
        System.out.println("Array in reverse order:");
        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.print(myArray[i] + " ");
        }

        // Print the even numbers in evenArray
        System.out.println("\nEven numbers:");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenArray[i] + " ");
        }

    }
}