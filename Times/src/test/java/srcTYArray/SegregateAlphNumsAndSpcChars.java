package srcTYArray;

public class SegregateAlphNumsAndSpcChars {

	public static void main(String[] args) {
        String s="1b2%a3(t";
        String alp=" ";
        String num=" ";
        String spc=" ";
        for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)>='0'&& s.charAt(i)<='9') {
				num=num+s.charAt(i);
			}
			else if(s.charAt(i)>='A'&& s.charAt(i)<='Z'||s.charAt(i)>='a'&& s.charAt(i)<='z') {
				alp=alp+s.charAt(i);
			}
			else {
				spc=spc+s.charAt(i);
			}
		}
        System.out.println(num+alp+spc);
	}

}
