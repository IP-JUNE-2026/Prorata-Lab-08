import java.util.Scanner;

public class IT23394124Lab8Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] studentsArray = new int[8];

       
        for (int i = 0; i < studentsArray.length; i++) {
            System.out.print("Enter Student ID for Student " + (i + 1) + ": ");
            int id = input.nextInt();

            while (id <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
                System.out.print("Enter Student ID for Student " + (i + 1) + ": ");
                id = input.nextInt();
            }

            studentsArray[i] = id;
        }

        System.out.println();
        System.out.print("Enter a Student ID to Search: ");
        int searchId = input.nextInt();

        
        boolean found = false;
        for (int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i] == searchId) {
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