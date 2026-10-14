import java.util.Scanner;

public class 8Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] A = {10,20,30,40,50};
        int[] B = {34,67,12,89,12};
        int[] C = new int[5];
        int i,j,k,l;

        for(i=0 ; i <= 4 ; i++){
            C[i] = A[i] + B[i]; 
        }
        
        System.out.print("A Array Contents :\n");
        for(j = 0; j <= 4; j++){
            System.out.print(A[j]+" ");
        }        

        System.out.print("\n\nB Array Contents :\n");
        for(k = 0; k <= 4; k++){
            System.out.print(B[k]+" ");
        }

        System.out.print("\n\nC Array Contents (A + B):\n");
        for(l = 0; l <= 4; l++){
            System.out.print(C[l]+" ");
        }   
    }
}
