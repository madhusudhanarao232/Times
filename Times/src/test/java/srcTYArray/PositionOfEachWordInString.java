package srcTYArray;

public class PositionOfEachWordInString {

	public static void main(String[] args) {
		String s="I am a student am I a engg engg";
		String []split=s.split(" ");

		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]+"---> is in "+(i+1)+" position");
		}

	}

}
