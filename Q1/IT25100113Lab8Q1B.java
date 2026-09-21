import java.util.Scanner;

public class IT25100113Lab8Q1B {
 public static void main (String[] args) {
 Scanner input = new Scanner (System.in);
	
 int myArray[] = new int[5]; 
 int evenArray[] = new int[5];
 int j=0;
	
 System.out.println("Enter 5 numbers: ");
	
 for (int i=0; i<myArray.length; i++) {
  System.out.print("Enter number " + (i+1) + ": ");
  myArray[i] = input.nextInt();
 }
	
 System.out.println("myArray Contents:");
	
 for (int i=0; i<myArray.length; i++ ) {
  System.out.print(myArray[i] + " ");
 }
	
 System.out.println();
 System.out.println("evenArray Contents:");
	
 for (int i=0; i<myArray.length; i++ ) {
  if (myArray[i]%2==0) {
   evenArray[j] = myArray[i];
   j++;
  } 
 }
 for (int i=0; i<evenArray.length; i++ ) {
 System.out.print(evenArray[i] + " ");
 }
 }
}