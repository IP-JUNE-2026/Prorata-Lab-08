import java.util.Scanner;

public class IT24101005Lab8Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    int [] A = new int[5];
    int [] B = new int[5];
    int [] C = new int[5];
    
    System.out.println("A Array Contents:");
    for (int i = 0; i < A.length; i++) {
        A[i] = scanner.nextInt();
    }

    System.out.println();
    
    System.out.println("B Array Contents:");
    for (int i = 0; i < B.length; i++) {
        B[i] = scanner.nextInt();
    }
    
    System.out.println();

    for (int i = 0; i < A.length; i++) {
        C[i] = A[i] + B[i];
    }
    
    System.out.println("C Array Contents (A + B):");
    for (int i = 0; i < C.length; i++) {
        System.out.print(C[i] + " ");
    }
    System.out.println();

    }

}


    
 