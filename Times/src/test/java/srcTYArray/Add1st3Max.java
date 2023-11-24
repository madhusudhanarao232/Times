package srcTYArray;

public class Add1st3Max {

	public static void main(String[] args) {
      int [] a= {5,2,0,7,2,1,9};
      int fmax=a[0];
      for(int i=0;i<a.length;i++) {
    	  for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				} // if   		 
			}// inner for
			System.out.print(a[i]+"  ");
		}//Outer for
		int sum=0;
		for(int i=0;i<3;i++) {
			sum=sum+a[i]; 
		}
		System.out.println();
		System.out.println("1st 3 Max num Sum is : "+sum);
	}


}
