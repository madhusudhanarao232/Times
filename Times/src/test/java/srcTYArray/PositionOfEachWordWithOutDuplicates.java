package srcTYArray;

import java.util.LinkedHashSet;

public class PositionOfEachWordWithOutDuplicates {

	public static void main(String[] args) {
		String s="I am a student am I a engg engg";
		String []split=s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for (int i = 0; i < split.length; i++) {
			set.add(split[i]);
		}
		for (String st : set) {
			for(int i=0;i<split.length;i++) {
				if(st.equalsIgnoreCase(split[i])) {
					System.out.println(split[i]+"---> is in "+(i+1)+" position");
					break;
				}//if
			}//for
		}//for each
	}

}
