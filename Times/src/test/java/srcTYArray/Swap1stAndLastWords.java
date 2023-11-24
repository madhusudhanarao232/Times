package srcTYArray;

public class Swap1stAndLastWords {

	public static void main(String[] args) {
		String s="I am a student ab cd ";
		String []split=s.split(" ");
        int a=97,b=89;
        a=b+a;
        b=a-b;
        a=a-b;
        System.out.println(a+","+b);
		String temp=split[0];
		split[0]=split[split.length-1];
		split[split.length-1]=temp;

		for(int i=0;i<split.length;i++) {
			System.out.print(split[i]+" ");
		}

	}

}
