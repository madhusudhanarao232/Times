package srcTYArray;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class RemoveDuplicateWordsInStringUsingMAp {

	public static void main(String[] args) {
		String s="I am a student am I a engg engg";
		String []split=s.split(" ");
		LinkedHashMap<String, Object>map=new LinkedHashMap<String, Object>();
        for (int i=0;i<split.length;i++) {
        	map.put(split[i], i);
        }
        for (Entry<String, Object>m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
