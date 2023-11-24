package srcTYArray;

public class Append0sAtTheLast {

	public static void main(String[] args) {
		int [] a= {0,4,5,9,0,7,0,1};
		int b[]=new int[a.length];
		int m=0,n=a.length-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				b[m]=a[i];
				m++;		  
			}
			else {
				b[n]=a[i];
				n--;
			}
		}
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}
}
