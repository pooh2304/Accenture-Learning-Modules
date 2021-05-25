/*

Global Info Technologies has approached you to develop an application to maintain the work details of their employees.

Imagine you are developing the login module. In that module,you will have to validate the id with the format given from the client.

The format is "GBL/001/0417", here the first three letters are standard.
Create a class UserMain and implement the functionalities which are required.

Sample Input 1:
Enter your ID
GBL/020/0715

Sample Output 1:
Login success


Sample Input 2:
Enter your ID
ABC/120/0215

Sample Output 2:
Incorrect ID

*/

import java.util.*;
import java.util.regex.*;

public class UserMain{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your ID");
        String eid = sc.nextLine();
        int len = eid.length();
        if (len==12){
            Pattern pattern = Pattern.compile("[G]{1}[B]{1}[L]{1}/[0-9]{3}/[0-9]{4}");
            Matcher matcher = pattern.matcher(eid);
            if(matcher.matches())
                System.out.println("Login success");
            else
                System.out.println("Incorrect ID");
        }
        else
            System.out.println("Incorrect ID");
    }
}