package srcNumbers;

import java.util.Scanner;

public class FindNumberToPower {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
	System.out.println("Enter the Number ");
	int num=sc.nextInt();
	System.out.println("Enter the power for the Number");
	int pow=sc.nextInt();
	int result=power(num,pow);
    System.out.println( num+" power "+pow+" is "+result);
    
	}
	public static int power(int n,int p) {
		int pw=1,c=1;
		while(c<=p) {    
		pw=pw*n;	
		c++;	
		}
		return pw;
	}
	

}
