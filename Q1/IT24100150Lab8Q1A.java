import java.util.Scanner;

public class IT24100150Lab8Q1A{
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		int[] myArray = new int[5];
		
		System.out.print("Enter 5 numbers: ");
		
		System.out.println();
		for(int i = 0; i < 5; i++ ){
			System.out.print("Enter number " + (i + 1) + ": ");
			myArray[i] = scanner.nextInt();
			
		}
		
		System.out.println();
		
		System.out.println("Array in Reverse Order: ");
		for(int i = 4; i >= 0; i-- ){
			System.out.print(myArray[i] + " ");
		}
			
		
	}
}