package ZopSmart;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class AssesmentDay1Wed08NOV23 {
	@Test(priority = 1)
	public void rev()
	{
		/*
		 * input: Hi My name is Charan
		 * output:narahC si eman yM iH
		 */
		String s="Hi My name is Charan";
		String st="";
		int count=0,count1=0;
		for(int i=0;i<s.length();i++) {
			st=s.charAt(i)+st;
			//if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='A'&&s.charAt(i)<='Z') {
			if(s.charAt(i)=='c'||s.charAt(i)=='C')	{
				count++;
			}
			if(s.charAt(i)=='h'||s.charAt(i)=='H')	{
				count1++;
			}
				
		//}
		
	} 
		System.out.println(st);
		System.out.println("C :"+ count );
		System.out.println("H :"+ count1 );
	}
	@Test(priority = 2)
	public void Duplicate() {
		int [] arr1= {1,2,3,1};
		int [] arr2= {1,2,3};
		boolean res = genDupli(arr1);
		boolean res1 = genDupli(arr2);
		System.out.println(res+" "+res1);
	}
	public boolean genDupli(int[] a) {
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);	
		}
		for (int no : set) {
			int count=0;
			for (int i = 0; i < a.length; i++) {

				if(no==a[i]) {
					count++;
				}
			}
			if(count>1) {
				return false;
			}
		}	
		return true;	
	}	
}
