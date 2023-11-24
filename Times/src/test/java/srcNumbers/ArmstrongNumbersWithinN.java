package srcNumbers;

import java.util.Scanner;

public class ArmstrongNumbersWithinN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArmstrongMethod1 m=new ArmstrongMethod1();
		System.out.println("Enter the number");
		long n=sc.nextLong();
		int count=0,ArmStrong=0;
		for (int i=1;i<=n;i++) {
			boolean rs=m.isArmstrong(i);
			if (rs==true) {
				count++;
			ArmStrong=i; 
			}
			if(ArmStrong==i) {
				System.out.println("ArmStrong numbers within "+n);
				System.out.println("count no:"+count+" ||AND Number is :"+i);
			}
		}	
	}

	                                                     ///*public boolean isArmstrong(int n) {
	                                                     //	int ld,sum=0,temp=n;
	                                                     //	do {
	                                                     //		ld=n%10;
	                                                     //		sum=sum+(ld*ld*ld);
	                                                     //		n=n/10;
	                                                     //	}
	                                                     //	while(n!=0);
	                                                     //	if(temp==sum) 
	                                                     //		return true;
	                                                     //	else
	                                                     //		return false;
	                                                     //}*/
}
