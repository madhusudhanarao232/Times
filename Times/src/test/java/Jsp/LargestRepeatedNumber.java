package Jsp;

import java.util.LinkedHashSet;

public class LargestRepeatedNumber {

	public static void main(String[] args) {
		// wajpt print largest reapeted number
		
		String s="1 44 3 5 77 34 23 77 3 44 89 89 94";
		String[] sarr= s.split(" ");
		LinkedHashSet<String> set =new LinkedHashSet<String>();
        for(int i=0;i<sarr.length;i++) {
           set.add(sarr[i]);	
        }
        int n=sarr.length;  
        int [] a=new int[n];
        for(String s1:set) {
        	int count=0;
        	for(int i=0;i<sarr.length;i++) {
        		if(s1.equalsIgnoreCase(sarr[i])) {
        			count++;
        			if(count>1) {
        			int b = Integer.parseInt(sarr[i]);
        		    a[i]=b;
        			}
        		}
        	}
        }
        for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				} // if   		 
			}// inner for
			//System.out.print(a[i]+"  ");
		}//Outer for
		System.out.println();
		System.out.println(a[0]+" is the loggest repeated number");
	}

}
