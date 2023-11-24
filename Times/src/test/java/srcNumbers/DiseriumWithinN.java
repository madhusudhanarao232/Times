package srcNumbers;
import java.util.Scanner;

public class DiseriumWithinN {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the last Number");
		int n=sc.nextInt();
		int diserium=0,count=0;
		for(int i=10;i<=n;i++) {
			boolean rs=isDiserium(i);
			if(rs==true) {
				count++;
				diserium=i;
			}
			if(diserium==i) {
				System.out.println("Diserium numbers within "+n);
				System.out.println("count no:"+count+" ||AND Number is :"+i);
			}	//if block	
		}//loooop
	}//main()
	public static boolean isDiserium(int x) {
		int temp=x,sum=0,remainder,pow;
		int count=countOfDigits(x);
		while(x!=0) {
			remainder=x%10;
			pow=power(remainder,count);
			sum+=pow;
			count--;
			x/=10;	
		}
		if(temp==sum)
			return true;
		else
			return false;
	}
	public static int countOfDigits(int n) {
		int c=0;
		while(n!=0) {
			n/=10;
			c++;
		}
		return c;	
	}
	public static int power(int ld,int count) {
		int p=1;
		while(count>0) {
			p*=ld;
			count--;	
		}
		return p;
	}
}