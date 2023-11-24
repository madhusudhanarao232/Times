package srcPatterns;

import java.util.Scanner;

public class NLLT$1_21_321_4321_54321 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=i;j>=1;j--) {
			System.out.print(j+" ");	
			}
			System.out.println();
		}
	}

}
