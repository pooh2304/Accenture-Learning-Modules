/*

SRV college wants to recognize the department which has succeeded in getting the maximum number of placements for this academic year. The departments that have participated
in the recruitment drive are CSE,ECE, MECH. Help the college find the department getting maximum placements. Check for all the possible output given in the sample snapshot.
Note : 
    If any input is negative, the output should be "Input is invalid".  
    If all department has equal number of placements, the output should be "None of the department has got the highest placement".

Sample Input 1:
Enter the no of students placed in CSE:90
Enter the no of students placed in ECE:45
Enter the no of students placed in MECH:70

Sample Output 1:
Highest placement
CSE


Sample Input 2:
Enter the no of students placed in CSE:55
Enter the no of students placed in ECE:85
Enter the no of students placed in MECH:85

Sample Output 2:
Highest placement
ECE
MECH


Sample Input 3:
Enter the no of students placed in CSE:0
Enter the no of students placed in ECE:0
Enter the no of students placed in MECH:0

Sample Output 3:
None of the department has got the highest placement


Sample Input 4:
Enter the no of students placed in CSE:10
Enter the no of students placed in ECE:-50
Enter the no of students placed in MECH:40

Sample Output 4:
Input is Invalid

*/

import java.util.*;

class Placement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the no of students placed in CSE:");
        int a = sc.nextInt();
        System.out.println("Enter the no of students placed in ECE:");
        int b = sc.nextInt();
        System.out.println("Enter the no of students placed in MECH:");
        int c = sc.nextInt();
        
        if(a>b && a>c){
            System.out.println("Highest placement");
            System.out.println("CSE");
        }
        else if(a<0 || b<0 || c<0){
            System.out.println("Input is Invalid");
        }
        else if(b>a && b>c){
            System.out.println("Highest placement");
            System.out.println("ECE");
        }
        else if(c>a && c>b){
            System.out.println("Highest placement");
            System.out.println("MECH");
        }
        else if(a==b && b==c && c==a){
            System.out.println("None of the department has got the highest placement");
        }
        else if(a==b){
            System.out.println("Highest placement");
            System.out.println("CSE");
            System.out.println("ECE");
        }
        else if(a==c){
            System.out.println("Highest placement");
            System.out.println("CSE");
            System.out.println("MECH");
        }
        else{
            System.out.println("Highest placement");
            System.out.println("ECE");
            System.out.println("MECH");
        }
    }
}
