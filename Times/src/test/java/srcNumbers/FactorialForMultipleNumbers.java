package srcNumbers;

import java.util.Scanner;

public class FactorialForMultipleNumbers {
     static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
    System.out.println("Enter the Number to find Factorial");
    int n=sc.nextInt();
    
    for(int i=0;i<=n;i++) {
    	int factorial=factNumber(i);
    	System.out.println(i+"! = "+factorial);
    }
	}
	public static int factNumber(int f) {
		int fact=1;
		for(int i=f;i>0;i--) {
		fact=fact*i;	
		}
		return fact;
	}

}
