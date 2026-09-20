import java.util.Scanner;

public class IT24100061Lab8Q3 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int[] array = new int[6];
        int count = 0;

        while (count < 6) {
            System.out.print("Enter a Positive Number (" + (count + 1) + "/6): ");
            int num = value.nextInt();

            if (num <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                array[count] = num;
                count++;
            }
        }

        System.out.println("\nArray Contents:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("\nThe Maximum Number Entered: " + max);
    }
}
