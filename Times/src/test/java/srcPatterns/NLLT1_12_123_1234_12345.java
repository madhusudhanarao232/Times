package srcPatterns;

import java.util.Scanner;

public class NLLT1_12_123_1234_12345 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print(j+" ");	
			}
			System.out.println();
		}
	}

}
