import java.util.*;

public class Main {
    public static void main(String[] args) {
        Employee obj = getEmployeeDetails();
        obj.calculateNetSalary(getPFPercentage());
        System.out.println("Id : "+obj.getEmployeeId());
        System.out.println("Name : "+obj.getEmployeeName());
        System.out.println("Salary : "+obj.getSalary());
        System.out.println("Net Salary : "+obj.getNetSalary());
    }
    public static Employee getEmployeeDetails() {
        Scanner sc = new Scanner(System.in);
        Employee obj = new Employee();
        System.out.println("Enter Id: ");
        obj.setEmployeeId(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter Name:");
        obj.setEmployeeName(sc.nextLine());
        System.out.println("Enter Salary:");
        obj.setSalary(sc.nextDouble());
        return obj;
    }
    public static int getPFPercentage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter PF percentage:");
        int pf = sc.nextInt();
        return pf;
    }
}