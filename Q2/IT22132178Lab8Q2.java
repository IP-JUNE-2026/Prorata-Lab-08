public class IT22132178Lab8Q2 {
    public static void main(String[] args) {
        int[] A = {10, 20, 30, 40, 50};
        int[] B = {34, 67, 12, 89, 12};
        int[] C = new int[5];
        for (int i = 0; i < C.length; i++) {
            C[i] = A[i] + B[i];
        }
        System.out.println("A Array Contents:");
        for (int value : A) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("B Array Contents:");
        for (int value : B) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("C Array Contents (A + B):");
        for (int value : C) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
