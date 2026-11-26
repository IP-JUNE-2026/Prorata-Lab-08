import java.util.Scanner;

public class IT23394124Lab8Q2 {
    public static void main(String[] args) {
        int[] A = {10,20,30,40,50};
        int[] B = {34,67,12,89,12};
        int[] C = new int[5];

        for(int i=0;i<A.length;i++){
         C[i] = A[i] + B[i];

        }
        
       
       System.out.println();
       System.out.print("A Array content:");
       for(int i = 0; i< A.length ; i++){

          System.out.println(A[i] + "");
       }

       System.out.println();
       System.out.print("B Array content:");
       for(int i = 0; i< B.length ; i++){

          System.out.println(B[i] + "");
       }
      
       System.out.println();
       System.out.print("C Array content(A + B):");
       for(int i = 0; i< C.length ; i++){

          System.out.println(C[i] + "");
       }
      
    }
}