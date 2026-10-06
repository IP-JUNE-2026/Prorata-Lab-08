public class IT22643490_Lab8Q2 {

    public static void main(String[]args) {

        int[]A = {
            10,
            20,
            30,
            40,
            50
        };

        int[]B = {
            34,
            67,
            12,
            89,
            12
        };

        int[]C = new int[5];
		
		int i=0;

        while (i < 5) {

            C[i] = A[i] + B[i];
			
			i++;

        }
		
		int j=0;
		
		while(j<5){
			
			System.out.println(C[j]);
			
			
			j++;
			
		}
		

    }

}
