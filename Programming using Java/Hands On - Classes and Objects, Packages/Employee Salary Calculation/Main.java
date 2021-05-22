/*

Create a class Employee with the following private member variables.
    int employeeId
    String employeeName
    double salary
    double netSalary
    
Include appropriate getters and setters method in Employee class. Write the following method in the Employee class:
public void calculateNetSalary(int pfpercentage)  - This method should take PF percentage as argument. Deduct the PF amount from the salary and set the netSalary.  

Create a Main class which has the main method which invokes the method to get the input and prints the details as shown in the sample. 

Also write a method :
   public static Employee getEmployeeDetails() -  which gets the employee details and returns the employee object.
   public static int getPFPercentage() -  which gets the PF percentage and returns the same

Note: Do not create a static reference for the Scanner class, create a scanner object inside the method.

Sample Input 1:
Enter Id:
101
Enter Name:
Vivek
Enter salary:
20000
Enter PF percentage:
7

Sample Output 1:
Id : 101
Name : Vivek
Salary : 20000.0
Net Salary : 18600.0

*/

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
