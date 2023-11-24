package srcArrays;

import java.util.Scanner;

public class InsertTheElementsIntoSpecifiedINDEX {
	public static void main(String[] args) {
		ArrayOperation ao=new ArrayOperation();
		Scanner sc=new Scanner(System.in);
		System.out.println("Read the Array Elements");
		int x[]=ao.readArray();
		System.out.println("display the details of Array");
		ao.disArray(x);
		/*
		int arr[]=ao.insertArr(x);
		System.out.println("Inserted elements into specied Index :");
		ao.disArray(arr);
		*/
		System.out.println("Enter the Element Should be Add into Array");
		int Element=sc.nextInt();
		System.out.println("Enter the Index of the Element to ADD");
		int Index=sc.nextInt();
		int arr[]=ao.insertArr(x, Element, Index);
		System.out.println("After Inserting Elements");
		ao.disArray(arr);
}
}