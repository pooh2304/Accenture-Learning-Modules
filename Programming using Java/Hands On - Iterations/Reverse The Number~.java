/*

Write a program to reverse a given number. Say for example, If the given number is 35(thrity five), it should be reversed as 53(fifty three).

If the input given is zero display "Output is:0". If the input is less than zero then display "Number should be positive".

Refer the sample input and output.

Sample Input 1 :
Enter The Number:
478

Sample Output  1:
Output is:874


Sample Input  2:
Enter The Number:
-470

Sample Output  2:
Number should be positive


Sample Input  3:
Enter The Number:
34

Sample Output  3:
Output is:43

*/

import java.util.*;

class ReverseNumber {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int rem, rev = 0;
        System.out.println("Enter The Number:");
        int num = sc.nextInt();
        
        if(num==0)
            System.out.println("Output is:0");
        else if(num<0)
            System.out.println("Number should be positive");
        else {
            while(num>0) {
                rem = num%10;
                rev = rev * 10 + rem;
                num /= 10;
            }
            System.out.println("Output is:"+rev);
        }
    }
}