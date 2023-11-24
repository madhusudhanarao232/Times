package srcPatterns;

import java.util.Scanner;

public class NULT$54321_4321_321_21_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=i;j>=1;j--) {
			System.out.print(j+" ");	
			}
			System.out.println();
		}
	}


}
