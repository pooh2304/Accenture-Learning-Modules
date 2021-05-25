/*

Write a program to check  the  PAN card no is valid or not. Generally a PAN no is a mix of both numbers and alphabets. It should have exactly 10 characters, in which, the first 5 characters should be upper case, the next 4 should be numbers, and last one should be an upper case character. If the PAN no doesn't match the pattern print "Invalid PAN no".

Sample Input 1:
Enter the PAN no:
ASDFG7896K

Sample Output 1:
Valid PAN no


Sample Input 2:
Enter the PAN no:
7896ABC8K

Sample Output 2:
Invalid PAN no

*/

import java.util.*;
import java.util.regex.*;

class PanCard{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the PAN no:");
        String number = sc.nextLine();
        int length = number.length();
        if(length == 10){
            Pattern pattern = Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]");
            Matcher matcher = pattern.matcher(number);
            if(matcher.matches())
                System.out.println("Valid PAN no");
            else
                System.out.println("Invalid PAN no");
        }
        else
            System.out.println("Invalid PAN no.");
    }
}