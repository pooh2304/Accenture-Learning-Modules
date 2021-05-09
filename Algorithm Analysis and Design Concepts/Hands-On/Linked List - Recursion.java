/*

Rose participates in an online gaming contest, where she is asked to code logic in Java to count the number of occurrences of a given element in a given linked list using 
recursion. Help Rosy to perform the task.  Check the sample input and output statements for clarifications.

Note: Implement the main() inside the class 'ListDriver.java'

Sample Input/Output 1: [Values given in bold represents the input]
Enter the size of the list: 7
1 7 2 3 2 9 2

Printing the list:
1 7 2 3 2 9 2

Enter the key to find it's occurrence: 2

2 occurs for 3 times.


Sample Input/Output 2:
Enter the size of the list: 5
1 2 3 4 5

Printing the list:
1 2 3 4 5

Enter the key to find it's occurrence: 6

6 occurs for 0 times.


Sample Input/Output 3:
Enter the size of the list: 0

Invalid Input


Sample Input/Output 4:
Enter the size of the list: -5

Invalid Input

*/

import java.util.Scanner;

class ListDriver { 
    Node head;
    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null; 
        }
    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    
    int count(int search_for) {
        Node current = head;
        int count = 0;
        while(current != null) {
            if(current.data == search_for)
                count++;
            current=current.next;
        }
        return count;
    }  
    
    public static void main(String args[]) {
        ListDriver llist = new ListDriver();
        Scanner l = new Scanner(System.in);
        System.out.println("Enter the size of the list:");
        int n = l.nextInt();
        int a[] = new int[100];
        if(n==0 || n<0) {
            System.out.println("Invalid Input");}
        else {
            for(int i=0;i<n;i++) { 
                a[i]=l.nextInt();
                llist.push(a[i]);
            }
            System.out.println("Printing the list");
            for(int i=0;i<n;i++)
                System.out.print(a[i]+" ");
            System.out.println();
            System.out.println("Enter the key to find it's occurrence:");
            int x=l.nextInt();
            System.out.println(x+" occurs for "+llist.count(x)+" times");
        }
    }
}
