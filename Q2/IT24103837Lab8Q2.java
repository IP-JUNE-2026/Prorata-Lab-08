public class IT24103837Lab8Q2 {
    public static void main(String[] args) {
        int[] A = {10, 20, 30, 40, 50};
        int[] B = {34, 67, 12, 89, 12};
        int[] C = new int[5];

        // Add corresponding elements of A and B and store in C
        for (int i = 0; i < C.length; i++) {
            C[i] = A[i] + B[i];
        }

        System.out.println("Array C (A + B):");
        for (int i = 0; i < C.length; i++) {
            System.out.println(C[i]);
        }
    }
}
