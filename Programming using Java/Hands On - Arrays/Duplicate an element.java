/*

Anju wants to write a Java program to duplicate an element from a set of elements.Get the array size and elements .Get the position of the element to be replicated at 
the end of the array.If the position given is greater than the size of an array display the message as "Position is greater than the size of an array".
If the size of the array is zero or lesser then display the message "Invalid array size".Please help her out for solving the above scenario .

Sample Input 1:
Enter the size of an array:
5
Enter the array elements:
34
56
78
56
90
Enter the position of the element to be replicated:
2

Sample Output 1 :
34
56
78
56
90
78


Sample Input 2:
Enter the size of an array:
0

Sample Output 2:
Invalid array size


Sample Input 3:
Enter the size of an array:
3
Enter the array elements:
12
6
35
Enter the position of the element to be replicated:
9

Sample Output 3:
Position is greater than the size of an array

*/

import java.util.*;

class DuplicateElement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size1 = sc.nextInt();
        if(size1>0){
            int size2=size1+1;
            int[] arr1 = new int[size1];
            int[] arr2 = new int[size2];
            System.out.println("Enter the array elements:");
            for(int i=0;i<size1;i++){
                arr1[i] = sc.nextInt();
                arr2[i] = arr1[i];
            }
            System.out.println("Enter the position of the element to be replicated:");
            int position = sc.nextInt();
            if(position<size1){
                arr2[size2-1] = arr1[position];
                for(int i=0;i<size2;i++)
                    System.out.println(arr2[i]);
            }
            else
                System.out.println("Position is greater than the size of an array ");
        }
        else
            System.out.println("Invalid array size");
    }
}
