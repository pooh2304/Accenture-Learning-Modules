/*

Develop an application to validate the PAN number of a person using regular expression.

Create a class UserMain and do the I/O operations. Refer the samples given, to read the data and display the output.

PAN Number should have exactly ten characters.  First 5 characters should be alphabets in upper case, next four characters should be digits from 0 to 9 and the last character should be an alphabet in capital case.

Sample Input 1:
Enter your PAN number
SSTHP1234L

Sample Output 1:
Valid PAN number


Sample Input 2:
Enter your PAN number
GBSPL78945

Sample Output 2:
Invalid PAN number

*/

import java.util.*;
import java.util.regex.*;

class UserMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your PAN number");
        String number = sc.nextLine();
        int length = number.length();
        if(length == 10){
            Pattern pattern = Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]");
            Matcher matcher = pattern.matcher(number);
            if(matcher.matches())
                System.out.println("Valid PAN number");
            else
                System.out.println("Invalid PAN number");
        }
        else
            System.out.println("Invalid PAN number");
    }
}