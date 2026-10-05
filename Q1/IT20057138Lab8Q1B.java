import java.util.Scanner;
import java.util.Arrays;

public class IT20057138Lab8Q1A {

    public static void main(String[]args) {

        int i = 0;

        int[]myArray = new int[5];

        int[]evenarray = new int[5];

        System.out.println("Enter the 5 number");

        Scanner sc1 = new Scanner(System.in);

        while (i < 5) {

            myArray[i] = sc1.nextInt();

            i++;

        }
        int j = 4;
        /*while (j >= 0) {

        System.out.println("User given inputs are" + myArray[j]);
        j--;

        }*/
        int k = 0;
        int sum = 0;

        while (k < 5) {

            if (myArray[k]
                 % 2 == 0) {

                evenarray[k] = myArray[k];
                sum++;

            } else {

                // System.out.println("not even number" + myArray[k]);

            }

            k++;

        }
        int m = 0;

        while (m < 5) {

            System.out.println("numbers are" + evenarray[m]);

            m++;

        }

    }

}
