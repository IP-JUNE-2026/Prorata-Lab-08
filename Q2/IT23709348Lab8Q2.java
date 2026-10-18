public class IT23709348Lab8Q2 {
    public static void main(String[] args) {
        int[] A = {10, 20, 30, 40, 50};
        int[] B = {34, 67, 12, 89, 12};
        int[] C = new int[5];
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] + B[i];
        }
        System.out.println("A + B = C");
        for (int i = 0; i < C.length; i++) {
            System.out.println(A[i] + " + " + B[i] + " = " + C[i]);
        }
    }
}
