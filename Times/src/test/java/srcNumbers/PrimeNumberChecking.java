package srcNumbers;

import java.util.Scanner;

public class PrimeNumberChecking {
	static Scanner sc=new Scanner (System.in);
	public boolean isPrime(int a) {
	for(int i=2;i<a;i++) {
		if(a%i==0) {
			return false;
		}	
	}
	return true;	
	}

	public static void main(String[] args) {
		PrimeNumberChecking p=new PrimeNumberChecking();
		System.out.println("Enter the Number to check the prime or NoT");
		int n=sc.nextInt();
		boolean b=p.isPrime(n);
		if (b==true) {
			System.out.println(n+" is the prime number");
		}
		else {
			System.out.println(n+" is not a prime number");
		}
		
		test();
	}

	public static void test() {
		PrimeNumberChecking p=new PrimeNumberChecking();
		System.out.println();
		System.out.println("Press 1 to continue");
		System.out.println("Press any other number to exit from program");
		int n=sc.nextInt();
		if(n==1) {
		   main(null);
		}
		else {
			System.out.println("<--------Thank you-------->");
		}
		
	}

}
