import java.util.Scanner;

public class IT22619976Lab8Q4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] studentsArray = new int[8];
        int i = 0;

        // Enter 8 Student IDs
        while (i < 8) {

            System.out.print("Enter Student ID for Student " + (i + 1) + ": ");
            int studentID = input.nextInt();

            if (studentID <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                studentsArray[i] = studentID;
                i++;
            }
        }

        // Search Student ID
        System.out.print("Enter a Student ID to Search: ");
        int searchID = input.nextInt();

        boolean found = false;

        for (i = 0; i < 8; i++) {
            if (studentsArray[i] == searchID) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }
    }
}