import java.util.Scanner;

public class IT24104018Lab8Q4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] studentsArray = new int[8];
        int count = 0;

        // Input 8 valid Student IDs
        while (count < 8) {

            System.out.print("Enter Student ID " + (count + 1) + ": ");
            int studentID = input.nextInt();

            if (studentID <= 0) {
                System.out.println("Error! Student ID must be positive.");
            }
            else {
                studentsArray[count] = studentID;
                count++;
            }
        }

        // Enter Student ID to search
        System.out.print("Enter Student ID to search: ");
        int searchID = input.nextInt();

        boolean found = false;

        // Search the array
        for (int i = 0; i < studentsArray.length; i++) {

            if (studentsArray[i] == searchID) {
                found = true;
                break;
            }
        }

        // Display result
        if (found) {
            System.out.println("Student is Available");
        }
        else {
            System.out.println("Student is Not Available");
        }

        input.close();
    }
}