import java.util.Scanner;

public class 8Q4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] studentsArray = new int[8];
        int sd_no,no,count = 0,max = 0,p_count = 0;

        while(count <= 7){
            System.out.print("Enter Student ID for Stident "+(count+1) + ": ");
            no = input.nextInt();

            if(no <= 0){
                System.out.print("Error: Please Enter ONLY Positive Numbers\n");
                continue;
            }
            else{
                studentsArray[count] = no;
                count++;
            }
        }
        System.out.print("\nEnter a Student ID to Search: ");
        sd_no = input.nextInt();
        
        while(p_count <= 7){
            if(studentsArray[p_count] == sd_no){
                System.out.print("\nStudent is Available");
                return;}

            else if(studentsArray[p_count] != sd_no){
                System.out.print("\nStudent is Not Available");
                return;
            }
            else{p_count++;
            }
        }
    }
}
