package srcArrays;

public class SmallestElementInTheArray {
	public static void main(String[] args) {
		ArrayOperation ao=new ArrayOperation();
		System.out.println("Read the Array Elements");
		int x[]=ao.readArray();
		System.out.println("display the details of Array");
		ao.disArray(x);
		int sm=ao.getSmallest(x);
		System.out.println("Smallest Element in the Array is :"+sm);
		
	}

}
