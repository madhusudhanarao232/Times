package srcInterview_Questions;

public class CountOfAllTypeOfChars {

	public static void main(String[] args) {
		String s1="%MAdhu Sudha_Na R@O dandE232";
		char[] ch =s1.toCharArray();
		int lowerAlphC=0,upperAlphC=0,numC=0,spaceC=0,specialC=0,lowerVowelC=0,upperVowelsC=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				lowerVowelC++;	
			}
			else if(ch[i]=='A'||ch[i]=='E'||ch[i]=='O'||ch[i]=='I'||ch[i]=='U') {
				upperVowelsC++;
			}
			else if(ch[i]>='A'&&ch[i]<='Z') {
				upperAlphC++;
			}
			else if(ch[i]>='a'&&ch[i]<='z') {
				
				lowerAlphC++;
			}
			else if(ch[i]>='0'&&ch[i]<='9') {
				numC++;
			}
			else if(ch[i]==' ') {
				spaceC++;
			}
			else  {
				specialC++;
			}
		}
		System.out.println("lowerVowelC is: "+lowerVowelC);
		System.out.println("upperVowelsC is: "+upperVowelsC);
		System.out.println("lowerAlphC is: "+lowerAlphC); 
		System.out.println("upperAlphC is: "+upperAlphC);
		System.out.println("numC is: "+numC);
		System.out.println("spaceC is: "+spaceC);
		System.out.println("specialC is: "+specialC);
	}

}
