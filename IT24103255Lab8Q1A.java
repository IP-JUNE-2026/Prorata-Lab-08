import java.util.Scanner;

public class IT24103255Lab8Q1A {
    public static void main(String[] args) {
        int[] myArray = new int[5];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 5 numbers");

        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Number" + (i + 1) + ":");
            myArray[i] = sc.nextInt();
        }

        System.out.println("Array in reverse order");

        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.print(myArray[i]+" ");
        }
    }
}