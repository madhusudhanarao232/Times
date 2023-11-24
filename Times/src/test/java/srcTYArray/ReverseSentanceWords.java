package srcTYArray;

public class ReverseSentanceWords {

	public static void main(String[] args) {
		String s="I am a student ab cd ";
		String []split=s.split(" ");
		for(int i=0;i<split.length;i++) {
			String str=split[i];
			for(int j=str.length()-1;j>=0;j--) {
				System.out.print(str.charAt(j));
			}
			System.out.print(" ");
		}
	}

}
