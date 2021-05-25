/*

Write a java program to compare two strings to find which are Case sensitive/ Case insensitive/ Not equal.

Sample Input1:
Way to finished
way To FinIshed

Sample Output1:
Case insensitive


Sample Input2:
Yesterday take to much
Yesterday take to much

Sample Output2:
Case sensitive


Sample Input3:
Failure builds character
Failure builds you

Sample Output3:
Not equal

*/

import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if(str1.equals(str2))
            System.out.println("Case sensitive");
        else if(str1.equalsIgnoreCase(str2))
            System.out.println("Case insensitive");
        else
            System.out.println("Not equal");
    }
}