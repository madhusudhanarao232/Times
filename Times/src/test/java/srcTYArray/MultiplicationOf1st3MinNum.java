package srcTYArray;

public class MultiplicationOf1st3MinNum {

	public static void main(String[] args) {
		int[] a= {5,1,3,2,4,1};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				} // if   		 
			}// inner for
			System.out.print(a[i]+"  ");
		}//Outer for
		int multi=1;
		for(int i=0;i<3;i++) {
			multi=multi*a[i]; 
		}
		System.out.println();
		System.out.println("1st 3 Min num Multiplication is : "+multi);
	}

}
