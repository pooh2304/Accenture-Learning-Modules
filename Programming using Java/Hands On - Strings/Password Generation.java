/*

IDFC, a leading Bank sector offers online shopping to their customers, To avail this offer, the customer will have to generate a security code, for the first time usage of his card to purchase online.

Hint to generate a security code is as follows :
    Minimum of 8 Characters
    Must contain atleast one uppercase, one lowercase and one special character.
    Only the special characters @,*,#  are allowed.

The code fails to meet the criteria, will response with an error message as shown in the sample output.

Develop an application to implement this scenario.

Write a public class Main with the main method.  Write the code to get the input, validate and print the output.

Sample Input 1:
Generate your Security Code
Ab12345@

Sample Output 1:
Security Code Generated Successfully


Sample Input 2:
Generate your Security Code
S1995p123

Sample Output 2:
Invalid Security Code, Try Again!

*/

import java.util.*;

public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Generate your Security Code");
        String code = sc.next();
        String pattern="^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#*])(?=\\S+$).{8,}$";
        if(code.matches(pattern))
            System.out.println("Security Code Generated Successfully");
        else
            System.out.println("Invalid Security Code, Try Again!");
    }
}