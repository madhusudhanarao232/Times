package srcTYArray;

public class FindMinStringLength {

	public static void main(String[] args) {
		String s[]= {"ab","abc","abcd","abcde","abcdef","ba","12"};
		String len=s[0];
		for (int i = 0; i < s.length; i++) {
			if(s[i].length()<len.length()) {
				len=s[i];
			}
			//		if(s[i].length()==len.length()) {
			//			System.out.print(s[i]+" ");
			//		}
		}
		for (int i = 0; i < s.length; i++) {
			if(s[i].length()==len.length()) {
				System.out.print(s[i]+" ");
			}
		}

	}

}
