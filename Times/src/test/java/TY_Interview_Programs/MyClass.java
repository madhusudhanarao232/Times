package TY_Interview_Programs;

import java.util.LinkedHashMap;

public class MyClass {
    public static void main(String args[]) {
     String s="wwwtestw";
     char[]ch=s.toCharArray();
     LinkedHashMap<Character,Integer> map=new  LinkedHashMap<Character, Integer>();
     for(int i=0;i<ch.length;i++)
     {
         map.put(ch[i],map.getOrDefault(ch[i],0)+1);
         
     }
     System.out.print(map);
    }
}
	


