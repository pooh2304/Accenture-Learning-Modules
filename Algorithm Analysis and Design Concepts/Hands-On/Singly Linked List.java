/*

Bob and Alice are friends and interested in computer programming. One day Alice challenges Bob to create a singly linked list of N integers and find out the list is a
palindrome or not. Return 1 or 0 denoting if it is  a palindrome or not, respectively. Help Bob to win the challenge.

Note: Create the main() inside the class 'ListDriver'

Input format:
The first line of input contains an integer N denoting the size of the linked list. In the next line are N space separated values of the nodes of the linked list.

Output format:
For each test case output will be 1 if the linked list is a palindrome else 0.

Sample Input 1:
4
1 2  2 1

Sample Output1:
1

Sample Input 2:
9
3 4 2 5 6 2 7 1 9

Sample Output 2:
0

*/

import java.util.Scanner;

public class ListDriver { 
    class Node { 
        int data;
        Node next;
        public Node(int data) { 
            this.data = data;
            this.next = null;
        }
    }
    
    public int size;
    public Node head = null;
    public Node tail = null;
    
    public void addNode(int data) { 
        Node newNode = new Node(data);
        if(head == null) { 
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    
    public Node reverseList(Node temp) { 
        Node current = temp;
        Node prevNode = null, nextNode = null;
        while(current!=null) {
            nextNode = current.next;
            current.next = prevNode;
            prevNode = current;
            current = nextNode;
        }
        return prevNode;
    }
    
    public void isPalindrome() { 
        Node current = head;
        boolean flag = true;
        int mid = (size%2==0)?(size/2):((size+1)/2);
        for(int i=1;i<mid;i++) {
            current = current.next;
        }
        Node revHead = reverseList(current.next);
        while (head!= null&& revHead!= null) { 
            if(head.data!=revHead.data) { 
                flag = false;
                break;
            }
            head = head.next;
            revHead = revHead.next;
        }
        if(flag)
            System.out.println("1");
        else
            System.out.println("0");
    }
    
    public void display() { 
        Node current = head;
        if(head == null)
            return;
        while(current!=null) 
            current = current.next;
        System.out.println();
    }

    public static void main(String[] args) { 
        ListDriver sList = new ListDriver();
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        do {
            sList.addNode(s.nextInt());
            n--;
        } while(n>=1);
        sList.display();
        sList.isPalindrome();
    }
}