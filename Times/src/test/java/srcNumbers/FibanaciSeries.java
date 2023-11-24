package srcNumbers;

public class FibanaciSeries {

	public static void main(String[] args) {
	 int n1=0,n2=1,n3=0;
	 System.out.print(n1+","+n2);
	 do {
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.print(","+n3);
		 
	 }while(n1<=1000);

	}

}
