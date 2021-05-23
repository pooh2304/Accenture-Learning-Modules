/*

Write a java program to create an array of size ‘n’ and accepts ‘n’ number of integers from the user and display all the values from an array

Sample Input 1
Enter the array size
5
Enter the values
10
15
62
94
78

Sample Output 1
10
15
62
94
78

*/

import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        System.out.println("Enter the values");
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        for(int i=0;i<n;i++)
            System.out.println(a[i]);
    }
}