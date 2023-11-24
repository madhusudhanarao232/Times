package srcArrays;

public class ReplacedByTheirSumDigits {
	public static void main(String[] args) {
		ArrayOperation ao=new ArrayOperation();
		System.out.println("Read the Array Elements");
		int x[]=ao.readArray();
		System.out.println("display the details of Array");
		ao.disArray(x);
		int sum[]=ao.replacedBySumDigits(x);
		System.out.println("Sum Array Elements Replaced By their sum is :"+sum);
		ao.disArray(sum);
		
	}
}
