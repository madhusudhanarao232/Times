package srcPatterns;

import java.util.Scanner;

public class SELTRev {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		for (int i=n;i>=1;i--)
		{
			for (int sp=1;sp<=n-i;sp++)
			{
				System.out.print("  ");// 2 space
			}
			for (int j=1;j<=(2*i-1);j++)
			{
				System.out.print(" *");//  1 Space
			
				
			}
			System.out.println();
		}
	}

}
