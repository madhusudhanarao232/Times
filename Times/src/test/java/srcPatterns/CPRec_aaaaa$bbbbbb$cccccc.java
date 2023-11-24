package srcPatterns;

import java.util.Scanner;

public class CPRec_aaaaa$bbbbbb$cccccc {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			System.out.print((char)(i+96)+" ");	
		}
		System.out.println();
	}
  }
}
