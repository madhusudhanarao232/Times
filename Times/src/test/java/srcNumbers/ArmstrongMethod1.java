package srcNumbers;

import java.util.Scanner;

public class ArmstrongMethod1 {
	//153,9474,1634,370,371

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArmstrongMethod1 m=new ArmstrongMethod1();
		System.out.println("Enter the number");
		int n=sc.nextInt();
		boolean rs=m.isArmstrong(n);
		if (rs==true) {
			System.out.println(n+" is ArmStrong number");
		}
		else {
			System.out.println(n+" is NOT a ArmStrong Number");
		}

	}

	public boolean isArmstrong(int n) {
		int temp=n,p,ld,sum=0;
		int count=countDigits(n);
		while(n>0) {
			ld=n%10;
			p=power(ld,count);
			sum+=p;
			n/=10;
		}
		if(temp==sum)
			return true;
		else
		return false;
	}
	public int countDigits(int n) {
		int c=0;
		while(n>0) {
		n=n/10;
		c++;
		}
		return c;
	}

	public int power(int ld, int count) {
		int p=1;
		for(int i=1;i<=count;i++) {
			p*=ld;
		}
		return p;
	}

	

	/*boolean isArmstrong(int n) {
		int ld,sum=0,temp=n;
		do {
			ld=n%10;
			sum=sum+(ld*ld*ld);
			n=n/10;
		}
		while(n!=0);
		if(temp==sum) {
			return true;
		}
		else
		return false;
	}
	*/

}
