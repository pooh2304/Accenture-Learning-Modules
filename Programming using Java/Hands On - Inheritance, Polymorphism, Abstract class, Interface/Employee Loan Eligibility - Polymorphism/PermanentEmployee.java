public class PermanentEmployee extends Employee{
    private double basicPay;
    
    public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
    
    public PermanentEmployee(int employeeId,String employeeName,double basicpay){
        super(employeeId,employeeName);
        this.basicPay=basicpay;
    }
    
    public void calculateSalary(){
        double PFamount=0;
        PFamount=(basicPay*0.12);
        setSalary(basicPay-PFamount);
    }
}