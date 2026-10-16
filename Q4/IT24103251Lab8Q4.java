import java.util.Scanner;

public class IT24103251Lab8Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] studentsArray = new int[8];
        int count = 0;

        // insert 8 student IDs (same idea as Q3)
        while (count < 8) {
            System.out.print("Enter Student ID " + (count + 1) + " : ");
            int id = sc.nextInt();

            if (id <= 0) {
                System.out.println("Error! ID must be a positive number.");
            }
            else {
                studentsArray[count] = id;
                count++;
            }
        }

        System.out.print("Enter Student ID to search : ");
        int key = sc.nextInt();

        // check the array one by one (linear search)
        boolean found = false;
        for (int i = 0; i < 8; i++) {
            if (studentsArray[i] == key) {
                found = true;
            }
        }

        if (found == true) {
            System.out.println("Student is Available");
        }
        else {
            System.out.println("Student is Not Available");
        }
    }
}