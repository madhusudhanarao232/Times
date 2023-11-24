package srcInterview_Questions;

import java.util.LinkedHashSet;

public class RemovingDuplicatesFromString {
	public static void main(String[] args) {
		String s="Maaaddddhhhuuu";
		System.out.println("Length before removing duplicates : "+s.length());
		LinkedHashSet<Character> ls=new LinkedHashSet<Character>();
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			char a = c[i];		
					ls.add(a);				
		}
		System.out.println("Length AFTER removing duplicates : "+ls.size());
		System.out.print(ls);
	}

}
