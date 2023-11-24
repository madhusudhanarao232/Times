package srcNumbers;

import java.util.Scanner;

public class PrimeNumbersWithinN {
	static Scanner sc=new Scanner (System.in);
	public boolean isPrime(int num) {
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}	
		}
		return true;

	}

	public static void main(String[] args) {
		PrimeNumbersWithinN p=new PrimeNumbersWithinN();
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int count=0,prime = 0;
		if(n<2) {
			System.out.println("Prime number Start From 2");
		}
		System.out.println("Prime numbers with in "+n);
		for(int i=2;i<=n;i++) {
			boolean b=p.isPrime(i);
			if (b==true) {
				count++;
			 prime=i;
			}
			if(prime==i) {
			
			System.out.println("Count:"+count+" Number is-->"+prime);
			}
		}
		test();
	}
// Calling main Method --------(NOT IMPORTANT)-----------
	public static void test() {
		System.out.println();
		System.out.println("Press 1 to continue in same Program");
		System.out.println("Press any other number to stop the Program");
		int n=sc.nextInt();
		if (n==1) {
			main(null);	
		} else {
System.out.println("<--------Thank you.......!-------->");
		}
	}
}
