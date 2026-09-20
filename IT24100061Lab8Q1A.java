import java.util.Scanner;
public class IT24100061Lab8Q1A {
  public static void main (String[] args) {
  
     Scanner input = new Scanner(System.in);
	 
	 int myArray[] = new int[5];
	 
	 System.out.println("Enter 5 Numbers");
	 
	 for(int i=0;i<myArray.length;i++){
	    System.out.println("Enter Number" + (i+1) + ":");
		myArray[i] = input.nextInt();
	}
    System.out.println();
    System.out.println("Array in Reverse Order:");
	
	for(int i=4;i>=0;i--){
	    System.out.println(myArray[i]+"");
	}
   }
 }
 
  