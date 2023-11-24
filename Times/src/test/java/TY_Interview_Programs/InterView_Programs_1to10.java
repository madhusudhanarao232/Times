package TY_Interview_Programs;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class InterView_Programs_1to10 {

	/*Question : 1 */
	@Test(priority = 1)
	public void reverseGivenString() {
		/*
		 * input: welcom to expleo 
		 * output: expleo to welcome
		 * 
		 */	
		String s="welcom to expleo";
		String sp[]=s.split(" ");
		for(int i=sp.length-1;i>=0;i--) {
			//Reporter.log(sp[i],true);	
			System.out.print(sp[i]+" ");
		}
		System.out.println();
	}
	/* Question : 2*/   
	@Test(priority = 2)
	public void removeDlicatesFromStringWithoutUsingANYInBuiltMethods() {
		/*
		 * input: aaabbbcccccccdddddddddeeeeee 
		 * output:abcde
		 * 
		 */
		System.out.println("Without using any IN-Built Methods");
		String s="aaabbbcccccccdddddddddeeeeee";
		char cr[]=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			for(int j=i+1;j<s.length();j++) {
				if(ch==s.charAt(j)&&ch!=' ')
					cr[j]=';';
			}
		}
		for(int i=0;i<cr.length;i++) {
			if(cr[i]!=';')
				System.out.print(cr[i]+" ");
		}
		System.out.println();
	}
	/* Question : 2.1*/   
	@Test(dependsOnMethods ="removeDlicatesFromStringWithoutUsingANYInBuiltMethods" ,priority = 1)
	public void removeDuplicatesUsingSet() {
		String s="aaabbbcccccccdddddddddeeeeee";
		System.out.println("using set");
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		for(Character ch:set) {
			System.out.print(ch+" , ");
		}
		System.out.println();
	}
	/* Question : 2.2*/   
	@Test(dependsOnMethods ="removeDlicatesFromStringWithoutUsingANYInBuiltMethods" ,priority = 2)
	public void removeDuplicatesUsingMAP() {
		System.out.println("using map");
		String s="aaabbbcccccccdddddddddeeeeee";
		LinkedHashMap<Character, Object> map=new LinkedHashMap<Character, Object>();
		for(int i=0;i<s.length();i++) {
			map.put(s.charAt(i), i);
		}
		for(Entry<Character, Object> ch:map.entrySet()) {
			System.out.print(ch.getKey()+" | ");
		}
		System.out.println();
	}
	@Test(priority=3)
	public void removeDuplicatesWordsFromString() {
		String s="I am a student am I a engg engg";
		String [] sp=s.split(" ");
		String str=" ";
		for(int i=0;i<sp.length;i++) {
			String s1=" ";
			for(int j=i+1;j<sp.length;j++) {
				if(sp[i].equals(sp[j])) {
					str=str+sp[j]+s1;		
				}
			}	
		}
		System.out.println(str);
	}
	@Test
	public void reverseTheWordsInString1() {
		String s="abcdefghijklm";
		String st=" ";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			st=ch+st;
		}
		System.out.println(st);
	}
	@Test(priority=4)
	public void reverseString() {
		/*
		 * input: today id friday 
		 * output : friday is today
		 * */
		String s="today is friday";
		String sp[]=s.split(" ");
		for(int i=sp.length-1;i>=0;i--) {
			
			System.out.print(sp[i]+" ");
			
		}
		System.out.println();
	}
	@Test(priority=5)
	public void insertAStringIntoMiddleOfStringArray() {
		String [] sr= {"ironMan","Captain","Thor","Hulk","Dr.Strange","Natasha","Wanda","Vision","spider-man"};
	    String [] str=new String[sr.length+1];
	    
		String addedEle="SUPER-MAN";
		int index=4,start=0;
		
		for(int i=0;i<str.length;i++) {
			if(i==index) {
				str[i]=addedEle;
			}
			else
				str[i]=sr[start++];
		}
		for(String updated:str) {
			System.out.print(" ' "+updated+" ' ,");
		}
	    
	}
	@Test(priority=6)
	public void reverseTheWordsInString() {
		
		String s="It's wonderfull day, didn't forgotable";
		String sp[]=s.split(" ");
		
		for(int i=0;i<sp.length;i++) {
			String s1=sp[i];
			for(int j=s1.length()-1;j>=0;j--) {
				System.out.print(s1.charAt(j));
			}
			System.out.print(" ");
		}
		System.out.println();
	}
	
	@Test(priority=7)
	public void occuranceOfCharInString() {
		/* input: aaabbcdddf  
		 * output: a=3;b=2;c=1;d=3;f=1
		 * */
		
		String s="aaabbcdddf";
		char [] ch=s.toCharArray();
		for(char i='a';i<='z';i++) {
			int count=0;
			for(char cr:ch) {
				if(i==cr) {
				count++;	
				}
			}
			if(count>0)
			System.out.println(i+" "+count);
		
		}
		
	}
	
	
	@Test(dependsOnMethods = {"occuranceOfCharInString"},priority=1)
	public void occuranceOfCharInStringUsingASCII() {
		/* input: aaabbcdddf  
		 * output: a=3;b=2;c=1;d=3;f=1
		 * */
		
		String s="ssss444765www$8&     $@AGVVVVRDHD";
		char [] chArr=s.toCharArray();
		for(int i=0;i<=206;i++) {
			char ch=(char)(i);
			int count=0;
			for(char cr:chArr) {
				if(ch==cr) {
				count++;	
				}
			}
			if(count>0)
			System.out.println(ch+" "+count+" ASCII val -->"+i);
		
		}	
	}
	@Test(dependsOnMethods = {"occuranceOfCharInString"},priority=2)
	public void occuranceOfCharInString1() {
		String s="aaabbbcdddeeaabbb";
		for(int i=0;i<s.length();i++) {
			int count=0;
            for(int j=0;j<s.length();j++) {
            	if(s.charAt(j)==s.charAt(i)) {
            	if(i>j) {
            		break;
            	}
            	count++;
            }
            }
            if(count>1) {
            	System.out.print(s.charAt(i)+""+count);
            }
		}
		 System.out.println();
	}
	
	@Test(priority = 0)
	public void demoByte() {
		byte a=10,b=20;
		//byte c=a+b;
		//byte c=max(int d,byte a,byte b);
		
		byte sum=(byte)(a+b);
		System.out.println(sum);
		
	}
	@Test(dependsOnMethods = {"occuranceOfCharInString"},priority =2)
	public void test1() {
		/*
		 *  i/p --->  a4b3cd2
		 *  o/p ---> aaaaabbbcdd
		 */
		String s="a4b3cd2";
		char ch []=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int a=1;
			if(ch[i]>='1'&&ch[i]<='9') {
			    a=ch[i];
			}
			for(int j=1;j<=a;j++) {
				char c=' ';
				if(ch[i]>='a'&&ch[i]<='z'||ch[i]>='A'&&ch[i]<='Z') {
				 c=ch[i];	
				}
				System.out.print(c+" ");
			}
		}
		
	}
	@Test(priority=8)
	public void withOUtBubbleSort() {
		int []a={7, -3, 0, 2,9, 1, -9};
		int max=a[0];
				for (int i = 0; i < a.length; i++) {
				if(a[i]>max) {
			max=a[i];
				}
			}
		System.out.println(max);
		
	}
	@Test(priority=9)
	public void findFirst3EleProduct() {
		int []a={7, -3, 0, 2, 1, -9};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int multi=1;
		for (int i = 0; i < 3; i++) {
			multi=multi*a[i];
		}
		System.out.println(multi);
		}
	@Test(priority = 10)
	public void  reverseKeepSpacesPreviousString() {
		String s="i am selenium";
		char[] ch = s.toCharArray();
		char [] req=new char[ch.length];
		// to mark the spaces
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]==' ') {
				req[i]=' ';
			}
		}
		// copy elements from ch to req only if char is not space and don't copy
		//top space places of req
		for (int i=0,j=ch.length-1;i<ch.length;i++) {
			if(ch[i]!=' ') {
				if(req[j]==' ') {
					j--;
				}
				req[j]=ch[i];
				j--;
			}
		}
		s=new String(req);
		System.out.println(s);
	}
	
}
