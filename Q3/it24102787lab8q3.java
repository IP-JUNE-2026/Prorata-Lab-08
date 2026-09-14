import java.util.Scanner;

public class it24102787lab8q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] myArray = new int[6];
        int count = 0;

        // Loop
        while (count < 6) {
            System.out.print("Enter a Positive Number (" + (count + 1) + "/6): ");
            int userInput = input.nextInt();

            if (userInput > 0) {
                myArray[count] = userInput;
                count++;
            } else {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            }
        }


        System.out.print("Array Contents: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

        
        int max = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }

        System.out.println("The Maximum Number Entered: " + max);


    }
}
