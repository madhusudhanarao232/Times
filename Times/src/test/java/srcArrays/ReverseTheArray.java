package srcArrays;

public class ReverseTheArray {
	public static void main(String[] args) {
		ArrayOperation ao=new ArrayOperation();
		System.out.println(" Read the Array");
		int x[]=ao.readArray();
		System.out.println("User entered Array");
		ao.disArray(x);
		ao.reverseArray(x);
		System.out.println("Reverse Array");
		ao.disArray(x);
	}
}
