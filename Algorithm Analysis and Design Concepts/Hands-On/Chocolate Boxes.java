/*

‘Camp Wonder’ is a summer camp program organized for kids for 5 days.  The organizers have planned to conduct various games for the kids in each day.  The last day, they 
planned a different game, where each kid is given N number of boxes.  Each box contains a bunch of chocolates.  The kids will get the box one after another and whenever they 
get a box with odd number of chocolates, then they have to destroy the first box they got.  After getting all the boxes, they have to display the number of chocolates in each 
box they have.  How will you implement the above scenario using a program?

Note:
The first box always contains even number of chocolates.
Implement the main() inside the class 'Chocolate'.

Input Format:
The first input is the number of boxes which should be > 0 and <=10
The second input is the number of chocolates in each box

Output Format:
Output should print the number of chocolates in box available
If the number of boxes <=0 or >10, then print 'Invalid input'
if the first box contains an odd number or negative value, then print 'Sorry!!! First box always should contain positive even no. of chocolates'

Sample Input 1:
Enter the no. of boxes: 5
Enter the no. of chocolates in box 1: 4
Enter the no. of chocolates in box 2: 2
Enter the no. of chocolates in box 3: 3
Enter the no. of chocolates in box 4: 6
Enter the no. of chocolates in box 5: 1

Sample Output 1:
No. of chocolates in each box: 3 6 1


Sample Input 2:
Enter the no. of boxes: 0

Sample Output 2:
Invalid input

 
Sample Input 3:
Enter the no. of boxes: 5
Enter the no. of chocolates in box 1: 3

Sample Output 3:
Sorry!!! First box always should contain positive even no. of chocolates

 
Sample Input 4:
Enter the no. of boxes: 5
Enter the no. of chocolates in box 1: -1

Sample Output 4:
Sorry!!! First box always should contain positive even no. of chocolates

 
Sample Input 5:
Enter the no. of boxes: 11

Sample Output 5:
Invalid input

*/

import java.util.*;

public class Chocolate {
    public static void main(String[] args) {
        int flag =  0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of boxes: ");
        int n = sc.nextInt();
        System.out.println();
        if(n>=1 && n<=10) {
            int start = 0;
            int[] choc = new int[n];
            int temp = n;
            for(int i=0;i<temp;i++) {
                System.out.print("Enter the no. of chocolates in box "+(i+1)+": ");
                choc[i] = sc.nextInt();
                System.out.println();
                if(i==0) {
                    if(choc[i]%2!=0) {
                        System.out.println("Sorry!!! First box always should contain positive even no. of chocolates");
                        flag++;
                        break;
                    }
                }
                else {
                    if(choc[i]%2!=0)
                        start++;
                }
            }
            if(flag!=1) {   
                System.out.print("No. of chocolates in each box: ");
                for(int i=start;i<n;i++)
                    System.out.print(choc[i]+" ");
            }
        }
        else
            System.out.println("Invalid input");
        
    }
}
