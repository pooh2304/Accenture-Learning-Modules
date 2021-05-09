/*

In the ticketing system of a Bank, each customer takes a ticket and is served when their number is called. Imagine there are five customers take a ticket from our ticketing 
system. The first customer has a ticket displaying the number 1 and the fifth customer has a ticket displaying the number 5. The customers who take the ticket should 
maintain a queue and the customer with the first ticket should be served first. When the first customer is served and that ticket is removed from the queue.

Implement this ticket system using appropriate data structure.

Note:
1. There is no limitation for the customers to take tickets.
2. Create a class called 'Ticket' to implement the main()

Sample Input Output 1: [Values given in bold represents the input]
Enter the number of customer takes the tickets:
3

The tickets in the system are:
1 2 3 

Enter the number of tickets served:
2

The served tickets are:
1 2 
The unserved tickets are:
3 

Note: In the above sample the input provided by the user are 3, 2 which represents "number of customer takes the tickets" and "number of tickets served".


Sample Input Output 2:
Enter the number of customer takes the tickets:
5

The tickets in the system are:
1 2 3 4 5 

Enter the number of tickets served:
5

The served tickets are:
1 2 3 4 5 
No more tickets to be served


Sample Input Output 3:
Enter the number of customer takes the tickets:
-3

Invalid Number

*/

import java.util.*;

public class Ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of customer takes the tickets:");
        int n = sc.nextInt();
        if(n>0) {
            int[] tickets = new int[n];
            System.out.println("The tickets in the system are:");
            for(int i=0;i<n;i++) {
                tickets[i]=i+1;
                System.out.print(tickets[i]+" ");
            }
            System.out.println(); 
            System.out.println("Enter the number of tickets served:");
            int served = sc.nextInt();
            if(served>0 && served<=n) {
                System.out.println("The served tickets are:");
                for(int i=0;i<served;i++)
                    System.out.print(tickets[i]+" ");
                System.out.println();
                if(served!=n) {
                    System.out.println("The unserved tickets are:");
                    for(int i=served;i<n;i++)
                        System.out.print(tickets[i]+" ");
                }
                else
                    System.out.println("No more tickets to be served");
            }
        }
        else
            System.out.println("Invalid Number");
    }
}
