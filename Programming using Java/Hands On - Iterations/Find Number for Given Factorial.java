/*

Tom teaches his student to find the factorial of a number.  He wanted to test the understanding of the student.  For that, he provides a number.  He wants the students to tell him that number is a factorial of which number.

Example : If Tom provides the number as 120, the student should answer as 5 because 5! = 120.

Help the student by writing a program to do this.  Note that the  input should be a number greater than zero.  If the input is less than or equal to zero, the output should be “Invalid Input”.  Also, if the input provided is not exactly the factorial of a number,  say, the input provided is 122, which is not a perfect factorial of a number, it should return “Sorry. The given number is not a perfect factorial”.

Sample Input 1 :
5040

Sample Output 1 :
7


Sample Input 2 :
0

Sample Output 2 :
Invalid Input


Sample Input 3 :
700

Sample Output 3 :
Sorry. The given number is not a perfect factorial

*/

import java.util.*;

class FindNumber {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i;
        
        if(num<=0)
            System.out.println("Invalid Input");
        else {
            i = 1;
            while(num>i) {
                if(num%i != 0) {
                    System.out.println("Sorry. The given number is not a perfect factorial");
                    break;
                }
                num /= i;
                ++i;
            }
            if(i==num)
                System.out.println(i);
        }
    }
}