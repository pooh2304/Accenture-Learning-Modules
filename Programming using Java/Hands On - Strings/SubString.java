/*

Write a java program to find the substring for a given range.

Sample Input1:
Superstition
5
10

Sample Output1:
stiti

*/

import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();
        String substr = str.substring(a, b);
        System.out.println(substr);
    }
}