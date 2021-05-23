/*

Write a java program to create an array of size ‘n’ and accepts ‘n’ number of integers from the user and display all the values from an array in reverse order.

Sample Input 1
Enter the array size
3
Enter the values
46
83
67

Sample Output 1
67
83
46

*/

import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        System.out.println("Enter the values");
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        for(int i=n-1;i>=0;i--)
            System.out.println(a[i]);
    }
}
