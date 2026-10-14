import java.util.Scanner;

public  class 8Q1A{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] myArray = new int[5];
        int i,j;

        System.out.println("Enter 5 Numbers:");    

        for(i = 0 ; i <= 4 ; i++){
            System.out.print("Enter Number " + i + " : ");    
            myArray[i] = input.nextInt();
        }

        System.out.println("\nArray in reverse Order :"); 

        for(j = 4 ; j >= 0 ; j--){
            System.out.print(myArray[j] + " ");    
        }
    }
}