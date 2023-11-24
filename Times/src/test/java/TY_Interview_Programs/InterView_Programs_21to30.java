package TY_Interview_Programs;

import java.util.TreeSet;

import org.testng.annotations.Test;

public class InterView_Programs_21to30 {

	@Test(priority =1)
	public void printNonDublicateValues() {
		// madhusudhana rao dande
		// non rep --> msroe
		// rep ---> adhun
		String s="madhusudhana rao dande";
		char[] c = s.toCharArray();
		for(int i=0;i<c.length;i++) {
			int count=0;
			for(int j=0;j<c.length;j++) {
				if(c[i]==c[j]) {
					if(i>j) {
						break;
					}
					count++;
				}
			}
			if(count==1) 
				System.out.print(c[i]);
		}
		System.out.println();
	}
	@Test(priority = 2)
	public void printNoOfTimesCharPresentInString() {
        String s="the eagle is coming";
        for(int i=0;i<s.length();i++) {
        	int count=0;
        	for(int j=0;j<s.length()-1;j++) {
        		if(s.charAt(i)==s.charAt(j)) {
        			if(i>j) {
        				break;
        			}
        			count++;
        		}
        	}
        	 if(count>=1)
        		System.out.print(s.charAt(i)+""+count);
        }
        System.out.println();
	}
	@Test(priority = 3)
	public void charNotDuplicateInSortedOrder() {
		String s="the eagle is coming";
		TreeSet<Character> ts=new TreeSet<Character>();
        for(int i=0;i<s.length();i++) {
        	ts.add(s.charAt(i));
        }
        System.out.println(ts);
	}
	@Test(priority =4)
	public void printConsecutiveChar() {
    String s="aabcbbdeaa";
    for(int i=0;i<s.length();i++) {
    	if((i+1)<s.length())
    	System.out.print(s.charAt(i)+""+s.charAt(i+1));
    	System.out.print(" ");
    }
	}
	@Test(priority = 5)
	public void exclusiveNoFromArray() {
		int [] a= {1,2,5};
		int n=10;
		//boolean b=true;
		int count=1;
		for(int i=1;i<=n;i++) {
			
			for(int j=0;j<a.length;j++) {
				if(a[j]==i) {
					//b=false;
					count++;
					break;
				}
			}
			if(count==1)
			System.out.print(i+" ");
			//b=true;
			count=1;
		}
	}
	@Test(priority = 6)
	public void incrementCharacterEverytimeafterPrint() {
		String s="Selenium";
		int n=0;
		for(int i=0;i<s.length();i++) {
//			for(int j=0;j<=i;j++){
//				System.out.print(s.charAt(j));
//			}
//			System.out.print(" ");
			System.out.print(s.substring(n,i));
			System.out.print(" ");
		}
	}
	// 27 and 28 are similar to 27==25, 28==24
	@Test(priority = 9)
	public void removeDuplicatesWithOutInBuilt() {
		String s="aaaaaaaaabbbbbbbbbbcccccccc";
		char[] ch = s.toCharArray();
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					ch[i]=';';
				}
			}
		}
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=';')
				System.out.print(ch[i]);
		}
		System.out.println();
	}
	@Test(priority = 10)
	public void reverseStringAllInWays() {
		String s="selenium";
		String st=" ";
		StringBuilder b=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			st=s.charAt(i)+st;
		}
		System.out.println(st.trim());
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		for(int i=s.length()-1;i>=0;i--) {
			b.append(s.charAt(i));
		}
		System.out.println(b);
	}
	@Test
	public void reverseConsequenceWords() {
		 String s="welcome to java programming and improve your skills";
	      String []st=s.split("\\s");
	      String req="";
	      for(int i=0;i<st.length;i++){
	          if(i%2==0){
	             for(int j=st[i].length()-1;j>=0;j--) {
	                 req=req+st[i].charAt(j);
	             }
	          }
	           else{
	                 req=req+st[i];
	             }
	          req=req+" ";
	      }
	           System.out.println();
	           System.out.println(req);
	           System.out.println();
	}
}

