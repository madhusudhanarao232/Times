package srcOOPsConcepts;

public abstract class AllOopsAbstract {
	//data hiding declaring var
   private String name;
   // No argument constructor
   public AllOopsAbstract() {
	 
	}
   //Parameterized constructor and Intializing var
   public AllOopsAbstract(String name) {
	
	   this.name=name;
	   System.out.println("from super class constructor");
   }
   //Utilization for private var
   public String getName() {
		return name;
	}
   // abstract method
   public abstract void demoAbstract(); 
// method overLoading
   public static void test() {
	   System.out.println("Over Loading No Arguments"); 
   }
   // method overLoading
   public static void test(int para) {
	   System.out.println("Over Loading Int Para"); 
   }
   // Override concept
   public void overRide() {
	   System.out.println("from Over_ride method of abstract parent class");
   }
   
}
