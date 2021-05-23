/*

Raghavi wants to write Java program to find the cumulative sum of the array with a given set of values.Input consist of integers .If the size of an array is zero or lesser then display the message as "Invalid Range". Print the output in the format which is provided in sample output .

Assume maximum size of array is 20,

Sample Input 1:
Enter the number of elements
5
Enter the elements
2
3
5
7
1

Sample Output 1:
2 5 10 17 18


Sample Input 2:
Enter the number of elements
5
Enter the elements
2
3
-5
7
1

Sample Output 2:
2 5 0 7 8


Sample Input 3:
Enter the number of elements
0

Sample Output 3:
Invalid Range

*/

import java.util.*;

class CumulativeSum{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int size = scn.nextInt();
        if(size>0){
            System.out.println("Enter the elements");
            int[] arr1 = new int[size];
            int[] arr2 = new int[size];
            int temp = 0;
            for(int i=0;i<size;i++){
                arr1[i]=scn.nextInt();
                temp=arr1[i]+temp;
                arr2[i]=temp;
            }
            for(int i = 0;i<size;i++)
                System.out.print(arr2[i]+" ");
        }
        else
            System.out.println("Invalid Range");
    }
}