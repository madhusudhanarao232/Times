package srcPatterns;

import java.util.Scanner;

public class NLLT$5_54_543_5432_54321 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=i;j--) {
			System.out.print(j+" ");	
			}
			System.out.println();
		}
	}


}
