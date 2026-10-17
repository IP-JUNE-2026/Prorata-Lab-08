public class IT22889942Lab8Q2 {
    public static void main(String[] args) {
        int[] A = {10, 20, 30, 40, 50};
        int[] B = {34, 67, 12, 89, 12};
        int[] C = new int[5];

        // Compute C = A + B
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] + B[i];
        }

        // Print A
        System.out.println("A Array Contents:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        // Print B
        System.out.println("\nB Array Contents:");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();

        // Print C
        System.out.println("\nC Array Contents (A + B):");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
        System.out.println();
    }
}