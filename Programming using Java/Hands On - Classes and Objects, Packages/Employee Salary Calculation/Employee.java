public class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;
    private double netSalary;
    
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getNetSalary() {
        return netSalary;
    }
    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }
    public void display() {
        System.out.println("Id :"+employeeId);
        System.out.println("\nName : "+employeeName);
        System.out.println("\nSalary : "+salary);
        System.out.println("\nNet Salary : "+netSalary);
    }
    public void calculateNetSalary(int pfpercentage) {
        double d = salary*pfpercentage*0.01;
        setNetSalary(salary-d);
    }
}
