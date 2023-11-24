package srcNumbers;

import java.util.Scanner;

public class StrongNumbersWithinN {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int count=0;
		for(int i=2;i<=n;i++) {
		boolean b=isStrong(i);
		if(b==true) {
			count++;
		System.out.println("Strong Number Within "+n+" is "+count+" --> "+i);	
		}
		}
		
		
	}
	private static boolean isStrong(int n) {
		int sum=0,ld,fact=1,temp=n;
		do {
	    ld=n%10;
	    fact=isFact(ld);
		n=n/10;
		sum=sum+fact;
		}
		while(n!=0);
		if(sum==temp)
		return true;
		else
		return false;
	}
	private static int isFact(int n) {
		int fact=1;
	    for(int i=n;i>=1;i--) {
	    fact=fact*i;	
	    }
		return fact;
	}


}
