import java.util.Scanner;

public class IT25102116Lab8Q1{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int[] myArray = new int[5];
		
		int i = 0;
		
		System.out.println("Please enter 5 numbers:");
		
		while ( i<5 ){
			
			System.out.print("Enter number"+(i+1)+" : ");
			myArray[i] = input.nextInt();
			
			i++;
			
		}
		
		System.out.println("\nThe numbers you entered are Reverse :");
		
		i=4;
		
		while (i >= 0){
			
			System.out.print(myArray[i]+ " ");
			
			i--;
			
		}
		
		
		
		
	}
	
}