/*

Jane is a programmer and she used to participate in various coding contests. Since she is very much interested in data
structure, she planned to participate in a contest for data structures conducted by 'Secrets of Champions'.
In that contest, she is asked to write a program in Java to perform following operations:

Define a Class with following format:
class Node
{
    int data;
    Node  next;
}

Include functions:
append --- to add data at the end of the linked list.
Reverse --- to reverse the linked list.
display --- to display all the data in the linked list.

How can you help her to write this code?

Note: Implement the main() inside the class 'List'

Input and Output Format:
Refer sample input and output for formatting specifications.

Sample Input and Output:
Enter the value:
9
Do you want to add another node? Type Yes/No
yes
Enter the value:
10
Do you want to add another node? Type Yes/No
Yes
Enter the value:
26
Do you want to add another node? Type Yes/No
Yes
Enter the value:
8
Do you want to add another node? Type Yes/No
no
The elements in the linked list are: 9 10 26 8
The elements in the reversed linked list are : 8 26 10 9

*/

import java.util.Scanner;
import java.util.*;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class List {
    static Node head;
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        List obj = new List();
        do{
            System.out.println("Enter the value:");
            int val = sc.nextInt();
            sc.nextLine();
            obj.append(val);
            System.out.println("Do you want to add another node? Type Yes/No");
        } while(sc.nextLine().equalsIgnoreCase("yes"));
        
        System.out.print("The elements in the linked list are: ");
        obj.display();
        obj.Reverse();
        System.out.println();
        System.out.print("The elements in the reversed linked list are : ");
        obj.display();
    }
    
    public void append(int data) {
        Node newNode = new Node(data);
        Node current = head;
        if(head == null) {
            head = newNode;
            return;
        }
        else {
            while(current.next!=null)
                current = current.next;
            current.next = newNode;
            return;
        }
    }
    
    public void display() {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    
    public Node Reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current!=null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
}