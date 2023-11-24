package srcTYArray;

import java.util.LinkedHashSet;

public class DuplicatesWithCountStringWords {

	public static void main(String[] args) {
		String s="I am a student am I a engg engg";
		String []split=s.split(" ");

		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for (int i = 0; i < split.length; i++) {
			set.add(split[i]);
		}
		for (String st : set) {
			int count=0;
			for(int i=0;i<split.length;i++) {
				if(st.equalsIgnoreCase(split[i])) {
					count++;
				}  
			}
			if(count>0) {
				System.out.println(st+"---> is Repeating : "+count+" times");
			}
		} 
	}

}
