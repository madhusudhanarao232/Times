package srcInterview_Questions;

import java.util.Scanner;

public class UpperCaseEntireFirstString {

	public static void main(String[] args) {
	 String s1,s2;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter 2 string values");
      s1=sc.nextLine();
      s2=sc.nextLine();
      //convert the each word in string UPPERCASE
      s1=s1.toUpperCase();
      // First method
      String s3=s1.concat(s2);//concatenation operation
       //Second method
      //String s3=s1+s2;
      //FInding the LENGTH of the GIVEN Strings
      int l1=s1.length();
      int l2=s2.length();
      
      System.out.println("Length of First String is :"+l1);
      System.out.println("Length of Second String is :"+l2);
      System.out.println("Result of concatenation is : "+s3);
	
	
	
	}

}
