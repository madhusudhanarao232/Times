package TY_Interview_Programs;

import org.testng.annotations.Test;

public class Paterns {
	@Test(priority=1)
	public void SURT() {
		/*
   * * * * *
     * * * *
       * * *
         * *
           *
		 
		 */
		int n=5;
		for(int i=n;i>=1;i--) {
			for(int sp=0;sp<=n-i;sp++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		System.out.println();
	}
	@Test(priority=2)
	public void SLRT() {
		/*
		         *
		       * *
		     * * *
		   * * * *
		 * * * * *


		 */
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int sp=0;sp<=n-i;sp++){
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		System.out.println();
	}
	@Test(priority=3)
	public void SULT() {
		/*
		 * * * * *
		 * * * *
		 * * *
		 * *
		 *
		 */
		int n=5;
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		System.out.println();
	}
	@Test(priority = 4)
	public void SLLT() {
		/*
		 *
		 * *
		 * * *
		 * * * *
		 * * * * *
		 */
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		System.out.println();
	}
	@Test(priority =5)
	public void SEquiLateralTriangle() {
		/*

		     * 
		    * * 
		   * * * 
		  * * * * 
		 * * * * * 

		 */
		int n=5;
		for(int i=n;i>=0;i--) {
			for(int j=1;j<=n;j++) {
				if(i<j)
					System.out.print("* ");
				else
					System.out.print(" ");// single space
			}
			System.out.println();
		}
		System.out.println();
	}
	@Test(priority = 6)
	public void InvertedTraiangle() {
		/*

		 * * * * *
		  * * * *
		   * * *
		    * *
		     *
		 */
		int n=5;
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=1;j--) {
				if(i>=j)
					System.out.print(" *");
				else
					System.out.print(" ");// single space
			}
			System.out.println();
		}
		System.out.println();
	}
	@Test(priority = 7)
	public void EquiTriangle() {
		/*
		         * 
		       * * * 
		     * * * * * 
		   * * * * * * * 
		 * * * * * * * * * 
		 */
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int sp=1;sp<=(n-i);sp++) {
				System.out.print("  ");
			}
			for(int j=1;j<=(2*i-1);j++) {
				System.out.print("* ");

			}
			System.out.println();
		}
		System.out.println();
	}
	@Test(priority = 8)
	public void InvetedEquiTriangle() {
		/*
		 * * * * * * * * * 
		   * * * * * * * 
		     * * * * * 
		       * * * 
		         * 
		 */
		int n=5;
		for(int i=n;i>=1;i--) {
			for(int sp=1;sp<=(n-i);sp++) {
				System.out.print("  ");
			}
			for(int j=1;j<=(2*i-1);j++) {
				System.out.print("* ");

			}
			System.out.println();
		}
		System.out.println();
	}
	@Test(priority = 9)
	public void diamond() {
		/*
      * 
    * * * 
  * * * * * 
* * * * * * * 
  * * * * * 
    * * * 
      * 
		 */
		int n=7,sp=n/2,st=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=st;j++) {
			System.out.print("* ");
			}
			if(i<=n/2) {
                sp--;
                st=st+2;
				}
			else {
				sp++;
				st=st-2;
			}
			System.out.println();
		}
		System.out.println();
	}
	@Test(priority = 10)
	public void doubledumbel() {
		/*
* * * * * * * 
  * * * * * 
    * * * 
      * 
    * * * 
  * * * * * 
* * * * * * * 
		 
		 
		 */
		int n=7,sp=0,st=n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++)
				System.out.print("  ");
			for(int j=1;j<=st;j++) {
				System.out.print("* ");
			}
			if(i<=n/2) {
				sp++;
				st-=2;
			}
			else {
				sp--;
				st+=2;
			}
			System.out.println();
		}
		System.out.println();
	}
	@Test(priority = 11)
	public void pascalsTriangle() {
		/*
		 *  1 
           1 1 
          1 2 1 
         1 3 3 1 
        1 4 6 4 1 

		 */
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++)
				System.out.print(" ");
			int x=1;
			for(int j=1;j<=i;j++) {
				System.out.print(x+" ");
				x=x*(i-j)/j;
			}
			System.out.println();
		}
		System.out.println();
	}
	
}
