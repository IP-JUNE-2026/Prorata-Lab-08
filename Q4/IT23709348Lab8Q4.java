import java.util.Scanner;

public class IT23709348Lab8Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] studentsArray = new int[8];
        int i = 0;
        while (i < studentsArray.length) {
            System.out.print("Enter Student ID " + (i + 1) + ": ");
            int id = sc.nextInt();
            if (id <= 0) {
                System.out.println("Error! Student ID must be a positive number.");
            } else {
                studentsArray[i] = id;
                i++;
            }
        }

        System.out.print("Enter a Student ID to search: ");
        int search = sc.nextInt();
        boolean found = false;
        for (int id : studentsArray) {
            if (id == search) {
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
