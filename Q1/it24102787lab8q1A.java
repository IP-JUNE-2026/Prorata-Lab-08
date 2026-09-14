import java.util.Scanner;
public class it24102787lab8q1A{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 5 Number: ");

        int[]  myArray = new int[5];
        int i = 0 ;
        for(i = 0; i<5; i++) {
            System.out.print("Enter the number" + (i + 1) + ":");
           myArray[i] = input.nextInt();
        }

         System.out.println("Array in reverse oder:");

        for (i = 4; i>=0; i--) {
            System.out.print(myArray[i]+ " ");
        }
        
    }
}