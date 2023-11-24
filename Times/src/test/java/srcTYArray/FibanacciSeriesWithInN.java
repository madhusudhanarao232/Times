package srcTYArray;

import java.util.Scanner;

public class FibanacciSeriesWithInN {
    
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
       int a=0,b=1,temp=0;
       System.out.print(a+","+b);
       for(int i=0;i<=n;i++) {
    	  temp=a+b;
    	  a=b;
    	  b=temp;
    	  System.out.print(","+temp);
       }
       
	}

}
