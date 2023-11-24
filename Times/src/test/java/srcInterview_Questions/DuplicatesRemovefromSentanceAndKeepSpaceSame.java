package srcInterview_Questions;

public class DuplicatesRemovefromSentanceAndKeepSpaceSame {

	public static void main(String[] args) {
       String s="all quick brown foxes Two driven jocks help fax my big quiz are Jump the ";
	 System.out.println(s);
       char[] c=s.toCharArray();
       for(int i=0;i<s.length();i++) 
       {
    	   char ch=s.charAt(i);
		 for(int j=i+1;j<s.length();j++) 
		 {
			 if(ch==c[j] && c[j]!=' ') 
			 {
	           c[j]=':';
			 }
	     }
		}
       for(int k=0;k<c.length;k++)
       {
    	   if(c[k]!=':')
    	   {
    	   System.out.print(c[k]);
    	   }
       }
      
	}
      
	}

