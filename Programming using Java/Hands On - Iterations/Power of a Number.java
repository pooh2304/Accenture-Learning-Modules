/*

Ram is in the process of learning powers of a number.  He is given a number and a digit.  He has to find the power of that number to that digit.

Example if the number is 10 and the digit is  5 the output should be 105 = 100000. If either of the input is negative, the output should be “Invalid Input”.

Help him do this by writing a program in java.  Create a class "Power.java" and write the main method in it. Don't use in-built method to find the power.

Sample Input  1 :
Enter the number
5
Enter the digit
3

Sample Output  1 :
125


Sample Input  2 :
Enter the number
18
Enter the digit
4

Sample Output  2 :
104976

*/

import java.util.*;

class Power {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("Enter the digit");
        int digit = sc.nextInt();
        double result;
        int answer;
        
        if(num<0 || digit<0)
            System.out.println("Invalid Input");
        else {
            result = Math.pow(num,digit);
            answer = (int)result;
            System.out.println(answer);
        }
    }
}