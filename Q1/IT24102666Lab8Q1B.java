import java.util.Scanner;
public class IT24102666Lab8Q1B {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] myArray = new int[5];
        int[] evenArray = new int[5];
        int numbers;
        int count = 0;
        int evenNum;
        int index = 0;
        
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
        
        for (int i = 0; i < myArray.length; i++) {
            evenNum = myArray[i];
           
            if (evenNum%2 == 0 ) {
                evenArray[index] = evenNum;
                index++;

            } else {
                continue;
            }
            
        }

        System.out.println();
        System.out.println();
        System.out.println("Even Array Contents:");
        for (int j = 0; j < evenArray.length; j++) {
            System.out.print(evenArray[j] + " ");

}
}
}