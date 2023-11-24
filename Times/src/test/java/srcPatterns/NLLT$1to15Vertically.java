package srcPatterns;

import java.util.Scanner;

public class NLLT$1to15Vertically {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number");
		 int n=sc.nextInt();
		// int x=1;------>FOR HORIZONTAL
		 for(int i=1;i<=n;i++) {
			int x=i;                //------>FOR Vertical 
			for(int j=1;j<=i;j++) {
			System.out.print(x+" ");
			x=x+n-j;                //------>FOR Vertical
			//x++;------>FOR HORIZONTAL			
			}
			 System.out.println();		 
		 }
	}

}
//8562244119