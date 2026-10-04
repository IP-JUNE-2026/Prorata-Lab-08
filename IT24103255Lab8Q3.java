import java.util.Scanner;
public class IT24103255Lab8Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[6];
        int count = 0;

        //input numbers into the array
        while (count < 6) {
            System.out.print("Enter a positive Number " + (count + 1)+":");
            int num = input.nextInt();

            //check if the number positive
            if (num > 0) {
                numbers[count] = num;
                count++;
            } else {
                System.out.println("Please Enter ONLY Positive numbers");
            }
        }
        
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("The Maximum number entered : "+max);
    }
}