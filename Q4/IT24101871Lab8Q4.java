import java.util.Scanner;
public class IT24101871Lab8Q4
{
	public static void main(String[]args)
	{
		int studentArray[] = new int [8];
		int i =0;
		int input,index;
	    int find = 0;
		Scanner sc = new Scanner(System.in);
		while(i<studentArray.length)
		{
			System.out.print("Enter Student ID for Student "+(i+1)+": ");
			input = sc.nextInt();
			if(input>0)
			{
				studentArray[i]=input;
				i++;
			}
			else
			{
				System.out.println("Error: Please Enter ONLY Positive Numbers");
			}
				
		}
		System.out.print("\nEnter a Student ID to Search: ");
		index = sc.nextInt();
		for(i=0;i<studentArray.length;i++)
		{
			if( index == studentArray[i])
			{
				find = 1;
				break;
			}	
		}
		
		if(find == 1)
		{
			System.out.println("\nStudent is Available");
		}
		else
		{
			System.out.println("\nStudent is Not Available");
		}
			
		
		
	}
}