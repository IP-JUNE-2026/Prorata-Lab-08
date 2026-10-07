import java.util.Scanner;

public class IT23362758Lab8Q4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int[] studentsArray = new int[8];

        int count = 0;

        while(count < 8)
        {
            System.out.print("Enter Student ID: ");
            int id = input.nextInt();

            if(id <= 0)
            {
                System.out.println("Error! Student ID Must Be Positive");
            }
            else
            {
                studentsArray[count] = id;
                count++;
            }
        }

        System.out.print("\nEnter Student ID to Search: ");
        int searchID = input.nextInt();

        boolean found = false;

        for(int i = 0; i < 8; i++)
        {
            if(studentsArray[i] == searchID)
            {
                found = true;
                break;
            }
        }

        if(found)
        {
            System.out.println("Student is Available");
        }
        else
        {
            System.out.println("Student is Not Available");
        }
    }
}