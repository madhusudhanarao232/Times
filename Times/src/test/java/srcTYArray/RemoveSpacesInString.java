package srcTYArray;

public class RemoveSpacesInString {

	public static void main(String[] args) {
		String s="I am a student ab cd ";
		String []split=s.split(" ");

		for(int i=0;i<split.length;i++) {
			System.out.print(split[i]);
		}
	}

}
