package srcPatterns;

import java.util.Scanner;

public class Zshape {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==n||i==1||i+j==n+1) {
			System.out.print(" *");
			}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
