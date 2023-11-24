package srcTYArray;

import java.util.HashMap;
import java.util.Map.Entry;

public class DuplicatesWithCountUsingMap {

	public static void main(String[] args) {
		String s="aaaabbbbcccddfffhhhhh";
		HashMap<Character, Object> map=new HashMap<Character, Object>();

		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), i);
		}
		for(Entry<Character, Object>mchar:map.entrySet()) {
			int count=0;
			for (int i = 0; i < s.length(); i++) {
				if(mchar.getKey()==s.charAt(i)) {
					count++;
				}		
			}
			if(count>1) {
				System.out.println(mchar.getKey()+" is Repeating : "+count+" times");
			}
		}
	}

}
