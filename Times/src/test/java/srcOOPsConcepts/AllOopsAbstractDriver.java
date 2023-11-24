package srcOOPsConcepts;

public class AllOopsAbstractDriver extends AllOopsAbstract{

	public AllOopsAbstractDriver() {
		super("Madhu");
		super.overRide();
		System.out.println("sub-class Constructor");
	}
	public static void main(String[] args) {
		//up casting
		AllOopsAbstract all=new AllOopsAbstractDriver();
		//down casting
		AllOopsAbstractDriver d=(AllOopsAbstractDriver)all;
		//Using private var value out side the class by using getter method
		System.out.println(all.getName());
		//Calling parent class test()
		all.test();
		//Calling parent class test(int para)
		all.test(10);
		//Calling sub-class overRide
		d.overRide();
		//providing imp for abstract method
		d.demoAbstract();
		//callling test2() it will  Calling parent class overRide()
		//d.test2();
	}

	@Override
	public void demoAbstract() {
      System.out.println("providing implementation in Sub-class");		
	}
	//override
	public void overRide() {
		System.out.println("overRiden in Sub class");
	}
//	public void test2() {
//		super.overRide();
//	}
}
