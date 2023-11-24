package srcTYArray;

import java.util.HashMap;
import java.util.Map.Entry;

public class RemoveDuplictionCharUsingMap {

	public static void main(String[] args) {
		String s="aaaabbbbcccddfffhhhhh";
		HashMap<Character, Object> map=new HashMap<Character, Object>();

		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), i);
		}
		for(Entry<Character, Object>m:map.entrySet()) {
			System.out.println(m.getKey()+" --> "+m.getValue());
		}
	}

}
