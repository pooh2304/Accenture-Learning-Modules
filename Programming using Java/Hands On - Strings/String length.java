/*

Write a java program to find the length of the string is even or odd.

Sample Input1:
Can I change the room

Sample Output1:
21 Odd


Sample Input2:
Entrepreneur

Sample Output2:
12 Even

*/

import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        if(len%2==0)
            System.out.println(len+" Even");
        else
            System.out.println(len+" Odd");
    }
}