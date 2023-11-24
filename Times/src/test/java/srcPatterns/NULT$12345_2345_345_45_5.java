package srcPatterns;

import java.util.Scanner;

public class NULT$12345_2345_345_45_5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
			System.out.print(j+" ");	
			}
			System.out.println();
		}
	}
}
