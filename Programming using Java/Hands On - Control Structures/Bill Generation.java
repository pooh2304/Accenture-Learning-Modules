/*

Tom went to a movie with his friends in a multiplex theatre and during  break time he bought pizzas, puffs and cool drinks. Consider   the following prices :
    Rs.100/pizza
    Rs.20/puffs
    Rs.10/cooldrink
Generate a bill for What Tom has bought.

Sample Input 1:
Enter the no of pizzas bought:10
Enter the no of puffs bought:12
Enter the no of cool drinks bought:5

Sample Output 1:
Bill Details
No of pizzas:10
No of puffs:12
No of cooldrinks:5
Total price=1290
ENJOY THE SHOW!!!

*/

import java.util.Scanner;

class SnacksDetails{
    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);
        
		System.out.print("Enter the no of pizzas bought:");
        int pizzas = scan.nextInt();
        System.out.print("Enter the no of puffs bought:");
        int puffs = scan.nextInt();
        System.out.print("Enter the no of cool drinks bought:");
        int cooldrinks = scan.nextInt();
        
        int total = (100*pizzas) + (20*puffs) + (10*cooldrinks);
        
		System.out.println("Bill Details");
        System.out.println("No of pizzas:"+pizzas);
        System.out.println("No of puffs:"+puffs);
        System.out.println("No of cooldrinks:"+cooldrinks);
        System.out.println("Total price="+total);
        System.out.println("ENJOY THE SHOW!!!");
    }
}