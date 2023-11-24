package srcArrays;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayOperation {
	public static Scanner sc=new Scanner(System.in);
	//common for all classes
	public int[] readArray()//Read the given array by user input 
	{
		
		System.out.println(" enter the size of the Array ");
		int n=sc.nextInt();
		int []a=new int[n];
		System.out.println(" enter "+n+" values ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		return a;
	}
	//common for all classes
	public void disArray(int [] a) //displaying method for array
	{
		System.out.print("{");
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");
		}
		System.out.print("}");
		System.out.println();
	}
	//1   //merge two elements into single array element
	public int[] merge(int []ar,int [] br)
	{
		int cr[]=new int[ar.length+br.length];
		for (int i=0;i<ar.length;i++) {
			cr[i]=ar[i];
		}
		for (int i=0;i<br.length;i++) {
			cr[ar.length+i]=br[i];	 
		}
		return cr;	 
	}
	//2  //Merge two sorted array elements into Single Array
	public int[] mergeSort(int []x,int []y) 
	{
		int z[]=new int[x.length+y.length];
		int i=0,j=0,k=0;
		while(i<x.length&&j<y.length) {
			if (x[i]<y[j])
				z[k++]=x[i++];
			else
				z[k++]=y[j++];
		}
		while(i<x.length)
			z[k++]=x[i++];	
		while(j<y.length)
			z[k++]=y[j++];
		return z;	
	}
	//3 //Reverse the Array
	public int reverseArray(int []a)
	{
		int i=0,j=a.length-1;
		while(i<j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;j--;
		}
		
		return j;
	}
	//4  //Return the count of Even no AND ODD no. count
	public int[] countEO(int []a)
	{
		int ec=0,oc=0;
		for (int i=0;i<a.length;i++) {
			if (a[i]%2==0)
				ec++;
			else
				oc++;	
		}
		int count[]= {ec,oc};
		return count;
	}
	//5  //TO get Smallest element from the array element
	public int getSmallest(int[]ar) 
	{
		int small= ar[0];
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<small)
				small=ar[i];
		}
		return small;
	}
	//6 //Sum of array elements 
	public int sumArray(int [] ar) 
	{
		int sum=0;
		for (int i=0;i<ar.length;i++) {
			sum=sum+ar[i];
		}
		return sum;
	}
	//7  //To Print count of prime numbers in the present array
	public int countPrime(int [] ar) 
	{
		int Count =ar.length;
		for (int i=0;i<ar.length;i++) {
			for(int j=2;j<ar[i]/2;j++) {
				if (ar[i]%j==0) {
					
					Count--;
					break;
				}
			}
		}
		return Count;
	}
	//8  // merge two Arrays in Zigzag order
	public int[] zigzag(int [] a,int [] b)
	{
		int []c=new int[a.length+b.length];
		int i=0,j=0;
		while(i<a.length&&i<b.length) {
			c[j++]=a[i];
			c[j++]=b[i++];
		}
		while (i<a.length)
			c[j++]=a[i++];
		while (i<b.length)
			c[j++]=b[i++];
		return c;
	}
	//9 
	//Every Array Element replaced by their sum digits
	public int[] replacedBySumDigits(int [] a) {
		for (int i=0;i<a.length;i++) {
			int x=a[i],sum=0;
			do {
				sum=sum+x%10;
				x=x/10;
			}
			while(x!=0);
			a[i]=sum;
		}
		return a;	
	}
	//10  //Insert the Array elements into specified index
	public int[] insertArr(int []x,int ele,int in)
	{
		/*
		System.out.println("Enter the INDEX");
		int index=sc.nextInt();
		if (index<0||index>x.length) {
			System.out.println("Index not in the range");
			return x;
		}
		System.out.println("Enter the ELEMENT ");
		int element=sc.nextInt();
		int y[]=new int[x.length+1];
		y[index]=element;
		for(int i=0;i<x.length;i++) {
			if (i<index)
				y[i]=x[i];
			else
				y[i+1]=x[i];
		}
		return y;
		*/
		if (in<0||in>x.length) {
			System.out.println("Index not in the range");
			return x;
		}
		int y[]=new int[x.length+1];     //in---->INDEX
		y[in]=ele;                       //ele--->Element
		for(int i=0;i<x.length;i++) {
			if (i<in)
				y[i]=x[i];
			else
				y[i+1]=x[i];
		}
		return y;
	}
	//11
	//Search the elements if bit is present return the INDEX else -1
	public int seachArr(int x[],int ele) {
		
		for (int i=0;i<x.length;i++) {
			if (x[i]==ele)
				return i;
		}
		return -1;
	}
	//12
	//Frequency of Each Array element 
	public void frequency(int ar[]) {
		boolean br[]=new boolean[ar.length];
		
		for (int i=0;i<ar.length;i++) {
			int count=1;
			if (br[i]==false) {
				for (int j=i+1;j<ar.length;j++) {
					if (ar[i]==ar[j]) {
						count++;
						br[j]=true;
					}
				} 
				
			}
			System.out.println(ar[i]+" is present in ------>"+count);
		}
	/*
	int br[]=new int[ar.length];
	int visited=-1;
	for (int i=0;i<ar.length;i++) {
		int count=1;
			for (int j=i+1;j<ar.length;j++) {
				if (ar[i]==ar[j]) {
					count++;
					br[j]=visited;
				}
			} 
			if(br[i]!=visited) {
				br[i]=count;
			}
			System.out.println(ar[i]+" is present in ------>"+count);
		}
	*/
	}
	//13
	//Delete the Array Elements from the Particular Array element
	public int[] deleteArray(int ar[],int in)
	{                                      // in----->INDEX
		if (in<0 || in>=ar.length) {
			System.out.println(" **--index not in the RANGE--** ");
			return ar;
		}
		int[] br=new int[ar.length-1];
		for (int i=0;i<ar.length-1;i++) {
			if(i<in) {
				br[i]=ar[i];
			}
			else
				br[i]=ar[i+1];
		}	
		return br; 
	}
	//14
	//Insert the ONE Array Elements into Another Array in Specified index
	public int[] insertArray(int ar[],int br[],int in) {
		if (in<0 || in>=ar.length) {
			System.out.println(" **--index not in the RANGE--** ");
			return ar;
		}
		int cr[]=new int[ar.length+br.length];
		for (int i=0;i<br.length;i++) {
			cr[in+i]=br[i];
		}
		for(int i=0;i<ar.length;i++) {
			if(i<in) {
				cr[i]=ar[i];
			}
			else
				cr[i+br.length]=ar[i];
		}		
		return cr;
	}
	
	
	
	
}


