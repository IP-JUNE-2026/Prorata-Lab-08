import java.util.Scanner;
public class IT24101871Lab8Q1A{
	public static void main (String args[]){
	int myArray[]=new int [5];
	int i;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 5 Numbers: ");
	
	for(i=0; i<myArray.length; i++){
	System.out.print("Enter Number " +(i+1) +": ");
	myArray[i]=sc.nextInt();
	}
	System.out.println(" ");

	System.out.println("Array in Reverse Order:");
	for(i=4;i>=0;i--){
	System.out.print(myArray[i]+" ");
	}
	

	}
}