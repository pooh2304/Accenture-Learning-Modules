/*

Vikram buys an old scooter for Rs. A and spends Rs. B on its repairs. If he sells the scooter for Rs. C , What is the gain %?
    1. If old price or sold price results in zero or negative or repair price is negative, then display "Incorrect Inputs"
    2. If  Selling price is not greater than Price of  [old scooter + Repaired amount]  display  "Unable to calculate Gain Percentage" .
Refer the samples for read and display the data. The Gain percentage should be displayed with 2 decimal digits.

Sample Input 1:
Price of old scooter:
4700
The amount spent for repair:
800
Sold Price:
5800

Sample Output 1:
Gain percentage is 5.45


Sample Input 2:
Price of old scooter:
8500
The amount spent for repair:
700
Sold Price:
5000

Sample Output 2:
Unable to calculate Gain Percentage


Sample Input 3:
Price of old scooter:
-15000
The amount spent for repair:
450
Sold Price:
20000

Sample Output 3:
Incorrect Inputs

*/

import java.util.Scanner;
class Gain{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Price of old scooter:");
        double o = s.nextDouble();
        System.out.println("The amount spent for repair:");
        double m = s.nextDouble();
        System.out.println("Sold Price :");
        double n = s.nextDouble();
        
        if(o<=0 || m<0 || n<=0)
            System.out.println("Incorrect Inputs");
        else if(n<(o+m))
            System.out.println("Unable to calculate Gain Percentage");
        else {
            double g = 0, l = 0;
            g = n - (m+o);
            l = (g*100)/(m+o);
            if(l>=0)  {
                System.out.print("Gain percentage is ");
                System.out.printf("%.2f",l);
            }
        }
    }
}