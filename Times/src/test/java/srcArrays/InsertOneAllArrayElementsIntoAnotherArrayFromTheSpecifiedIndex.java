package srcArrays;

import java.util.Scanner;

public class InsertOneAllArrayElementsIntoAnotherArrayFromTheSpecifiedIndex {

	public static void main(String[] args) {
		ArrayOperation ao=new ArrayOperation();
		Scanner sc=new Scanner(System.in);
		System.out.println(" Read the first Array");
		int x[]=ao.readArray();
		System.out.println("Read the Second Array");
		int y[]=ao.readArray();
		System.out.println("User entered first Array");
		ao.disArray(x);
		System.out.println("User entered Second Array");
	    ao.disArray(y);
	    System.out.println("Enter index value to be entered");
	    int index=sc.nextInt();
	    int z[]=ao.insertArray(x, y,index);
	    System.out.println("Merged one All Array Elelments From the Particular Index");
	    //ao.disArray(z); / Same as for loop 
	    for(int i=0;i<z.length;i++) {
	    System.out.print(z[i]+",");
	 }
		
	}
}
