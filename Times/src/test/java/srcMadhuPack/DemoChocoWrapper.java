package srcMadhuPack;

public class DemoChocoWrapper {
	public static void main(String[] args) {
		int n=36,ld=0,sum=0;
		while(n!=0) {
		ld=n/6;	
		if(ld>=6) {
		sum=n+ld;
		}
		}
		
		System.out.println(sum);
	}
}