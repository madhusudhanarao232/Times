package srcPatterns;

import java.util.Scanner;

public class NPR11111$00000$111111 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
			System.out.print(i%2+" ");	
			}
			System.out.println();
		}
	}
}
