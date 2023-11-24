package srcTYArray;

public class Find1st2ndMinNum {

	public static void main(String[] args) {
		int a[]= {0,5,2,0,1};//0 1
		int fmin=a[0];
		int smin=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<=fmin) {
				if(a[i]!=fmin)
					smin=fmin;
				fmin=a[i];
			}
			else if(smin>a[i]||smin==fmin) {
				//if(fmin[i]<smin[i])
				smin=a[i];
			}
		}
		System.out.println("1st & 2nd min Num are: "+fmin+" "+smin);
	}

}
