import java.util.Scanner;

public class IT20057138Lab8Q4 {

    public static void main(String[]args) {

        int[]studentsArray = new int[8];

        System.out.println("Enter the poitive 8 numbers");

        Scanner sc1 = new Scanner(System.in);
        int i = 0;

        while (i < 8) {

            int num = sc1.nextInt();

            if (num < 0) {

                System.out.println("Enter the positive number please");
                continue;

            }

            studentsArray[i] = num;

            i++;

        }

        System.out.println("Enter the StudentID");

        int newID = sc1.nextInt();

        int k = 0;

        while (k < 8) {
            if (studentsArray[k] == newID) {

                System.out.println("Available");

            } else {
                //                System.out.println("Number is not found");
            }

            k++;

        }
    }
}
