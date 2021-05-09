/*

Implement Merge Sort using arrays. Apply Divide and Conquer algorithm design strategy .It divides input array into two halves until each half contains single element and then
merges these two sorted halves.

Note:
If the size of the array is less than or equal to 0 then print "Invalid array size" and terminate the program.
Implement the main() inside the class 'MergeSortDriver'

Functions to be used:
public static void merge()  -   function is used for merging two halves.
public static void mergeSort(int[] arr, int l, int r)    -  'l' represents left index and 'r' represents the right index of the sub-array of 'arr' to be sorted.

Sample Input/Output 1:
Enter the size of an array:
5                                                                                                                      
Enter the elements:
3                                                            
1                                                                               
2                                                                               
8                                                                               
6                                                                               
Given array is                                                                  
3 1 2 8 6                                                                                                                                                 
Sorted array is                                                                 
1 2 3 6 8    


Sample Input/Output 2:
Enter the size of an array:0                                                                                                      
Invalid array size

*/

import java.util.*;

class MergeSortDriver {
    void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        
        int i = 0, j = 0;
        int k = l;
        
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
    void sort(int arr[], int l, int r) {
        if (l < r) {
            int m = l+ (r-l)/2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
 
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = s.nextInt();
        if(n<=0)
            System.out.println("Invalid array size");
        else {
            int[] arr = new int[n];
            System.out.println("Enter the elements:");
            for(int i=0;i<n;i++)
                arr[i] = s.nextInt();
            System.out.println("Given array is");
            printArray(arr);
            MergeSortDriver ms = new MergeSortDriver();
            ms.sort(arr, 0, arr.length-1);
            System.out.println("Sorted array is");
            printArray(arr);
        }
    }
}
