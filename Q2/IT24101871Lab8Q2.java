public class IT24101871Lab8Q2{
	public static void main (String args[]){
	int A[]={10,20,30,40,50};
	int B[]={34,67,12,89,12};
	int C[]=new int [5];
	int i;
	System.out.println("A Array Contents:");
	for(i=0; i<A.length; i++){
	System.out.print( +A[i] +" ");
	}
	System.out.println();
	System.out.println("\nB Array Contents:");
	for(i=0; i<B.length; i++){
	System.out.print(+B[i] +" ");
	}
	System.out.println();
	
	System.out.println("\nC Array Contents (A+B):");
	for(i=0; i<C.length; i++){
	C[i]=A[i]+B[i];
	
	System.out.print(+C[i] +" " );
	}
	}
}