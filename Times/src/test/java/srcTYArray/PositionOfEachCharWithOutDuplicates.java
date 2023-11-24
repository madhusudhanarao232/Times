package srcTYArray;

import java.util.LinkedHashSet;

public class PositionOfEachCharWithOutDuplicates {

	public static void main(String[] args) {
		String s="aaaabbbbcccddfffhhhhh";
		LinkedHashSet<Character>set=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
			//System.out.println(s.charAt(i)+" is Present in "+(i+1)+" position");
		} 
		for (Character character : set) {
			for (int i = 0; i < s.length(); i++) {
				if(character==s.charAt(i)) {	
					System.out.println(s.charAt(i)+" is in "+(i+1)+" position");
					break;
				}
			} 
		}
	}

}
