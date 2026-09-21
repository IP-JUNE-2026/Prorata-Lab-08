import java.util.Scanner;

public class IT25100113Lab8Q4 {
 public static void main (String[] args) {
 Scanner input = new Scanner (System.in);
	
 int studentArray[] = new int[8];
	
 for (int i=0; i<studentArray.length; i++) {
  System.out.print("Enter Student ID for Student " + (i+1) + ":");
  int n = input.nextInt();
  if (n>0) {
   studentArray[i]=n;
  } else {
   System.out.println("Error Please Enter ONLY Positive Numbers");
   i--;
  }
 }
	
 System.out.println();
 System.out.print("Enter a student ID to Search: ");
 int id = input.nextInt();

 for (int i=0; i<studentArray.length; i++) {
  if (id==studentArray[i]) {
   System.out.println();
   System.out.print("Student is Available");
   return;
  } 
 }
 System.out.println();
 System.out.print("Student is Not Available");
 }
}