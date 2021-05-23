/*

Write a Java program to interchange the elements of an array with the elements of another array without using the third array.If the array size differs display "Unable to swap size differs".If the range is lesser or equal to Zero . Display "Invalid range "

Assume the maximum size of array is 20.

Sample Input 1:
Enter the number of elements in the first array :
3
Enter the elements in the first array
1
2
3
Enter the number of elements in the second array :
3
Enter the elements in the second array
4
5
6

Sample Output 1:
The first array after swapping is :
4 5 6
The second array after swapping is :
1 2 3


Sample Input 2:
Enter the number of elements in the first array :
-3

Sample Output 2:
Invalid range


Sample Input 3:
Enter the number of elements in the first array :
3
Enter the elements in the first array:
1
2
3
Enter the number of elements in the second array :
2

Sample Output 3:
Unable to swap size differs

*/

import java.util.*;

class InterchangeArray{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of elements in the first array :");
        int first = scn.nextInt();
        if(first>=1){
            System.out.println("Enter the elements in the first array ");
            int[] firstarray = new int[first];
            for(int i=0;i<first;i++)
                firstarray[i] = scn.nextInt();
            System.out.println("Enter the number of elements in the second array :");
            int second=scn.nextInt();
            if(second>=1){
                if(first==second){
                    System.out.println("Enter the elements in the second array ");
                    int[] secondarray = new int[second];
                    for(int i=0;i<second;i++)
                        secondarray[i]=scn.nextInt();
                    int[] temp = new int[first];
                    for(int i=0;i<first;i++){
                        temp[i]=firstarray[i];
                        firstarray[i]=secondarray[i];
                        secondarray[i] =temp[i];
                    }
                    System.out.println("The first array after swapping is : ");
                    for(int i=0;i<first;i++)
                        System.out.println(firstarray[i]);
                    System.out.println("The second array after swapping is : ");
                    for(int i=0;i<first;i++)
                        System.out.println(secondarray[i]);
                }
                else
                    System.out.println("Unable to swap size differs");
            }
            else
                System.out.println("Invalid range");
        }
        else
            System.out.println("Invalid range");
    }
}