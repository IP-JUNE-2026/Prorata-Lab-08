import java.util.Scanner;

public class IT24103837Lab8Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] studentsArray = new int[8];

        // Input 8 positive Student IDs; reject zero and negative values
        for (int i = 0; i < studentsArray.length; ) {
            System.out.print("Enter Student ID " + (i + 1) + ": ");
            int id = input.nextInt();

            if (id <= 0) {
                System.out.println("Error: Student ID must be a positive number.");
            } else {
                studentsArray[i] = id;
                i++;
            }
        }

        System.out.print("Enter Student ID to search: ");
        int searchId = input.nextInt();

        boolean found = false;
        for (int id : studentsArray) {
            if (id == searchId) {
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
