/*

Ram participates in an online gaming contest, where he is asked to code logic in Java to reverse the given word using recursion. Help Ram to perform the same. Check the 
sample input and output statements for more clarifications.

Function signature should be: public static String reverseString(String str)

Implement the main() inside the class 'ReverseDriver'

Sample Input/Output 1:
Enter the string: teknoturf
Reversed string is: frutonket

Sample Input/Output 2:
Enter the string: krishna
Reversed string is: anhsirK

Sample Input/Output3:
Enter the string: Hello World
Reversed string is: dlroW olleH

*/

import java.util.Scanner;

class ReverseDriver {
    public static String reverseString(String str){
        if(str.isEmpty())
            return str;
        return reverseString(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scan.nextLine();
        System.out.print("Reversed string is: " + reverseString(str));
    }
}
