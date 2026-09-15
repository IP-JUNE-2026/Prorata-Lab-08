import java.util.Scanner;

public class IT24101005Lab8Q1A {

	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		
		int[] myArray = new int[5];
		
		System.out.println("Enter 5 Numbers:");
		for(int i = 0; i < myArray.length; i++){
			System.out.print("Enter Number"+ " " + (i + 1)+":");
			myArray[i] = input.nextInt();
		}
		System.out.println("\nArray in Reverse order:");
        for (int i = myArray.length-1; i>=0; i--){
			System.out.print(myArray[i]+" ");
		}		
		System.out.println();
	}
}