package srcMadhuPack;

import java.util.LinkedHashSet;

public class DemoArray {

	public static void main(String[] args) {
     int a[]= {2,4,3,2,4,5};
     int [] b= {8,9,10,4,2,1};
     LinkedHashSet<Integer> ls=new LinkedHashSet<Integer>();
     int c[]=new int[a.length+b.length];
     for(int i=0;i<a.length;i++) {
    		c[i]=a[i]; 
     }
     for(int i=0;i<b.length;i++) {
    	c[a.length+i]=b[i];
     }
     for(int i=0;i<c.length;i++) {
    	 ls.add(c[i]);
     }
     for(int l:ls) {
    	 System.out.println(l);
     }
	}

}
