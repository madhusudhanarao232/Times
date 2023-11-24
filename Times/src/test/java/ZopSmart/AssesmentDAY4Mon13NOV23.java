package ZopSmart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class AssesmentDAY4Mon13NOV23 {
	@Test(priority = 1)
	public void twoDimensionalReverse() {
		int[][] a = {  
				{1, 2, 3},
				{8, 4, 9},
				{31, 11, 21}
		};
		/* out put 
        { {31,21,11},
          {9,8,4},
          {3,2,1}}
        }
		 */

		// Reverse the elements in each row
		for (int i = 0; i < a.length; i++) {
			int start = 0;
			int end = a[i].length - 1;
			Arrays.sort(a[i]);
			while (start < end) {
				// Swap elements in each row
				int temp = a[i][start];// 1-->0,0 |0,1|0,2|| 2-->1,0 |1,1 |1,2 || 3--> 2,0 |2,1 |2,2
				a[i][start] = a[i][end];// 1-->0,2 |0,1|0,0|| 2-->1,2 |1,1 |1,0 || 3--> 2,2 |2,1 |2,0
				a[i][end] = temp;

				// Move indices towards the center
				start++;
				end--;
			}
		}

		// Reverse the order of rows
		int numRows = a.length;
		int[][] result = new int[numRows][];
		for (int i = 0; i < numRows; i++) {
			result[i] = a[numRows - 1 - i]; //1==> 3-1-i=0-->2 || 2==>3-1-i=1-->1 ||3==>3-1-i=2-->0
		}

		// Print the result
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\u001B[1m"+"\u001B[34m"+Arrays.deepToString(a)+"\u001B[0m");
	}
	@Test(priority = 2)
	public void duplicatesINGIvenString()
	{
		String s="madhusudhanarao";
		LinkedHashSet<Character>set=new LinkedHashSet<Character>();
		// add to set it will remove duplicates from String
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));	
		}
		// comparing both Set as well as String
		for (Character character : set) {
			int count=0;
			for (int i = 0; i < s.length(); i++) {
				if(character==s.charAt(i)) {
					count++;
				}
			}
			if(count>1) {
				System.out.println("\u001B[1m"+"\u001B[33m"+character+" is Repeating : "+count+" times"+"\u001B[0m");
			}
		}
	}
	@Test(priority = 3)
	public void productOflastTwoDigits() {
		int a []= {2,4,7,9,10};
		int product=1;
		for(int i=a.length-1;i>=a.length-2;i--) {
			product=product*a[i];	
		}
		System.out.println("\u001B[1m"+"\u001B[32m"+"Product of LAST 2 Largest No is :"+product+"\u001B[0m");
	}
	@Test(priority = 4)
	public void sumANDproductOfTwoLists() {
		ArrayList<Integer> l1=new ArrayList<Integer>();
		ArrayList<Integer> l2=new ArrayList<Integer>();
		// adding elements into list ONE
		l1.add(2);
		l1.add(4);
		l1.add(9);
		l1.add(10);
		// adding elements into list TWO
		l2.add(3);
		l2.add(5);
		l2.add(9);
		l2.add(4);
		// declaring two sum var and ONE pro var
		int l1Sum=0,l2Sum=0,pro=1;
		for(int ll1:l1) {
			l1Sum=l1Sum+ll1;
		}
		for(int ll2:l2) {
			l2Sum=l2Sum+ll2;
		}
		pro=l1Sum*l2Sum;
		System.out.println("\u001B[1m"+"\u001B[31m"+"Product of TWO LISTS IS : "+pro+"\u001B[0m");
	}
	@Test
	public void k() {
		//	int [] a= {4,88,56,23,2,45,};
		//	Arrays.sort(a);
		//	System.out.println(Arrays.toString(a));
		int [][] a= {{1,2,3},{8,4,9},{31,11,21}};

		for(int i=a.length-1;i>=0;i--)
		{
			int[] b=a[i];
			for(int j=0;j<b.length;j++)
			{
				for(int k=j+1;k<b.length;k++)
				{
					if(b[j]<b[k])
					{
						int temp=b[j];
						b[j]=b[k];
						b[k]=temp;
					}
				}
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}



	}
}
