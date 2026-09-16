import java.util.Scanner;
public class  IT24102666Lab8Q2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] A = {10, 20, 30, 40, 50};
		int[] B = {34, 67, 12, 89, 12};
		int[] C = new int[5];

		for (int i = 0; i < A.length; i++) {
				C[i] = A[i] + B[i];
		};

		System.out.println("A Array Content: ");
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		};

		System.out.println();
		System.out.println();
		
		System.out.println("B Array Content: ");
		for (int j = 0; j < C.length; j++) {
			System.out.print(B[j] + " ");
		};

		System.out.println();
		System.out.println();

		System.out.println("C Array Content (A + B): ");
		for (int z = 0; z < C.length; z++) {
			System.out.print(C[z] + " ");
		};

		System.out.println();
		System.out.println();
	}

	}