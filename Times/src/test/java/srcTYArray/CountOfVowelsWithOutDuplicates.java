package srcTYArray;

import java.util.LinkedHashSet;

public class CountOfVowelsWithOutDuplicates {

	public static void main(String[] args) {
		 String s="India";
	     String s1 = s.toLowerCase();
	     char[] c = s1.toCharArray();
	     int count=0;
	     LinkedHashSet<Character>set=new LinkedHashSet<Character>();
	     for (int i = 0; i < c.length; i++) {
	    	 set.add(c[i]);
	}
	     for (Character ch : set) {
	    	 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					count++;
					System.out.println(ch);
				}
			}
	     System.out.println("Count of Vowels in String is: "+count);
		}
	}
