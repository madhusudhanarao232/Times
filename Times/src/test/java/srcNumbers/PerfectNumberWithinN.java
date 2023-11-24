package srcNumbers;

import java.util.Scanner;
// 6, 28, 496 are perfect numbers
public class PerfectNumberWithinN {
	static Scanner sc=new Scanner(System.in);
	public static boolean isPerfect(int num) {
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum+=i;
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
		int count=0,perfect=0;
		for(int i=1;i<n;i++) {
			boolean b=isPerfect(i);
			if (b==true) {
				count++;
				perfect=i;
			}
			if(perfect==i) {
				System.out.println("Perfect numbers with in "+n);
				System.out.println("Count of "+count+" is -->"+perfect);
			}
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
