package srcMadhuPack;

public class DemoRecurssion {

	public static void main(String[] args) {
int n=4;
int a=test(n);
System.out.println(a);
	}

	public static int test(int n) {
		if(n==1) {
			return 1;
		}
		return n*test(n-1);
	}

}
