
public class IT25102116Lab8Q2 {

    public static void main(String[] args) {

        int[] A = {10, 20, 30, 40, 50};
        int[] B = {34, 67, 12, 89, 12};

        int[] C = new int[5];

        int i = 0;

        while (i < 5) {

            C[i] = A[i] + B[i];

            i++;
        }

        System.out.println("A Array Contents:");

        i = 0;

        while (i < 5) {

            System.out.print(A[i] + " ");
            i++;
        }

        System.out.println("\n\nB Array Contents:");

        i = 0;

        while (i < 5) {

            System.out.print(B[i] + " ");
            i++;
        }

        System.out.println("\n\nC Array Contents (A + B):");

        i = 0;

        while (i < 5) {

            System.out.print(C[i] + " ");
            i++;
        }
    }
}
