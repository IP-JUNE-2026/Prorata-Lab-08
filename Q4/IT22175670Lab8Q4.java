import java.util.Scanner;
public class IT22175670Lab8Q4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int studentsArray[] = new int [8];
        int count =0;

        while (count<studentsArray.length)
        {
            System.out.print("Enter Student ID for Student "+(count+1)+": ");
            int idNumber = input.nextInt();

            if (idNumber<=0 )
            {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            }
            else 
            {
                studentsArray[count] = idNumber;
                count++;
            }
        }
        
        System.out.println();
        System.out.print("Enter a Student ID to Search: ");
        int searchId = input.nextInt();

        boolean found = false;

        for (int id : studentsArray)
        {
            if(id == searchId)
            {
                found = true;
                break;
            }

        }
        if(found)
        {
            System.out.println();
            System.out.println("Student is Available");
        }
        else 
        {
            System.out.println();
            System.out.println("Student is Not Available");
        }


    }
}