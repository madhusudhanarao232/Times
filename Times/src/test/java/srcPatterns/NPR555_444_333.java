package srcPatterns;

import java.util.Scanner;

public class NPR555_444_333 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=1;j--) {
			System.out.print(i+" ");	
			}
			System.out.println();
		}
	}

}
