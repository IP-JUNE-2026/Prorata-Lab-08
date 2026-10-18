public class IT23648340Lab8Q2 {
    public static void main(String[] args) {

        int[] A = {10, 20, 30, 40, 50};
        int[] B = {34, 67, 12, 89, 12};
        int[] C = new int[5];

        // Add elements of A and B and store in C
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] + B[i];
        }

        // Display Array A
        System.out.print("Array A: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        // Display Array B
        System.out.print("Array B: ");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();

        // Display Array C
        System.out.print("Array C (A + B): ");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
    }
}