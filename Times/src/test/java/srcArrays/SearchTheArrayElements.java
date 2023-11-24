package srcArrays;

import java.util.Scanner;

public class SearchTheArrayElements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayOperation ao=new ArrayOperation();
		System.out.println("Read the Array Elements");
		int x[]=ao.readArray();
		System.out.println("display the details of Array");
		ao.disArray(x);
		System.out.println("Enter the one Element value for Seach the Element ");
		int Element=sc.nextInt();
		int in=ao.seachArr(x,Element);
		if(in==1) {
			System.out.println("Element is not present");	
		}
		else {
			System.out.println("Element Present At:" +in+" --> INDEX");
		   
		}
	}
}
