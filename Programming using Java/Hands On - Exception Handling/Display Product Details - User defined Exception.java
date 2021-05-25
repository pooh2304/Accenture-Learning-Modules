/*

Get the input  of  product name and price and print the same. The price should be greater than or equal to 100. If valid print the product details. Else throw a user defined 
exception, InvalidPriceException with the message “InvalidPriceException - Product price invalid”. Print this message using getMessage method.

For this, you are provided with a public class InvalidPriceException. This class should inherit the Exception class and write a single argument constructor (String) which 
needs to be set to the message of super class.

Use throw keyword to throw user defined exception.

Input consists of a String and an int.

Sample Input 1 :
Enter product name
Perfume
Enter price
360

Sample Output 1:
Name : Perfume
Price : 360


Sample Input 2 :
Enter product name
Wallet
Enter price
50

Sample Output 2:
InvalidPriceException - Product price invalid

*/

import java.util.Scanner;
    
public class Main{
	public static void getMessage(int price, String name) throws InvalidPriceException{
		if(price<100)
			throw new InvalidPriceException("InvalidPriceException - Product price invalid");
		else{
			System.out.println("Name:"+name);
			System.out.println("Price:"+price);
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter product name");
	    String name = sc.nextLine();
	    System.out.println("Enter price");
	    int price = sc.nextInt();
	    try{
	        getMessage(price,name);
	    }
	    catch(InvalidPriceException e){
	        System.out.println(e.getMessage());
	    }
	}
}
