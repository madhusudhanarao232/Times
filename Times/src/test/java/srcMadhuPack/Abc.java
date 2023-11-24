package srcMadhuPack;

public class Abc {

	public static void main(String[] args) {
    String s="india is in globe";
    char[] ch = s.toCharArray();
    for(int i=0;i<ch.length;i++) {
    	if(ch[i]=='n') {
    		ch[i]='t';
    	}
    }
    s=new String(ch);
    System.out.println(s);
	}

}
