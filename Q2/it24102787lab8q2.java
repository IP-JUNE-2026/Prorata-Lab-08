public class it24102787lab8q2 {
    public static void main(String[] args) {
        //  arrays A and B
        int[] A = {10, 20, 30, 40, 50};
        int[] B = {34, 67, 12, 89, 12};
        int[] C = new int[5]; 

        
        System.out.print("A Array Contents: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        
        System.out.print("B Array Contents: ");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();

        // Calculate A + B 
        System.out.print("C Array Contents (A + B): ");
        for (int i = 0; i < C.length; i++) {
            C[i] = A[i] + B[i];
            System.out.print(C[i] + " ");
        }
        System.out.println();
    }
}
