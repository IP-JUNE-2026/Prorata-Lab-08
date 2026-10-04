import java.util.Scanner;
public class IT24103255Lab8Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] studentArray =new int[8];
        int count = 0;
        ;

        while (count < 8) {
            System.out.print("Enter Student ID for Student " + (count + 1) + ":");
            int num = input.nextInt();

            if (num > 0) {
                studentArray[count] = num;
                count++;

            } else {
                System.out.println("Err0r: Please Enter ONLY Positive Numbers");
            }
        }
        
        System.out.print("Enter aStudent ID to search: ");
        int searchID = input.nextInt();

        boolean found = false;
        for (int i = 0; i < studentArray.length; i++) {
            if (studentArray[i] == searchID) {
                found = true;
                break;
            }
        }

          if (found) {
            System.out.println("Student is Available.");
        } else {
            System.out.println("Student is Not Available.");
        }
    }
}