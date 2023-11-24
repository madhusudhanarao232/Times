package TY_Interview_Programs;

import org.testng.annotations.Test;

public class InterView_Programs_31to40 {
	@Test(priority = 1)
	public void h() {
		String s="abcd";
		String s1="12";//a1b2cd
		char[] c = s.toCharArray();
		char[] c1 = s1.toCharArray();
		int i=0,j=0;
		char crr[]=new char[c.length+c1.length];
		while(i<c.length&&i<c1.length) {
			crr[j++]=c[i];
			crr[j++]=c1[i++];
		}
		while(i<c.length)
			crr[j++]=c[i++];
		while(i<c1.length)
			crr[j++]=c1[i++];
		for(int z=0;z<crr.length;z++) {
			System.out.print(crr[z]);
		}
		System.out.println();
	}
@Test(priority = -1)
public void p() {
	
	String s="abcdhf";
	String s1="123";//a1b2c3d
	char[] c = s.toCharArray();
	char[] c1 = s1.toCharArray();
	//int i=0,j=0;
	
	int len=c.length;
	if(c.length>c1.length)
	{
		len=c1.length;
	}
	
	String temp="";
	for(int i=0;i<len;i++)
	{
			temp+=c[i]+""+c1[i];
	}
	int j=len;
	while(c.length>c1.length) {
		if(len<c.length) {
		temp+=c[len];
		len++;
	}
		else
			break;
	}
	System.out.println(temp);
}
@Test
public void without() {// madhusudhanarao232@gmail.com   https://d4b860fc93a5.simbla-sites.com/
	String s="abcdefg";//  https://www.simbla.com/
	String s1="123";//a1b2c3d    https://www.saasworthy.com/list/crm-software
	int len=s.length();
	if(s.length()>s1.length())
		len=s1.length();
	String temp="";
	for(int i=0;i<len;i++)
	{
			temp+=s.charAt(i)+""+s1.charAt(i);
	}
	int j=len;
	while(j<s1.length()||j<s.length()){
		if(j<s1.length()) {
		temp+=s1.charAt(j);
		j++;
	}
		else
			break;
	}
	System.out.println(temp);
}
}
