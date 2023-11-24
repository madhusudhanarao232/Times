package srcTYArray;

public class CombinatonOfTwoEle {

	public static void main(String[] args) {
		int []a= {-1,9,5,8,12,6,2};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]+a[j]==11) {
					sum=a[i]+a[j];
					System.out.println(a[i]+" + "+a[j]+" = "+sum);
				}
			}
		}
	}
}
