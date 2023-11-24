package srcTYArray;

public class ReverseSentance {

	public static void main(String[] args) {
		String s="I am a student a b c d ";
		String []split=s.split(" ");
		for(int i=split.length-1;i>=0;i--) {

			System.out.print(split[i]+" ");
		}
	}

}
