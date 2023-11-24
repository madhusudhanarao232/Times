package TY_Interview_Programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import org.testng.annotations.Test;

public class InterView_Programs_11to20 {
	@Test(priority = 1)
	public void codeForTryCatchFinallyBlock() {
		int a=10,b=0,c=0;
		try {
			c=(a/b);  

		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("-----completed------");
		}

	}
	@Test(priority = 2)
	public void whatHappenWillWrire_Return5_InTryblock() {
		int a = whatHappen(10);
		System.out.println(a);
	}
	public int whatHappen(int a) {
		try {
			return 5;
		}
		//	   catch(Exception e){
		//		   
		//	   }
		finally {
			System.out.println("When we use try finally block return5 will return the valuse"); 
			System.out.println("If we not use finally block it is CTE");
		}
	}
	@Test(priority = 3)
	public void abc() {
		int a= 5; 
		System.out.println("Not clarity about quesion");
	}
	@Test(priority = 4)
	public void diviBy2() {
		for (int i=1; i<=20;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	@Test(priority = 5)
	public void occurance1() {
		String s1 = "My name is rishav it contains ri and shav" ; 
		String[] st = s1.split(" ");
		LinkedHashMap<String, Integer>map=new LinkedHashMap<String, Integer>();
		for (int i = 0; i < st.length; i++) {
			map.put(st[i], i);
		}
		for (String s : st) {
			int count=0;
			for (int i = 0; i < st.length; i++) {
				if(s.equalsIgnoreCase(st[i])) {
					count++;	
				}
			}
			System.out.println(s+" -->repeating "+count+" times");
		}
	}
	@Test(priority = 6)
	public void primeNumbers1To100() {
		for (int i = 1; i <=100; i++) {
			int c=0;
			for (int j =1;j<=i;j++) {
				if(i%j==0)
					c++;
			} 
			if(c==2) {
				System.out.println("prime numbers-->"+i);
			}
		}
	}
	@Test(priority=7)
	public void printCountOfChar() {
		String s="aweexxxyyyyyy";
		int count=0;
		for(int i=0;i<s.length();i++) {
		count++;	
		}
		System.out.println(count);
	}
	@Test(priority =8)
	public void sortTheGivenArray() {
		int a[]= {4,8,22,55,72,12,3,1};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			}
		}
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+" ");
			}
	}
	@Test(priority =9)
	public void inOut() {
		//input: "Malayalam"
		//output: m:2a:4l:2y:1
		String s="Malayalam";
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			int count=0;
			for(int j=0;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) { 
					if(i>j) {
						break;
					}
					count++;
				}
			}
			if(count>0)
			System.out.print(s.charAt(i)+":"+count);
		}
		System.out.println();
	}
	@Test(priority = 10)
	public void sumOf3Ele() {
		int a[]={7, -6, 11, 9, 0, 4};
		Arrays.sort(a);
		int sum=0;
		for(int q=1;q<=3;q++) {
			sum+=a[q];
		}
		System.out.println(sum);
	}
}
