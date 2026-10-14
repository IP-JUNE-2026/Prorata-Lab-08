import java.util.Scanner;

public class IT24104085Lab8Q4 {

 public static void main(String[] args) {

        int[] studentsArray = new int[8];
        Scanner scanner = new Scanner(System.in);
        int count = 0;


        while (count < 8) {
            System.out.print("Enter Student ID for Student " + (count + 1 )+ ": ");
            int input = scanner.nextInt();

            if (input > 0) {
                studentsArray[count] = input;
                count++;
            } else {
                System.out.println("Error: Please Enter only Positive Numbers");
            }
        }
       System.out.println();
        System.out.print("Enter a Student ID to search: ");
        int searchID = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i] == searchID) {
                found = true;
                break;
            }
        }
      
        System.out.println();
        if (found) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }
    }
}
