package srcArrays;

public class PrimeNumbersInTheArray {
	public static void main(String[] args) {
		ArrayOperation ao=new ArrayOperation();
		System.out.println("Read the Array Elements");
		int x[]=ao.readArray();
		System.out.println("display the details of Array");
		ao.disArray(x);
		int PrimeCount=ao.countPrime(x);
		System.out.println("Count of Prime numbers :"+PrimeCount);
		
	}
}
