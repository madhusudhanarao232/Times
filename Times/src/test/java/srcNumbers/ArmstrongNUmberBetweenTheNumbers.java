package srcNumbers;

import java.util.Scanner;

public class ArmstrongNUmberBetweenTheNumbers {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			ArmstrongMethod1 m=new ArmstrongMethod1();
			System.out.println("Enter the Starting Number");
			int Start=sc.nextInt();
			System.out.println("Enter the End number");
			long end=sc.nextInt();
			int count=0;
			for (int i=Start;i<=end;i++) {
				boolean rs=m.isArmstrong(i);
				if (rs==true) {
					count++;
					System.out.println("Count of ArmStrong numbers Between the "+Start+" AND "+end+" is "+count);
					System.out.println(" And the Number is :"+i);
				}
			}	
		}

		boolean isArmstrong(int n) {
			int ld,sum=0,temp=n;
			do {
				ld=n%10;
				sum=sum+(ld*ld*ld);
				n=n/10;
			}
			while(n!=0);
			if(temp==sum) 
				return true;
			else
				return false;
		}
	}

