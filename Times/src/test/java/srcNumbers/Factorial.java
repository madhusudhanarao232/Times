package srcNumbers;

import java.util.Scanner;

public class Factorial {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
	System.out.println("Enter the Number to find Factorial");
	int n=sc.nextInt();
	int f=numberFactorial(n);
	System.out.println("Factorial of "+n+" is "+f);
	test();
	}
	public static int numberFactorial(int x) {
		int fact=1;
		while(x>0) {
		fact*=x;
		x--;
		}
		return fact;
	}
	public static void test() {
		System.out.println();
		System.out.println("Press 1 to continue");
		System.out.println("Press any other number to Stop the programme");
		int num=sc.nextInt();
		if(num==1) {
			main(null);
		}
		else
			System.out.println("<----------( Thank you )---------->");
	}

}
