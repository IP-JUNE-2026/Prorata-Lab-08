import java.util.Scanner;
public class IT24102666Lab8Q1A {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] myArray = new int[5];
        int numbers;
        int count = 0;
        
        System.out.println("Enter 5 Numbers: ");
        
        while (count<5) {
            
            System.out.print("Enter Numbers " + (count+1) + ": ");
            myArray[count] = input.nextInt();
            count++;

        }
        
        System.out.println();
        System.out.println("Array in Reverse Order: ");
        for (int i = 4; i >= 0; i--) {
            System.out.print(myArray[i] + " ");

        }
        

    }
}