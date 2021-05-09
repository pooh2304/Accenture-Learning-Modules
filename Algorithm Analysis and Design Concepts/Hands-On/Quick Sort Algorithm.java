/*

Write a program to implement Quick Sort Algorithm.

Requirements :
public static void quickSort(int[] ar,int start,int end)
public static int partition(int[] ar,int start,int end)
Implement the main() inside the class : 'QuickSort'

Sample Input and Output 1:
How many elements?8
Enter array elements:2
1
5
3
4
8
7
6
Array after sorting:1 2 3 4 5 6 7 8


Sample Input and Output 2:
How many elements?0
Invalid Input


Sample Input and Output 3:
How many elements?-1
Invalid Input

*/

import java.util.Scanner;

public class QuickSort { 
    public static void main(String[] args) { 
        int i,n;
        Scanner q = new Scanner(System.in);
        int []arr = new int[100];
        System.out.print("How many elements?");
        n = q.nextInt();
        if(n==0 || n<0)
            System.out.println("Invalid Input");
        else {
            System.out.print("Enter array elements:");
            for(i=1;i<=n;i++)    
                arr[i] = q.nextInt();
            quickSort(arr,1,n);
            System.out.print("Array after sorting:");
            for(i=1;i<=n;i++)
                System.out.print(arr[i]+" ");
        }
    }
    
    public static int partition(int a[],int beg,int end) { 
        int left, right,temp,loc,flag;
        loc = left = beg;
        right = end;
        flag = 0;
        while(flag != 1) { 
            while((a[loc]<=a[right]) && (loc!=right))
                right--;
            if(loc == right)
                flag = 1;
            else if(a[loc] > a[right]) { 
                temp = a[loc];
                a[loc] = a[right];
                a[right] = temp;
                loc = right;
            }
            if(flag != 1) { 
                while((a[loc]>=a[left]) && (loc!=left))
                    left++;
                if(loc==left)
                    flag=1;
                else if(a[loc]<a[left]) { 
                    temp=a[loc];
                    a[loc]=a[left];
                    a[left]=temp;
                    loc=left;
                }
            }
        }
        return loc;
    }

    static void quickSort(int a[], int beg, int end) { 
        int loc;
        if(beg<end) { 
            loc=partition(a,beg,end);
            quickSort(a,beg,loc-1);
            quickSort(a,loc+1,end);
        }
    }
}
