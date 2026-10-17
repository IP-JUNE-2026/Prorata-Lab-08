package Lab8;

public class IT23692046Lab8Q2 {
    public static void main(String[] args) {
        // Initialize arrays A, B, and C
        int[] A = {10, 20, 30, 40, 50};
        int[] B = {34, 67, 12, 89, 12};
        int[] C = new int[5];

        // Calculate A + B and store the result in array C
        for (int i = 0; i < 5; i++) {
            C[i] = A[i] + B[i];
        }

        // Display the contents of the arrays
        System.out.print("Array A: ");
        printArray(A);

        System.out.print("Array B: ");
        printArray(B);

        System.out.print("Array C (A + B): ");
        printArray(C);
    }

    // Helper method to print array elements neatly
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        }
        System.out.println();
    }
}