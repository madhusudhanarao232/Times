package srcTYArray;

public class PositionOfEachCharWithDuplicates {

	public static void main(String[] args) {
		String s="aaaabbbbcccddfffhhhhh";
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i)+" is Present in "+(i+1)+" position");
		}    
	}

}
