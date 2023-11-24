package srcInterview_Questions;

import java.util.Scanner;

public class SpecifiedIndexElement{
	static Scanner sc;  //=new Scanner(System.in);
	public static void findPatient(int n,int[] arr) {
		System.out.println("Enter the index of the element u want");
		int in=sc.nextInt(),ele=0;
	 for(int i=0;i<arr.length;i++) {
		 
		 if(in==i+1) {
		    ele=arr[i];
		 }
		 else if (in>=arr.length){
			 System.out.println("your array length was"+arr.length);
			try {
			 throw new OutOfRangeException(in);
			}
			catch (OutOfRangeException e) {
				System.out.println(e+" occured");
			}
		  }
	 }   
	 System.out.println(in+" "+ele);
	 test();
	}
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("Enter the Array length");
		int n=sc.nextInt();
		//n=n-1;
		int arr[] = new int[n];
		System.out.println("Enter the array values");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		findPatient(n,arr);
	}
	
	
	// EXTRA METHOD NOO NEED TO REFER THIS
	 public static void test() {
			System.out.println();
	    	System.out.println("press 1 to continue & press any number to stop the program");
	    	System.out.println();
	    	int n=sc.nextInt();
	    	if(n==1) {
	    	 main(null);
	    	}
	    	else {
	    		System.out.println(" Thank you...!");
	    	}
	    }

}
