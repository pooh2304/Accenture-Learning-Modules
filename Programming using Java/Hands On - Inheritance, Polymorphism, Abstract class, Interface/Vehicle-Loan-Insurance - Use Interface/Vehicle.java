public class Vehicle implements Loan,Insurance{
	private String vehicleNumber;
	private String modelName;
	private String vehicleType;
	private double price;
  
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Vehicle(String vehicleNumber, String modelName, String vehicleType,double price) {
		this.vehicleNumber = vehicleNumber;
		this.modelName = modelName;
		this.vehicleType=vehicleType;
		this.price = price;
	}
	public double issueLoan(){
	    double d=0.0;
	    if(vehicleType.equalsIgnoreCase("4 wheeler"))
	    d=price*0.8;
	    else if(vehicleType.equalsIgnoreCase("3 wheeler"))
	    d=price*0.75;
	    else if(vehicleType.equalsIgnoreCase("2 wheeler"))
	    d=price*0.50;
	    return d;
	}
	public double takeInsurance(){
	    double d=0.0;
	    if(price<=150000)
	    d=3500;
	    else if(price<=300000)
	    d=4000;
	    else if(price>300000)
	    d=5000;
	    return d;
	 }
}