package srcInterview_Questions;

public class GuessOutput1 {
	private int i=1;
	static GuessOutput1 g=new GuessOutput1();
	public static void main(String[] args) {
		int i=2;
		
		g.test();
	}
	public static void test() {
	    
		System.out.println(g.i);	
	}

}
