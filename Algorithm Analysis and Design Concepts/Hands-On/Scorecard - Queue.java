/*

Dan is playing a video game in which his character competes in a hurdle race by jumping over hurdles with heights. He used to maintain the maximum height of units he jumps 
in each race in his scorecard. But in this score card he can only append the score one after another. He cannot insert in the middle or in the beginning. The scorecard can 
store N number of hurdles. But Dan used to maintain only the 5 latest hurdle score. Whenever he needs to enter 6th hurdle score, he used to delete the first hurdle score 
from card. Write a program to simulate the scorecard of Dan.

Note: Create the main() inside the class 'ScoreCardDriver'.

Input Format:
The first input is the size of score card should be > 0 and <=100
The second input is the maximum height he can jump for each hurdle

Output Format:
Print latest 5 hurdle race scores which is stored in the score card.

Sample Input 1
Enter the size of the score card:8
Enter the hurdle race score 1:6
Enter the hurdle race score 2:2
Enter the hurdle race score 3:5
Enter the hurdle race score 4:3
Enter the hurdle race score 5:6
Enter the hurdle race score 6:9
Enter the hurdle race score 7:5
Enter the hurdle race score 8:7

Sample Output 1:
Latest hurdle race scores are: 3 6 9 5 7


Sample Input 2:
Enter the size of the score card: 6
Enter the hurdle race score 1:7
Enter the hurdle race score 2:1
Enter the hurdle race score 3:4
Enter the hurdle race score 4:6
Enter the hurdle race score 5:4
Enter the hurdle race score 6:8

Sample Output 2:
Latest hurdle race scores are: 1 4 6 4 8


Sample Input 3:
Enter the size of the score card:0

Sample Output 3:
Invalid score card size


Sample Input 4:
Enter the size of the score card:101

Sample Output 4:
Invalid score card size


Sample Input 5:
Enter the size of the score card:-1

Sample Output 5:
Invalid score card size

*/

import java.util.*;

class ScoreCardDriver {
    final static int MaxQ = 100;
    int front = 0, rear = 0;
    int[] QA = new int[MaxQ];
    
    public boolean empty() {
        return front == rear;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ScoreCardDriver obj = new ScoreCardDriver();
        System.out.print("Enter the size of the score card:");
        int n = sc.nextInt();
        if(n>0 && n<=100) {
            int[] in = new int[n];
            for(int i=0; i<n; i++) {
                System.out.print("Enter the hurdle race score "+(i+1)+":");
                obj.enQueue(sc.nextInt());
                System.out.println();
            }
            System.out.print("Latest hurdle race scores are: ");
            obj.display();
        }
        else
            System.out.println("Invalid score card size"); 
    }
    
    public void enQueue(int n) {
        if((rear-front) == 5)
            deQueue();
        QA[rear] = n;
        rear++;
        return;
    }
    
    public void deQueue() {
        if(this.empty())
            return;
        front++;
    }
    
    public void display() {
        for(int i=front; i<rear ;i++)
            System.out.print(QA[i]+" ");
    }
}
