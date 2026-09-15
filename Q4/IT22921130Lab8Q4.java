import java.util.Scanner;

public class IT22921130Lab8Q4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] studentsArray = new int[8];

        int count = 0;

        while(count < 8) {

            System.out.print("Enter Student ID " + (count + 1) + ": ");
            int id = input.nextInt();

            if(id > 0) {
                studentsArray[count] = id;
                count++;
            }
            else {
                System.out.println("Error! Student ID must be positive.");
            }
        }

        System.out.print("\nEnter Student ID to search: ");
        int searchID = input.nextInt();

        boolean found = false;

        for(int i = 0; i < studentsArray.length; i++) {
            if(studentsArray[i] == searchID) {
                found = true;
                break;
            }
        }

        if(found) {
            System.out.println("Student is Available");
        }
        else {
            System.out.println("Student is Not Available");
        }

        input.close();
    }
}