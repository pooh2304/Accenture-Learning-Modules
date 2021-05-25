/*

Write a java program to count number of alphabets in a given sentence.

Sample Input1:
Salad is for rabbits

Sample Output1:
17


Sample Input2:
Dog cross# the 1st street

Sample Output2:
19


Sample Input3:
8922%

Sample Output3:
0

*/

import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(Character.isLetter(str.charAt(i)))
                count++;
        }
        System.out.println(count);
    }
}