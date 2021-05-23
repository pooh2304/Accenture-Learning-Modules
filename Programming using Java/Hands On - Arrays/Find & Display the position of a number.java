/*

Write a java program to find the given number from the array of elements and display its position. If the number is not present in an array then display it as 0.

Assume the position starts from 1.

Sample Input 1:
Enter the array size
4
Enter the values
9
32
17
4
Enter the number to find
17

Sample Output 1:
3


Sample Input 2:
Enter the array size
3
Enter the values
29
53
11
Enter the number to find
49

Sample Output 2:
0

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
        System.out.println("Enter the number to find");
        int num = sc.nextInt();
        int key = 0;
        for(int i=0;i<n;i++) {
            if(a[i]==num) {
                key = i+1;
                break;
            }
        }
        System.out.println(key);
    }
}