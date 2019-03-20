class Car
{
	//Attributes
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String colour;
	
	public Car() {
		this.model = "Unknown";
	}
	public Car(String model)
	{
		this.model = model;
	}
	public void setModel(String model)
	{
		String validModel = model.toLowerCase();
		if(validModel.equals("correra") || validModel.equals("commodore"))
		{
			this.model = model;
		}
		else {
			this.model = "unknown";
		}
	}
	public String getModel()
	{
		return this.model;
	}
}
public class CarDetails {
     public static void main(String[] args)
     {
    	 Car poresche = new Car("commodore");
    	 Car holden = new Car();
    	 System.out.println("Model of poresche is "+poresche.getModel());
    	 System.out.println("Model of holden is "+holden.getModel());
     }
}
