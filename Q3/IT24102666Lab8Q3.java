import java.util.Scanner;
public class  IT24102666Lab8Q3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] A = new int[6];
		int count = 0;
		int num;
		int maxNum = 0;
		
		while (count<6) {
			System.out.print("Enter a Positive Number (" + (count+1) +"/6) :");
			num = input.nextInt();

			if (num < 0) {
				System.out.println("Enter ONLY Positive Numbers");
				continue;
			} else if (maxNum == 0) {
				maxNum = num;
			} else if (num > maxNum) {
				maxNum = num;
			}

			A[count] = num;
			count++;

		}

		System.out.println();
		System.out.println("Array Content: ");
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}

		
		System.out.println();
		System.out.println();
		System.out.println("The Maxinum Number Entered: " + maxNum);
		System.out.println();
				
	}

}

