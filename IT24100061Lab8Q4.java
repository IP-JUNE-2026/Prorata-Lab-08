import java.util.Scanner;
public class IT24100061Lab8Q4 {
   public static void main (String[] args) {
   
       Scanner input = new Scanner(System.in);
	   int studentsArray[] = new int[8];
	   
	   for(int i=0;i<studentsArray.length;i++){
	    System.out.println("Enter Student ID for Student" + (i+1) + ":");
		int id = input.nextInt();
	   
	    if(id<=0){
			System.out.println("Error: Please Enter ONLY Positive Numbers");
		} else {
            studentsArray[i] = id;
		}
	   }		
       System.out.println();
	   
	   System.out.print("Enter a Student ID to Search:");
	   int searchID = input.nextInt();
	   
	   boolean found = false;
	   for(int i=0; i<studentsArray.length;i++){
		   if(studentsArray[i] == searchID){
			   found = true;
			   break;
		   }
	   }
       System.out.println();

       if(found) {
          System.out.println("Students is Available");
       } else {
          System.out.println("Student is Not Available");
	   }
   }
}
   
  
	   