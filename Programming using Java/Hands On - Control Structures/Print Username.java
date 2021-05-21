/*

Jeffy, who is going to complete the higher education in this year needs to create a simple application which accept the name of a person and welcome them with a message along 
with their name. She wants to read the data using the class "Scanner". Implement this scenario using Java.

Sample Input 1: 
Enter the name:
Johson

Sample Output 1:
Welcome Johnson.


Sample Input 2: 
Enter the name:
Stain Polson

Sample Output 2:
Welcome Stain Polson.

*/

import java.util.Scanner;

class Username{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = scan.nextLine();
        System.out.println("Welcome " + name + ".");
    }
}
