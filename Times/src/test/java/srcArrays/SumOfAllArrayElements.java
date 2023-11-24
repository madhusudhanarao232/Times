package srcArrays;

public class SumOfAllArrayElements {
	public static void main(String[] args) {
		ArrayOperation ao=new ArrayOperation();
		System.out.println("Read the Array Elements");
		int x[]=ao.readArray();
		System.out.println("display the details of Array");
		ao.disArray(x);
		int sum=ao.sumArray(x);
		System.out.println("Sum of All ArrayElements :"+sum);
	}
}
