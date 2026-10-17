package Lab8;

import java.util.Scanner;

public class IT23692046Lab8Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentsArray = new int[8];
        int count = 0;

        System.out.println("Please enter Student IDs for 8 students (positive numbers only):");

        // Loop until 8 valid positive Student IDs are stored
        while (count < 8) {
            System.out.print("Enter Student ID " + (count + 1) + ": ");
            int input = scanner.nextInt();

            if (input > 0) {
                studentsArray[count] = input;
                count++;
            } else {
                System.out.println("Invalid input! Student ID must be a positive number. Please try again.");
            }
        }

        // Ask user to enter a Student ID to search
        System.out.print("\nEnter a Student ID to search: ");
        int searchId = scanner.nextInt();

        // Search the array
        boolean isAvailable = false;
        for (int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i] == searchId) {
                isAvailable = true;
                break;
            }
        }

        // Display the result based on search status
        if (isAvailable) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }

        scanner.close();
    }
}