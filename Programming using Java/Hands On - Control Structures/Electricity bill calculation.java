/*

Write a java program to calculate the EB-Bill based on the usage
a)No charge, if usage is less than or equal to 20 units.
b)Rs.3.50 per unit, if usage is greater than 20 units and less than 100 units.
c)Rs.5.00 per unit, if usage is greater than or equal to 100 units.

Sample Input 1:
Enter the units consumed
19

Sample Output 1:
No Charge


Sample Input 2:
Enter the units consumed
200

Sample Output 2:
You have to pay Rs.1000.0

*/

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units consumed");
        int units = sc.nextInt();
        double price = 0;
        
        if(units<=20)
            System.out.println("No Charge");
        else { 
            if(units>20 && units<100)
                price = units * 3.50;
            else if(units>=100)
                price = units * 5.00;
            System.out.println("You have to pay Rs."+price);
        }
    }
}