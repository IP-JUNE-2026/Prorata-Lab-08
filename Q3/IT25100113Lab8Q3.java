import java.util.Scanner;

public class IT25100113Lab8Q3 {
 public static void main (String[] args) {
 Scanner input = new Scanner (System.in);
	
 int pArray[] = new int[6];
 int max = 0;
	
 for (int i=0; i<pArray.length; i++) {
  System.out.print("Enter a Positive Number (" + (i+1) + "/6): ");
  int n = input.nextInt();
  if(n>0) {
   pArray[i] = n;
  } else {
   System.out.println("Error: Please Enter ONLY Positive Numbers");
   i--;
  }
 }
	
 System.out.println();
 System.out.println("Array Contents:");
	
 for (int i=0; i<pArray.length; i++) {
  System.out.print(pArray[i] + " ");
 }
	
 for (int i=0; i<pArray.length; i++) {
  if (pArray[i]>max) {
   max = pArray[i];
  }
 }
 System.out.println();
 System.out.println("The Maximum Number Entered: " + max);
 }
}