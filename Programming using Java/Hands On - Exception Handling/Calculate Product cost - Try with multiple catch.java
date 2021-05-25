/*

Get 2 numbers as input from the user using nextInt method of  Scanner. First input is the total cost of photo frames (x) and the second input is the number of photo frames
purchased (n).
Find the cost of each photo frame (x / n)..

If the input provided by the user is not a number (contains alphabets or special characters), it will result in InputMismatchException. In such case, display the message 
as "InputMismatchException : Input should be an integer".

Also the second input should not be 0. If so it results in ArithmeticException. In such case, display the message as  "ArithmeticException : Cannot divide by zero".

Sample Input 1:
Enter the total cost of photo frames
640
Enter the number of photo frames
8

Sample Output 1:
Cost of each photo frame is 80


Sample Input 2:
Enter the total cost of photo frames
6.5

Sample Output 2:
InputMismatchException : Input should be an integer


Sample Input 3:
Enter the total cost of photo frames
640
Enter the number of photo frames
ab

Sample Output 3:
InputMismatchException : Input should be an integer


Sample Input 4:
Enter the total cost of photo frames
640
Enter the number of photo frames
0

Sample Output 4:
ArithmeticException : Cannot divide by zero

*/

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    try{
	        System.out.println("Enter the total cost of photo frames");
	        int totalCost = sc.nextInt();
	        sc.nextLine();
	        System.out.println("Enter the number of photo frames");
	        int photoFrames = sc.nextInt();
	        sc.nextLine();
	        int cost = totalCost/photoFrames;
	        System.out.println("Cost of each photo frame is " +cost);
	    }
	    catch(ArithmeticException e){
	        System.out.println("ArithmeticException : Cannot divide by zero");
	    }
	    catch(InputMismatchException e){
	        System.out.println("InputMismatchException : Input should be an integer");
	    }
	}
}
