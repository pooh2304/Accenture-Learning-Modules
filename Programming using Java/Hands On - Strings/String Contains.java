/*

Write a java program to find the given word is contained in a given sentence or not.

Note: The second input is contained in the first input, then print “<second input> is contained in a sentence”.
      Else print “<second input> is not contained in a sentence”.

Sample Input1:
Creativity is always having fun
having

Sample Output1:
having is contained in a sentence


Sample Input2:
we know one of the most places
fun

Sample Output2:
fun is not contained in a sentence

*/

import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String word = sc.nextLine();
        String s[] = str.split(" ");
        int flag = 0;
        for(String temp: s) {
            if(temp.compareTo(word)==0)
                flag = 1;
        }
        if(flag==1)
            System.out.println(word+" is contained in a sentence");
        else
            System.out.println(word+" is not contained in a sentence");
    }
}