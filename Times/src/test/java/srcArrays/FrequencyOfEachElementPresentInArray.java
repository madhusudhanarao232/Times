package srcArrays;

public class FrequencyOfEachElementPresentInArray {
	public static void main(String[] args) {
		ArrayOperation ao=new ArrayOperation();
		System.out.println("Read the Array Elements");
		int ar[]=ao.readArray();
		System.out.println("display the details of Array");
		ao.disArray(ar);
		ao.frequency(ar);
	
	}
} 