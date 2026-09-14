import java.util.Scanner;

public class it24102787lab8q4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
             //creat array
        int[] studentarray = new int[8];      
        int count=0;


        //get inputs
        while( count<8){
            System.out.print("Enter student ID for student "+(count+1) + " : ");
            int num = input.nextInt();

            //check numbers are positive
            if(num>0){
                studentarray[count]= num;
                count++;
            }
            else{
                System.out.println("Error: Please enter ONLY positive numbers.");
                //error massage
            }
        }

        System.out.println();


        System.out.print("Enter a student ID to search: ");
        int num2 = input.nextInt();

        System.out.println();


        for (int i=0; i< studentarray.length; i++) {

            if (num2 == studentarray[i]) {
                System.out.println("student is available");
                //print output
            }
        }
    }
}