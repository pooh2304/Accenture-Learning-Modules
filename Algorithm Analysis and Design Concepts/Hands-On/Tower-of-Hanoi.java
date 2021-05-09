/*

The tower of Hanoi is a mathematical puzzle. It consists of three rods, and a number of disks of different sizes which can slide onto any rod. The puzzle starts with the 
disks in a neat stack in ascending order of size on one rod, the smallest at the top. We have to obtain the same stack on the third rod. Assume the maximum number of disks 
to be 6. Display Invalid input for the given input less than zero or greater than 6. Write a program in Java to solve Tower-of-Hanoi using recursion.

Note: Write the main() inside the class 'TowerTest'

Sample Input and Output 1 :
Enter the number of disks :
4

The sequence of moves involved in the Tower of Hanoi are :
Move disk 1 from peg A to peg B
Move disk 2 from peg A to peg C
Move disk 1 from peg B to peg C
Move disk 3 from peg A to peg B
Move disk 1 from peg C to peg A
Move disk 2 from peg C to peg B
Move disk 1 from peg A to peg B
Move disk 4 from peg A to peg C
Move disk 1 from peg B to peg C
Move disk 2 from peg B to peg A
Move disk 1 from peg C to peg A
Move disk 3 from peg B to peg C
Move disk 1 from peg A to peg B
Move disk 2 from peg A to peg C
Move disk 1 from peg B to peg C


Sample Input and Output 2 : 
Enter the number of disks : 
-4

Invalid input

*/

import java.util.*;

public class TowerTest {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of disks :");
        int n = sc.nextInt();
        if(n>0 && n<=6) {  
            System.out.println("The sequence of moves involved in the Tower of Hanoi are:");
            towerOfHanoi(n, 'A', 'C', 'B');
        }
        else  
            System.out.println("Invalid input");
    }
     
    static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
        if(n==1) {
            System.out.println("Move disk 1 from peg "+ from_rod + " to peg " + to_rod);
            return;
        }
        towerOfHanoi(n-1, from_rod, aux_rod, to_rod);
        System.out.println("Move disk "+n+" from peg "+ from_rod + " to peg "+to_rod);
        towerOfHanoi(n-1, aux_rod, to_rod, from_rod);
    }
}
