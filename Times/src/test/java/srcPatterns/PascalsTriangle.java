package srcPatterns;

import java.util.Scanner;

public class PascalsTriangle {

	public static void main(String[] args) {
		//	n=5
		//	    1 
		//	   1 1 
		//	  1 2 1 
		//	 1 3 3 1 
		//	1 4 6 4 1 

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++)
		{
			for (int space=1;space<=n-i;space++)
			{
				System.out.print(" ");
			}
			int x=1;
			for (int j=1;j<=i;j++)
			{
				System.out.print(x+" ");
				x=x*(i-j)/j;

			}
			System.out.println();
		}
	}

}
