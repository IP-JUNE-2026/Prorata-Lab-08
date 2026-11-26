import java.util.Scanner;

public class IT23394124Lab8Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArray = new int[5];
        int[] evenArray = new int[5];

        System.out.println("Enter 5 Numbers:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            myArray[i] = input.nextInt();
        }
        
        int count = 0; 
        for(int i=0 ; i < myArray.length;i++){

         if(myArray[i]%2 ==0){

          evenArray[count] = myArray[i];
          count++;
         }
        }
        
       System.out.println();
       System.out.println("myArray content:");
       for(int i = 0; i< myArray.length ; i++){

          System.out.println(myArray[i] + "");
       }
      
      System.out.println();
       System.out.println("evenArray content:");
       for(int i = 0; i<evenArray.length ; i++){

          System.out.println(evenArray[i] + "");
       }
    }
}