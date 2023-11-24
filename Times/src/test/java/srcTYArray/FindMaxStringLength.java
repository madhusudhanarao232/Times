package srcTYArray;

public class FindMaxStringLength {

	public static void main(String[] args) {
		String s[]= {"ab","abc","abcd","abcde","abcdef","ba","12"};
		String max=s[0];
		for (int i = 0; i < s.length; i++) {
			if(s[i].length()>max.length()) {
				max=s[i];
			}
		}
		System.out.println(max);
	}
}
//		String len=s[s.length-1];
//	
//		for (int i = 0; i < s.length; i++) {
//			if (s[i].length()>len.length()) {
//				len=s[i];
//			}
//		}
//		for (int i = 0; i < s.length; i++) {
//			if(s[i].length()==len.length()) {
//				System.out.print(s[i]+" ");
//			}
//		}
