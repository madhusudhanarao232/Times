package srcTYArray;

import java.util.LinkedHashSet;

public class OccuranceOfEachCharacter {

	public static void main(String[] args) {
		String s="aaabbbbccccdddddd";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		for (Character character : set) {
			int count=0;
			for (int i = 0; i < s.length(); i++) {
				if(character==s.charAt(i)) {
					count++;
				}
			}
			System.out.println(character+"--->"+count);
		}// for each loop
	}

}
