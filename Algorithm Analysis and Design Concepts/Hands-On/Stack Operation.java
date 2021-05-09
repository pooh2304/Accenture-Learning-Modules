/*

Design a stack with operations on middle element.

How to implement a stack which will support following operations in O(1) time complexity?
1.  push() which adds an element to the top of stack.
2.  findMiddle() which will return middle element of the stack.
3.  pop() which removes an element from top of stack.
 
Push and pop are standard stack operations. If the number of elements to be pushed in the stack is 0 or negative, it should display "Invalid Input".
 
Note: Implement the main() inside the class 'StackDriver'

Sample Input 1:
Enter the number of elements to be pushed in the stack:
5
Enter the element 1:
10
Enter the element 2:
8
Enter the element 3:
25
Enter the element 4:
8
Enter the element 5:
3
 
Sample Output1:
The middle element is: 25
The popped element is: 3


Sample Input 2:
Enter the number of elements to be pushed in the stack:
4
Enter the element 1:
10
Enter the element 2:
8
Enter the element 3:
25
Enter the element 4:
3
 
Sample Output2:
The middle element is: 8
The popped element is: 3


Sample Input3:
Enter the number of elements to be pushed in the stack:
-7

Sample Output3:
Invalid Input

*/

import java.util.*;

class StackDriver {   
    int top = -1; 
    int[] stk=new int[100];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackDriver obj = new StackDriver();
        System.out.println("Enter the number of elements to be pushed in the stack:");
        int n = sc.nextInt();
        if(n>0) {
            for(int i=0;i<n;i++) {
                System.out.println("Enter the element "+(i+1)+":");
                obj.push(sc.nextInt());
            }
            System.out.println("The middle element is: "+obj.findMiddle());
            System.out.println("The popped element is: "+obj.pop());
        }
        else
            System.out.println("Invalid Input");
    }
    
    public void push(int data){
        stk[++top]=data;
    }
    
    public int pop() {
        return stk[top--];
    }
    
    public int findMiddle() {
        if((top+1)%2==0)
            return stk[(int)top/2];
        else
            return stk[(int)(top+1)/2];
    }
}
