public class TemporaryEmployee extends Employee {
	private int  hoursWorked;
	private int hourlyWages;
	
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public int getHourlyWages() {
		return hourlyWages;
	}
	public void setHourlyWages(int hourlyWages) {
		this.hourlyWages = hourlyWages;
	}

	public TemporaryEmployee(int a,String b,int c,int d){
	    super(a,b);
	    this.hoursWorked=c;
	    this.hourlyWages=d;
	}
	
	public void calculateSalary(){
	    setSalary(hoursWorked*hourlyWages);
	}
}