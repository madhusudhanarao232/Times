package srcNumbers;

import java.util.Scanner;

public class PerfectCheck {
	static Scanner sc=new Scanner(System.in);
	public static boolean isPerfect(int num) {
		int sum=0;
		for(int i=1;i<num;i++) {
		if(num%i==0) {
			sum=sum+i;
		}
		}
		if(sum==num) 
			return true;
			else 
			return false;
	}

	public static void main(String[] args) {
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		boolean b=isPerfect(n);
		if(b==true) {
			System.out.println(n+" is Perfect Number");
		}
		else {
			System.out.println(n+" is not a Perfect Number");
		}	
test();
	}
	
	public static void test() {
		System.out.println();
		System.out.println("Press 1 to continue in same Program");
		System.out.println("Press any other number to stop the Program");
		int n=sc.nextInt();
		if (n==1) {
			main(null);	
		} else {
System.out.println("Thank you...!");
		}
	}
}
