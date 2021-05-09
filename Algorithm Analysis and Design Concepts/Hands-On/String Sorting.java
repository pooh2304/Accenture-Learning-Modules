/*

John likes to play with string and he always tries to do something new with it. This time he found a very typical way to sort a string. What he did is that he took a string 
composed of both lowercase and uppercase letters and sorted it in such a manner such that the uppercase and lowercase letter comes in an alternate manner but in sorted way.  
He needs your help to complete this job as fast as possible.

Example:
Input: bAwutndekWEdkd
Output: AbEdWddekkntuw

Explanation:
Here we can see that letter ‘A’,’E’,’W’ are sorted as well as letters “b,d,d,d,e,k,k,n,t,u,w” are sorted but both appears alternately in the string as far as possible.

Note: Create main() inside the class 'SortDriver'

Input:
The first line of input contains the string to be sorted. 

Output:
Print the string in required sorted format.

Sample Input:
Enter the String: HelLoWoRld

Sample Output:
The Sorted String is: HdLeRlWloo

*/

import java.util.Scanner;
import java.lang.*;

class SortDriver {
    public final static int MAX = 100;
    public static String alternateSort(String s1) {
        int n = s1.length();
        char [] s = s1.toCharArray();
        int[] lCount = new int [MAX];
        int[] uCount = new int [MAX];
        
        for (int i=0;i<n;i++) {
            if(Character.isUpperCase(s[i]))
                uCount[s[i]-'A']++;
            else
                lCount[s[i]-'a']++;
        }
        
        int i=0,j=0,k=0;
        
        while(k<n) {
            while(i<MAX && uCount[i] ==0)
                i++;
            if(i<MAX) {
                s[k++]= (char)('A'+i);
                uCount[i]--;
            }
            while(j<MAX && lCount[j]==0)
                j++;
            if(j<MAX) {
                s[k++]= (char)('a'+j);
                lCount[j]--;
            }
        }
        return(new String(s));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str;
        str = input.nextLine();
        System.out.println("the Sorted String is:");
        System.out.println(alternateSort(str));
    }
}
