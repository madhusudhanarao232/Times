package srcPatterns;

import java.util.Scanner;

public class AllASCIIvalues {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Starting value of ASCII no");
		int Start=sc.nextInt();
		System.out.println("Enter the no Until you Want ASCII Values");
		long end=sc.nextLong();
		for(int i=Start;i<=end;i++) {
			System.out.println("ASCII Value of No "+i+" is -->"+"'"+(char)(i)+"'");	
		}
	}
}