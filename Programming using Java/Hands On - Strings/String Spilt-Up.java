/*

Write a java program to split the given string.

Sample Input1:
People:Who:Are:Crazy
:

Sample Output1:
People
Who
Are
Crazy

*/

import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String d = sc.nextLine();
        String s[] = str.split(d);
        for(String x: s)
            System.out.println(x);
    }
}