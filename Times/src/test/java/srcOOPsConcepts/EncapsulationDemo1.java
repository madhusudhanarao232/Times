package srcOOPsConcepts;

public class EncapsulationDemo1 {
	private String Brandname;//For car or bikes
	private int Vehicleno;
	private double Vehicleprice;
	private String ModelName;
	private String color;
	
	public EncapsulationDemo1(String Brandname,int Vehicleno,double Vehicleprice,String ModelName,String color) {
		this.Brandname=Brandname;
		this.Vehicleno=Vehicleno;
		this.Vehicleprice=Vehicleprice;
		this.ModelName=ModelName;
		this.color=color;
	}

	public double getVehicleprice() {
		return Vehicleprice;
	}

	public void setVehicleprice(double vehicleprice) {
		this.Vehicleprice = vehicleprice;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrandname() {
		return Brandname;
	}
	public String getModelName() {
		return ModelName;
		
	}

	public int getVehicleno() {
		return Vehicleno;
	}
	public void purpose() {
		System.out.println(" Used for Travelling..............");
		System.out.println();
		System.out.println("-----------Reached destination-------------");
		System.out.println();
		System.out.println();
		System.out.println();
	}
	


}
