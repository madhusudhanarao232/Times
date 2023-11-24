package srcNumbers;

import java.util.Iterator;
import java.util.Scanner;

public class StrongNumberCheck {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		boolean b=isStrong(n);
		if(b==true) {
			System.out.println(n+" is Strong number");
		}
		else {
			System.out.println(n+" is NOT a Strong number");
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
