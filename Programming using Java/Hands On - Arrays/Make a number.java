/*

Sujan gets n numbers in an array.  Write a Java program to take the single digit even numbers in the array and make a number by combining those even numbers alone.

Example: If the array is {2,7,14,24,41,4} the output should be a single number 24, if not found print "Single digit even number is not found in the array".If the array size is zero or lesser then display the message as "Invalid array size"

Sample Input 1:
Enter the size of an array:
4
Enter the array elements:
45
4
56
8

Sample Output 1:
48


Sample Input 2:
Enter the size of an array:
0

Sample Output 2:
Invalid array size

*/

import java.util.*;
import java.lang.Math;

class EvenNumber{
    public static void main (String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        size = sc.nextInt();
        if(size<=0)
            System.out.println("Invalid array size");
        else{
            int arr[] = new int[size];
            System.out.println("Enter the array elements:");
            for (int i=0;i<size ;i++ ) 
                arr[i] = sc.nextInt();
            int cnt=0,sum=0;
            for (int i=size-1;i>=0 ;i-- ) {
                if(arr[i]/10==0 && arr[i]%2==0){
                    sum = sum+arr[i]*(int)Math.pow(10,cnt);
                    cnt++;
                }
            }
            if(cnt==0)
                System.out.println("Single digit even number is not found in the array");
            else
                System.out.println(sum);
        }
    }
}