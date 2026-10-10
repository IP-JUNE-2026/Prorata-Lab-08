
import java.util.Scanner;

public class IT25102116Lab8Q4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] studentsArray = new int[8];

        int i = 0;

        System.out.println("Enter 8 Student IDs:");

        while (i < 8) {

            System.out.print("Enter Student ID " + (i + 1) + ": ");

            int id = input.nextInt();

            if (id <= 0) {

                System.out.println("Error: Please enter a positive Student ID");

            } else {

                studentsArray[i] = id;
                i++;
            }
        }

        System.out.print("\nEnter Student ID to Search: ");
        int searchID = input.nextInt();

        boolean found = false;

        i = 0;

        while (i < 8) {

            if (studentsArray[i] == searchID) {

                found = true;
                break;
            }

            i++;
        }

        if (found) {

            System.out.println("Student is Available");

        } else {

            System.out.println("Student is Not Available");
        }
    }
}
