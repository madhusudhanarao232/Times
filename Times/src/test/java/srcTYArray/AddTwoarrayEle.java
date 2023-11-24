package srcTYArray;

public class AddTwoarrayEle {

	public static void main(String[] args) {
		int [] a= {8,9,3,6,1,0,5};
		int []b= {4,6,7,0,3};
		int len=b.length; //5 
		if(b.length<a.length) {
			len=a.length;
		}
		for(int i=0;i<len;i++) {
			try {
				System.out.print(b[i]+a[i]+" ");

			} catch (Exception e) {
				if(b.length<a.length) {
					System.out.print(a[i]+"");
				}
				else {
					System.out.println(b[i]+"");
				}
			}
		}
	}

}
