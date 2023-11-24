package srcPatterns;

import java.util.Scanner;

public class NULT$11111_2222_333_44_5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
			System.out.print(i+" ");	
			}
			System.out.println();
		}
	}


}
