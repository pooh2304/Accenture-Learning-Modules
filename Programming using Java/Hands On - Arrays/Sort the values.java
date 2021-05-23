/*

Write a java program to sort the values from the array of elements in ascending order.

Sample Input 1:
Enter the array size
4
Enter the values
16
3
77
83

Sample Output 1:
3
16
77
83

*/

import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i,j;
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        System.out.println("Enter the values");
        int a[] = new int[n];
        for(i=0;i<n;i++)
            a[i] = sc.nextInt();
        for(i=0;i<n-1;i++) {
            for(j=0;j<n-i-1;j++) {
                if(a[j]<a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for(i=n-1;i>=0;i--)
            System.out.println(a[i]);
    }
}