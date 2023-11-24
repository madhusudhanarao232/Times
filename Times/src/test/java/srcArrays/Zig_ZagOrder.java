package srcArrays;

public class Zig_ZagOrder {
	public static void main(String[] args) {
	ArrayOperation ao=new ArrayOperation();
	System.out.println(" Read the first Array");
	int x[]=ao.readArray();
	System.out.println("Read the Second Array");
	int y[]=ao.readArray();
	System.out.println("User entered first Array");
	ao.disArray(x);
	System.out.println("User entered Second Array");
    ao.disArray(y);
    int z[]=ao.zigzag(x,y);
    System.out.println("Merged Sorted Array");
    ao.disArray(z);
}
}
