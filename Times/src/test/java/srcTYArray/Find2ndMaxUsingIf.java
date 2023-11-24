package srcTYArray;

public class Find2ndMaxUsingIf {

	public static void main(String[] args) {
		int [] a= {0,5,2,0,1};
		int fmax=a[0];
		int smax = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>=fmax) {
				if(a[i]!=fmax) {
					smax=fmax;
				}
				fmax=a[i];
			}
			else if(smax<a[i]||smax==fmax) {
				//if(fmin[i]<smin[i])
				smax=a[i];
			}
		}
		System.out.println("1st & 2nd Max Num are: "+fmax+" "+smax);
	}

}
