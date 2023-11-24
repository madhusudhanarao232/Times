package srcTYArray;

public class CountOfWordsInString {

	public static void main(String[] args) {
		String s="I am a student am I a engg engg";
		String []split=s.split(" ");
		int count=0;
		for(int i=0;i<split.length;i++) {
			count++;
			System.out.println(split[i]);
		}
		System.out.println("Count words in Given String --->"+count);
	}

}
