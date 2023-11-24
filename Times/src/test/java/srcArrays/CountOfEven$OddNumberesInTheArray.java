package srcArrays;

public class CountOfEven$OddNumberesInTheArray {
public static void main(String[] args) {
	ArrayOperation ao=new ArrayOperation();
	
	System.out.println("Read the Array Elements");
	int x[]=ao.readArray();
	System.out.println("display the details of Array");
	ao.disArray(x);
	int y[]=ao.countEO(x);
	System.out.println("number of EVEN numbers in Array :"+y[0]);
	System.out.println("number of ODD numbers in Arrray :"+y[1]);
}
}
