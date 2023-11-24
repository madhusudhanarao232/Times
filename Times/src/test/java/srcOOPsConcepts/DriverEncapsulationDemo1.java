package srcOOPsConcepts;

public class DriverEncapsulationDemo1 {

	public static void main(String[] args) {
		EncapsulationDemo1 a=new EncapsulationDemo1("Toyoto", 01, 2583554.0,"Fortuner" ,"siver");
		EncapsulationDemo1 b=new EncapsulationDemo1("TATA", 02, 853554.0,"Nexon" ,"Green");
		EncapsulationDemo1 c=new EncapsulationDemo1("Mahindra", 03, 2003554.0,"Thar" ,"dark Black");
		EncapsulationDemo1 d=new EncapsulationDemo1("Suzuki", 04, 683554.0,"Swift Dzire" ,"light Biscut");
		EncapsulationDemo1 e=new EncapsulationDemo1("KIA", 05, 4083554.0,"carnival" ,"light black");
		disDetails(a);
		disDetails(b);
		disDetails(c);
		disDetails(d);
		disDetails(e);
	}

	private static void disDetails(EncapsulationDemo1 details) {
		System.out.println("Brand Name:  "+details.getBrandname());
		System.out.println("Vehicle No:  "+details.getVehicleno());
		System.out.println("Price:  "+details.getVehicleprice());
		System.out.println("Model Name:  "+details.getModelName());
		System.out.println("color:  "+details.getColor());
		details.purpose();
	}

}
