import java.util.Scanner;

public class 8Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] A = new int[6];
        int i,j,n,count = 0,max = 0;

        while(count <= 5){
            System.out.print("Enter a Positive Number ("+(count+1)+"/6): ");
            n = input.nextInt();

            if(n <= 0){
                System.out.print("Error: Please Enter ONLY Positive Numbers\n");
                continue;
            }
            else{
                A[count] = n;
                count++;

                if(n > max){
                    max = n;
                }
            }
        }

        System.out.print("Array Contents:");
        for(j = 0 ; j<= 5;j++ ){
            System.out.print(A[j]+" ");
        } 
        System.out.print("\nThe Maximum Number Enterd : "+max);
    }
}
