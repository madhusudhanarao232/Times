package srcArrays;

import java.util.Scanner;

public class DeleteArrayElementsFromPerticularINDEX {
	public static void main(String[] args) {
		ArrayOperation ao=new ArrayOperation();
		Scanner sc=new Scanner(System.in);
		System.out.println("Read the Array Elements");
		int x[]=ao.readArray();
		System.out.println("display the details of Array");
		ao.disArray(x);
		System.out.println("Enter to Index to Dlete the Element");
		int index=sc.nextInt();
		int deleteArray[]=ao.deleteArray(x,index);
		ao.disArray(deleteArray);
	}

}
