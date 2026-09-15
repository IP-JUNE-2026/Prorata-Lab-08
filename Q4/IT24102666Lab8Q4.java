import java.util.Scanner;

public class IT24102666Lab8Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] A = new int[8];
        int count = 0;
        int stdID;
        int search;
        boolean availablity = false; // Initialized to false

        while (count < 8) {
            System.out.print("Enter Student ID (" + (count + 1) + "/8) :");
            stdID = input.nextInt();

            if (stdID <= 0) {
                System.out.println("Enter ONLY Positive Numbers");
                continue;
            } else {
                A[count] = stdID;
                count++;
            }
        }

        System.out.print("Enter a Student ID to Search: ");
        search = input.nextInt();

        // Search logic updated with break
        for (int i = 0; i < A.length; i++) {
            if (search == A[i]) {
                availablity = true;
                break; // Stop searching once found
            }
        }

        if (availablity) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }
        
        input.close();
    }
}
