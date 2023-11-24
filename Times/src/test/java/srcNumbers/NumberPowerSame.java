package srcNumbers;

import java.util.Scanner;

public class NumberPowerSame {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int res=1;
		for(int i=1;i<=n;i++) {
			res=factNum(i);
			System.out.println(i+"^"+i+" = "+res);
		}
	}
	public static int factNum(int x) {
		int f=1;
		for(int i=x;i>=1;i--) {
		f*=x;	
		}
		return f;		
	}
}
