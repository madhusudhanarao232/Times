package srcTYArray;

import java.util.HashMap;
import java.util.Map.Entry;

public class OccuranceOfEachWordInStringUsingMap {

	public static void main(String[] args) {
		String s="I am a student am I a engg engg";
		String []split=s.split(" ");
		
		HashMap<String, Object> map=new HashMap<String, Object>();
		for (int i=0;i<split.length;i++) {
			map.put(split[i], i);
		}
		for(Entry<String, Object> m:map.entrySet()) {
			int count=0;
			for(int j=0;j<split.length;j++) {
				if(m.getKey().equalsIgnoreCase(split[j])) {
					count++;
				}
			}
			System.out.println(m.getKey()+" is Repeating "+count+" times");
		}
	}

}
