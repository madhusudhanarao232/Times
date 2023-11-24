package srcTYArray;

import java.util.Scanner;

public class StringPalyndrome {

	public static void main(String[] args) {

		String s; 
		String rev="";
		for(;;) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter string name");
			s=sc.next();
			for(int i=0;i<s.length();i++) {
				rev=s.charAt(i)+rev;
			}//inner for
			if (rev.equals(s)) {
				System.out.println("Pass..");
			}
			else {
				System.out.println("Fail..");
			}//else
		}//outer for
	}
}
