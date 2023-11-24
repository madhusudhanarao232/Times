package srcInterview_Questions;

import java.util.Scanner;

public class Encoding {
	static Scanner sc;//=new Scanner(System.in); 
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		String e=encoded(str);
		System.out.println(e);
		test();
	} 
	public static String encoded(String str) {
		String res="";
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
		   if(ch[i]>='a'&&ch[i]<='z'||ch[i]>='A'&&ch[i]<='Z') {
			  if(ch[i]>='a'&&ch[i]<='m') {
				  ch[i]=(char)(ch[i]+13);
			  }
			  else if(ch[i]>='n'&&ch[i]<='z') {
				  ch[i]=(char)(ch[i]-13); 
			  }
			  else if (ch[i]>='A'&&ch[i]<='M') {
				  ch[i]=(char)(ch[i]+13);
			  }
			  else if(ch[i]>='N'&&ch[i]<='Z') {
				  ch[i]=(char)(ch[i]-13);
			  }
		   }			
		}
		res=new String(ch);
		return res;		
	}
    public static void test() {
    	System.out.println();
    	System.out.println("press 1 to continue & press any number to stop the program");
    	System.out.println();
    	int n=sc.nextInt();
    	if(n==1) {
    	 main(null);
    	}
    	else {
    		System.out.println(" Thank you...!");
    	}
    }
    
}
