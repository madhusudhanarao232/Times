
package srcNumbers;

import java.util.Scanner;

public class Diserium {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		boolean rs=isDiserium(num);
		if (rs==true) {
			System.out.println(num+" is Diserium number");
		}
		else {
			System.out.println(num+" is NOT a Diserium Number");
		}
	}
	public static boolean isDiserium(int n) {
		int temp=n,ld,pw,sum=0;
		int count=countDigits(n);
		while(n!=0) {
			ld=n%10;
			pw=power(ld,count);
			sum=sum+pw;
			count--;
			n=n/10;
		}
		if(temp==sum)
			return true;
		else
			return false;
	}
	public static int power(int ld,int count) {
		int prod=1;
		while(count>=1) {
			prod=prod*ld;
			count--;
		}
		return prod;
	}
	private static int countDigits(int n) {
		int c=0;
		while(n!=0) {
			c++;
			n=n/10;
		}
		return c;
	}
}