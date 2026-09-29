import java.util.Scanner;

public class IT22132178Lab8Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] studentsArray = new int[8];
        int count = 0;
        while (count < studentsArray.length) {
            System.out.print("Enter Student ID for Student " + (count + 1) + ": ");
            int studentID = input.nextInt();
            if (studentID <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                studentsArray[count] = studentID;
                count++;
            }
        }
        System.out.print("Enter a Student ID to Search: ");
        int searchID = input.nextInt();
        boolean found = false;
        for (int studentID : studentsArray) {
            if (studentID == searchID) {
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
