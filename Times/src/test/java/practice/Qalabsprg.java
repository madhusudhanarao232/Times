package practice;
/**
 * <p> This class is used to compare the two String array values</p>
 */
public class Qalabsprg {

	public static void main(String[] args) {
		// intilizing fisrt array
		String[] array={"red", "green", "yellow", "blue"};
		// intilizing fisrt array
		String [] array1={"green", "blue1", "red2", "yellow"};
		boolean Boolean= false;
		StringBuilder b=new StringBuilder();
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array1.length;j++)
			{
				if(array[i].equalsIgnoreCase(array1[j]))
				{
					b.append(array[i]);
					b.append(" ");
					Boolean=true;
				}
			}
		}
		System.out.println(b);
		if(!true)
		{
			System.out.println("  both arrays contains same elements :"+Boolean);
		}else
		{
			System.out.println("  both arrays not contains same elements :"+Boolean);
		}

	}

}
