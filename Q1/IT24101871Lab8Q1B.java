import java.util.Scanner;
public class IT24101871Lab8Q1B{
	public static void main(String[]args){
	int i=0,c=0;
	int myArray[] =new int[5];
	int evenArray[] =new int[5];
	Scanner input =new Scanner (System.in);
	System.out.println("Enter 5 Numbers:");
	for(i=0 ;i<myArray.length;i++){
	System.out.print("Enter Number "+(i+1)+": ");
	myArray[i]=input.nextInt();
	}
	
	System.out.println("");
	System.out.println("myArray Contents: ");
		
	for(i=0;i<5;i++){
	System.out.print(myArray[i]+" ");
	}
	for(i=0;i<myArray.length;i++){
	if(myArray[i]%2==0){
	evenArray[c]=myArray[i];
	c++;
	}
	}
	System.out.println("");
	System.out.println("\nevenArray Contents: ");
	
	for(i=0;i<evenArray.length;i++){
	System.out.print(evenArray[i]+" ");
	}
		
	}
}