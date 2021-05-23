/*

Two arrays are said to be compatible if they are of the same size and if the ith element in the first array is greater than or equal to the ith element in the second array for all i elements.If the array size is zero or lesser then display the message "Invalid array size".Write a Java program to find whether 2 arrays are compatible or not.If the arrays are compatible display the message as "Arrays are Compatible" ,if not then display the message as "Arrays are Not Compatible".

Sample Input 1:
Enter the size for First array:
5
Enter the elements for First array:
5
14
17
19
15
Enter the size for Second array:
5
Enter the elements for Second array:
2
5
9
15
7

Sample Output 1:
Arrays are Compatible


Sample Input 2:
Enter the size for First array:
3
Enter the elements for First array:
1
4
7
Enter the size for Second array:
5
Enter the elements for Second array:
2
5
9
5
7

Sample Output 2:
Arrays are Not Compatible


Sample Input 3:
Enter the size for First array:
-2

Sample Output 3:
Invalid array size

*/

import java.util.*;

public class CompatibleArrays{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size for First array:");
        int size1 = sc.nextInt();
        if(size1>0){
            int[] arr1 = new int[size1];
            System.out.println("Enter the elements for First array:");
            for(int i=0;i<size1;i++)
                arr1[i]=sc.nextInt();
            System.out.println("Enter the size for Second array:");
            int size2 = sc.nextInt();
            if(size2>0){
                int count = 0;
                int[] arr2 = new int[size2];
                System.out.println("Enter the elements for Second array:");
                for(int i=0;i<size2;i++)
                    arr2[i] = sc.nextInt();
                if(size1==size2){
                    for(int i=0;i<size1;i++){
                        if(arr1[i]<arr2[i])
                            count++;
                    }
                    if(count==0)
                        System.out.println("Arrays are Compatible");
                    else
                        System.out.println("Arrays are Not Compatible");
                }
                else
                    System.out.println("Arrays are Not Compatible");
            }
            else
                System.out.println("Invalid array size");
        }
        else
            System.out.println("Invalid array size");
    }
}