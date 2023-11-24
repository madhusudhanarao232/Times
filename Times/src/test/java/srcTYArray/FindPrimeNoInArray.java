package srcTYArray;

public class FindPrimeNoInArray {

	public static void main(String[] args) {
     int arr[]= {1,4,7,9,3,5,13,45,2,44,59};
     boolean pr;
     for(int i=0;i<arr.length;i++) {
    	pr=primeCheck(arr[i]) ;
    	 if(pr==true) {
    		 System.out.println(arr[i]+" is prime number");
    	 }
    	 else
    		 System.out.println(arr[i]+" is NOT A prime number");
	 } 
     }
 public static boolean primeCheck(int n) {
	 for(int i=2;i<n/2;i++) {
		 if(n%i==0) {
			return false; 
		 } 
	 }
	return true;
	 
 }
}
