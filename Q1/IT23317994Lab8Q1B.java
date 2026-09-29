import java.util.Scanner;

public class IT23317994Lab8Q1B
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int[] myArray = new int[5];
        int[] evenArray = new int[5];

        int evenCount = 0;

        for (int i = 0; i < 5; i++)
        {
            System.out.print("Enter number " + (i + 1) + ": ");
            myArray[i] = input.nextInt();

            if (myArray[i] % 2 == 0)
            {
                evenArray[evenCount] = myArray[i];
                evenCount++;
            }
        }

        System.out.println("Even numbers:");

        for (int i = 0; i < evenCount; i++)
        {
            System.out.print(evenArray[i] + " ");
        }
    }
}