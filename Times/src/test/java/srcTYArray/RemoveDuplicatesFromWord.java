package srcTYArray;

import java.util.LinkedHashSet;

public class RemoveDuplicatesFromWord {

	public static void main(String[] args) {
		String s="aaabbbbccccdddddd";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		for (Character character : set) {
			System.out.print(character+" ");
		}
	}

}
