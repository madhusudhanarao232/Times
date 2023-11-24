package srcPatterns;

import java.util.Scanner;

public class NLRT$1_21_321_4321_54321 {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number");
	 int n=sc.nextInt();
	 for(int i=1;i<=n;i++) {
		 for(int sp=1;sp<=n-i;sp++) {
			System.out.print("  "); 
		 }
		 for(int j=i;j>=1;j--) {
			 System.out.print(j+" ");
			 
		 }
		System.out.println();
	 }

	}

}
