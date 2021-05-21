/*
In a multiplex theater, there is a discount scheme announced where one gets a 10% discount on the total cost of tickets when there is a bulk booking of more than 20 tickets, and a discount of 2% on the total cost of tickets if a special coupon card is submitted. Develop a program to find the total cost as per the scheme. The cost of the king class ticket is Rs.75 and queen class is Rs.150. Refreshments can also be opted by paying an additional of Rs. 50 per member.
Hint: k-king and q-queen and You have to book minimum of 5 tickets and maximum of 40 at a time. If fails display "Minimum of 5 and Maximum of 40 Tickets".  If circle is given a value other than 'k' or 'q' the output should be "Invalid Input".

The ticket cost should be printed exactly to two decimal places.

Sample Input 1:
Enter the no of ticket:35
Do you want refreshment:y
Do you have coupon code:y
Enter the circle:k

Sample Output 1:
Ticket cost:4065.25


Sample Input 2:
Enter the no of ticket:1

Sample Output 2:
Minimum of 5 and Maximum of 40 Tickets

*/

import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        int noTicket;
        double total = 0, cost;
        String ref, co , circle;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of ticket:");
        noTicket = s.nextInt();
        if (noTicket < 5 || noTicket > 40) {
            System.out.println("Minimum of 5 and Maximum of 40 tickets");
            System.exit(0);
        }
        System.out.println("Do you want refreshment:");
        ref = s.next();
        System.out.println("Do you have coupon code:");
        co = s.next();
        System.out.println("Enter the circle:");
        circle = s.next();
        if(circle.charAt(0) == 'k')
            cost = 75*noTicket;
        else if(circle.charAt(0) == 'q')
            cost = 150*noTicket;
        else {
            System.out.println("Invalid Input");
            return;
        }
        total = cost;
        if(noTicket>20)
            cost = cost - ((0.1)*cost);
        total = cost;
        if(co.charAt(0)== 'y')
            total = cost - ((0.02)*cost);
        if(ref.charAt(0)== 'y')
            total += (noTicket*50);
        System.out.format("Ticket cost:%.2f",total);
    }
}