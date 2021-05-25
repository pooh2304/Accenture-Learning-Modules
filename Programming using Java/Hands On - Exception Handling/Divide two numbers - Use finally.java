/*

Andrew wants to teach division of two numbers to his son. To make his kid understand it better, he wants to write a program that divides two numbers and displays the answer.
Help him do this by writing a java program.

Write a public class Division. Write a method divideTwoNumbers as:
    public String divideTwoNumbers(int number1,int number2) – This method should perform division as number1 / number2.

If number2 is zero, it will throw ArithmeticException.

Whether division is done successfully or not, it should concatenate the String as “Thanks for using the application”.

When division done successfully, it should return a message as:
    “The answer is <number1/number2>. Thanks for using the application.”

If it results in ArithmeticException, it should return a message as:
    “Division by zero is not possible. Thanks for using the application.”

Use try, catch and finally to perform the above task.

Write the main method and test the above function.

Sample Input 1:
Enter the numbers
15
3

Sample Output 1:
The answer is 5. Thanks for using the application.


Sample Input 2:
Enter the numbers
15
0

Sample Output 2:
Division by zero is not possible. Thanks for using the application.


Sample Input 3:
Enter the numbers
15
2

Sample Output 3:
The answer is 7. Thanks for using the application.

*/

import java.util.*;

public class Division {
    public String divideTwoNumbers(int number1,int number2){
        int value = 0;
        String str = "";
        try{
            value=number1/number2;
            str = ("The answer is "+value);
        }
        catch(ArithmeticException e){
            str = "Division by zero is not possible";
        }
        finally{
            return(str+". Thanks for using the application.");
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        Division div = new Division();
        System.out.println(div.divideTwoNumbers(num1,num2));
    }
}