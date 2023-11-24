package srcTYArray;

public class ReverveTheSentanceWordsAndKeepSpacesPrviousStringPosition {
	/*
	 * input = i am selenium
	 * output= m ui nelsemai 
	 */
	public static void main(String[] args) {

		String s="i am selenium";
		char[] ch = s.toCharArray();
		char[] req=new char[ch.length];
		// to mark the spaces
		for(int i=0;i<req.length;i++) {
			if(ch[i]==' ') {
				req[i]=' ';
			}
		}
		// copy elements from ch to req only if char is not space and don't copy
		//top space places of req
		for(int i=0,j=ch.length-1;i<ch.length;i++) {
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


		//
		//	String rev=" ";
		//	int j=0;
		//	for(int i=ch.length-1;i>=0;i--) {
		//		if(j<=i&&ch[j]==' ') {
		//		rev=rev+ch[j];	
		//		}
		//		if(i>=0&&ch[i]!=' ') {
		//			rev=rev+ch[i];
		//			j++;
		//		}
		//	}
		//		System.out.println(rev);	
	}
}


