/*

Implement Stack using recursion and reverse the stack content. Stack should be represented using a linked list. Generate linked list in an ordered set of data elements, 
each containing a link to its successor.

Requirements:
class Node
{
    int value;
   Node next;
};

int createStack();
void displayStack();
void stackReverse();

Note: Implement the main() inside the class 'StackDriver'

Sample Input/Output 1: [Values given in bold represents the input]
Enter length of List: 3                                                                                                                                       
Elements in Stack                                                              
1 2 3                                                                                                                                                                                    
Elements in the stack after reversal                                           
3 2 1 

Note: In the above sample the input provided by the user is 3 which represents "length of List" 


Sample Input/Output 2:
Enter length of List: 5                                                                                                                                      
Elements in Stack                                                              
1 2 3 4 5                                                                                                                                                                                   
Elements in the stack after reversal                                           
5 4 3 2 1


Sample Input/Output 3:
Enter length of List: -4
Invalid Length

*/

import java.util.Stack;
import java.util.Scanner;

class StackDriver { 
    static Stack<Integer>st = new Stack<>();
    static void insert_at_bottom(int x) { 
        if(st.isEmpty())
            st.push(x);
        else {  
            int a = st.peek();
            st.pop();
            insert_at_bottom(x);
            st.push(a);
        }
    }
    
    static void reverse() { 
        if(st.size()>0) { 
            int x = st.peek();
            st.pop();
            reverse();
            insert_at_bottom(x);
        }
    }
    
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length of List:");
        int n = s.nextInt();
        if(n==0 || n<0) { 
            System.out.println("Invalid Length");}
        else {
            for(int i=1;i<=n;i++)
                st.push(i);
            System.out.println("Elements in Stack ");
            System.out.println(st);
            reverse();
            System.out.println("Elements in the stack after reversal");
            System.out.println(st);
        }
    }
}
