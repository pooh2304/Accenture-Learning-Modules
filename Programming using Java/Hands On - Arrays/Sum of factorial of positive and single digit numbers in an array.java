/*

Write a java program to find the sum of factorial of the numbers in an array. Consider the number for finding the factorial only if it is positive and single digit.  If not print "No positive and single digit numbers found in an array".

Example if the array is {2,-7,14,-24,41,5} the output should be 122

Sample Input 1:
Enter the size of an array:
5
Enter the elements:
2
-56
-13
6
56

Sample Output 1:
722

*/

import java.util.*;

class Factorial{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = scn.nextInt();
        System.out.println("Enter the elements:");
        ArrayList<Integer> factorial = new ArrayList<Integer>();
        for(int i= 0; i<size; i++){
            int result = 1;
            int input = scn.nextInt();
            if(input>1 && input<=9){
                for(int j = 1 ; j<= input ; j++)
                    result = result*j;
                factorial.add(result);
            }
        }
        int arraysize = factorial.size();
        if(arraysize>0){
            int sum = 0;
            for(int i = 0; i<arraysize ; i++)
                sum += factorial.get(i);
            System.out.println(sum);
        }
        else
            System.out.println("No positive and single digit numbers found in an array");
    }
}