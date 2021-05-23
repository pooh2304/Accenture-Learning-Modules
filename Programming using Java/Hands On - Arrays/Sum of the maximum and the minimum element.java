/*

Anjali gets n numbers in an array. Write a Java program to print the sum of the maximum and the minimum element in the array.If the size of an array is 0 or less print 
"Invalid Array Size".

Sample Input 1:
Enter the size of an array:
5
Enter the elements:
45
23
48
90
89

Sample Output 1:
113


Sample Input 2:
Enter the size of an array:
0

Sample Output 2:
Invalid Array Size

*/

import java.util.*;

class Sum{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = scn.nextInt();
        if(size>=1){
            System.out.println("Enter the elements:");
            int[] arr = new int[size]; 
            for(int i = 0; i<size; i++)
                arr[i] = scn.nextInt();
            Arrays.sort(arr);
            System.out.println(arr[size-1]+arr[0]);
        }
        else
            System.out.println("Invalid Array Size");
    }
}
