/*

Given a single linked list and an integer x your task is to complete the function deleteAllOccurences which deletes all occurrences of a key x present in the linked list. 
The function takes two arguments: the head of the linked list and an integer x. The function should return the head of the modified linked list.

Note: Implement the main() inside the class 'DeleteMain'

Input:
The first line of input contains an integer N denoting the no of elements of the linked list. Then in the next line are N space separated values of the linked list. 
The third line of each test case contains an integer x.

Output:
The output for each test case will be the space separated value of the returned linked list.

Sample Input & Output:
5
2 2 1 4 4
Enter the element to be deleted:
4
The list after deletion: 2 2 1

*/

import java.util.*;

class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteMain {
    Node head;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DeleteMain obj = new DeleteMain();
        int n = sc.nextInt();
        if(n>0) {
            sc.nextLine();  
            String[] in = (sc.nextLine().split(" "));   
            for(int i=0; i<n; i++)
                obj.add(Integer.parseInt(in[i]));
            System.out.println("Enter the element to be deleted: ");
            int key = sc.nextInt();
            obj.delete(key);
            System.out.print("The list after deletion: ");
            obj.display();
        }
    }
    
    public void add(int data) {
        Node newNode = new Node(data);
        Node current = head;
        if(head == null) {
            head = newNode;
            return;
        }
        else {
            while(current.next != null)
                current = current.next;
            current.next = newNode;
            return;
        }
    }
    
    public void delete(int key) {
        Node temp = head, prev = null;
        while(temp != null && temp.data == key) {
            head = temp.next;
            temp = head;
        }
        
        while(temp != null) {
            while(temp != null && temp.data != key) {
                prev = temp;
                temp = temp.next; 
            }
            if(temp == null)
                return;
            prev.next = temp.next;
            temp = prev.next;
        }
    }
    
    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
