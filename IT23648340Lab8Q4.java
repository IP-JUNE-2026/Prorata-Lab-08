import java.util.Scanner;

public class  IT23648340Lab8Q4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] studentsArray = new int[8];
        int count = 0;

        // Input 8 valid Student IDs
        while (count < 8) {
            System.out.print("Enter Student ID " + (count + 1) + ": ");
            int studentID = input.nextInt();

            if (studentID > 0) {
                studentsArray[count] = studentID;
                count++;
            } else {
                System.out.println("Error! Student ID must be greater than zero.");
            }
        }

        // Display stored Student IDs
        System.out.print("\nStudent IDs in Array: ");
        for (int i = 0; i < studentsArray.length; i++) {
            System.out.print(studentsArray[i] + " ");
        }

        // Search for a Student ID
        System.out.print("\n\nEnter Student ID to search: ");
        int searchID = input.nextInt();

        boolean found = false;

        for (int i = 0; i < studentsArray.length; i++) {
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

        input.close();
    }
}