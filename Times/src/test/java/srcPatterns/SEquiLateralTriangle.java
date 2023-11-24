package srcPatterns;

import java.util.Scanner;

public class SEquiLateralTriangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int sp=1;sp<=n-i;sp++) {
				System.out.print("  ");
			}
			for(int j=1;j<=(2*i-1);j++) {
			System.out.print(" *");	
			}
			System.out.println();
		}
	}

}
