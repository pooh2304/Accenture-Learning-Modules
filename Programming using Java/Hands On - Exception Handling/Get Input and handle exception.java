/*

Get a number as input from the user using nextInt method of  Scanner.
If the input provided by the user is not a number (contains alphabets or special characters), it will throw an Exception, InputMismatchException.

When the input provided by the user is correct, print the number, else handle it using catch block for InputMismatchException and print the message as 
“Input should be a number”.

Note :  InputMismatchException is available in java.util package

Sample Input 1 :
45

Sample Output 1 :
The input is 45


Sample Input 2 :
abc45

Sample Output 1 :
Input should be a number

*/

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
		    int input = sc.nextInt();
		    System.out.println("The input is "+input);
		}
		catch (InputMismatchException e){
		    System.out.println("Input should be a number");
		}
	}
}
