/*

The authority of XYZ gated residential colony wants its residents' name datum Should be stored in the following format - residents' name <space> his/her father's name. Write a program to concat the father's name to the residents' name. The name should be validated,on validation the name should contain only alphabets and space is allowed. If the name is not valid display the message "Invalid name". If valid string then convert  it to uppercase and print it..

[Use concat(String s) of the String class.]

Sample Input 1:
Inmate's name:Aron
Inmate's father's name:Terby

Sample Output 1:
ARON TERBY


Sample Input 2:
Inmate's name:Mary Anto
Inmate's father's name:Jose

Sample Output 2:
MARY ANTO JOSE


Sample Input 3:
Inmate's name:Dev12
Inmate's father's name:Terby

Sample Output 3:
Invalid name

*/

import java.util.*;
import java.util.regex.*;

class Authority{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inmate's name: ");
        String first = sc.nextLine();
        System.out.println("Inmate's father's name:");
        String second = sc.nextLine();
        Pattern pattern = Pattern.compile("^[a-zA-Z ]*$");
        Matcher matcher1 = pattern.matcher(first);
        Matcher matcher2 = pattern.matcher(second);
        if(matcher1.matches()==true && matcher2.matches()==true)
            System.out.println(first+" "+second);
        else
            System.out.println("Invalid name");
    }
}