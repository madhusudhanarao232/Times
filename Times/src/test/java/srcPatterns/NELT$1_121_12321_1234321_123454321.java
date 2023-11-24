package srcPatterns;

import java.util.Scanner;

public class NELT$1_121_12321_1234321_123454321 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int x=1;
			for(int sp=1;sp<=n-i;sp++) {
				System.out.print("  ");
			}
			for(int j=1;j<=(2*i-1);j++) {
				System.out.print(x+" ");
				if(j<i)
					x++;
				else
					x--;
			}
			System.out.println(); 
		}

	}

}
