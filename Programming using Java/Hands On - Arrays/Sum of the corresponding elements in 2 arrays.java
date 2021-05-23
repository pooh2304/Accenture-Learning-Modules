/*
Anjali wants to write a Java program to find the sum of the corresponding elements in 2 arrays.If the size of the first array is larger then the third array size should 
be size of first array otherwise the third array size is the second array size , then add all the elements  store it in third array and print the array.
If the size is 0 or less print "Invalid array size".

Sample Input 1:
Enter the size of first array:
5
Enter elements for first array:
1
2
4
5
8
Enter the size of second array:
5
Enter elements for second array:
4
9
6
7
3

Sample Output 1:
5
11
10
12
11


Sample Input 2:
Enter the size of first array:
-3

Sample Output 2:
Invalid array size


Sample Input 3:
Enter the size of first array:
3
Enter elements for first array:
2
4
6
Enter the size of second array:
5
Enter elements for second array:
5
4
3
2
1

Sample Output 3:
7
8
9
2
1

*/

import java.util.*;

public class ArrayAccumulator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array:");
        int size1 = sc.nextInt();
        if(size1<=0)
            System.out.println("Invalid array size");
        else if(size1>1){
            int[] array1 = new int[size1];
            System.out.println("Enter elements for first array:");
            for(int i=0;i<size1;i++)
                array1[i]=sc.nextInt();
            System.out.println("Enter the size of second array:");
            int size2=sc.nextInt();
            if(size2<=0)
                System.out.println("Invalid array size");
            else{
                int[] array2=new int [size2];
                System.out.println("Enter elements for second array:");
                for(int i=0;i<size2;i++)
                    array2[i]=sc.nextInt();
                int[] biggerArray=size1>size2 ? array1:array2;
                int[] smallerArray=size1<=size2 ? array1:array2;
                int[] summedArray=new int[biggerArray.length];
                System.arraycopy(biggerArray,0,summedArray,0,biggerArray.length);
                for(int i=0;i<smallerArray.length;i++)
                    summedArray[i]+=smallerArray[i];
                for(int i=0;i<summedArray.length;i++)
                    System.out.println(summedArray[i]);
            }
        }
    }
}
