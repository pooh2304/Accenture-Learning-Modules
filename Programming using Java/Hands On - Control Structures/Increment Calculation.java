/*

ABC Technologies is in the process of increment the salary of the employees. This increment is done based on their salary and their performance appraisal rating.
    1. If the appraisal rating is between 1 and 3, the increment is 10% of the salary.
    2. If the appraisal rating is between 3.1 and 4, the increment is  25% of the salary.
    3. If the appraisal rating is between 4.1 and 5, the increment is  30% of the salary.
Help them to do this,  by writing a program that displays the incremented salary.

Write a class "IncrementCalculation.java" and write the main method in it.
Note : If either the salary is 0 or negative  (or) if the appraisal rating is not in the range 1 to 5 (inclusive), then the output should be “Invalid Input”.

Sample Input 1 :
Enter the salary
8000
Enter the Performance appraisal rating
3

Sample Output  1 :
8800


Sample Input  2 :
Enter the salary
7500
Enter the Performance appraisal rating
4.3

Sample Output  2 :
9750


Sample Input  3 :
Enter the salary
-5000
Enter the Performance appraisal rating
6

Sample Output  3 :
Invalid Input

*/

import java.util.*;

class IncrementCalculation{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary");
        int s = sc.nextInt();
        System.out.println("Enter the performance appraisal rating");
        float r = sc.nextFloat();
        
        if(s>0 && (r>=1 && r<=5)) {
            if(r>=1 && r<=3)
                s = s + ((s*10)/100);
            else if(r>=3.1 && r<=4)
                s = s + ((s*25)/100);
            else if(r>=4.1 && r<=5)
                s = s + ((s*30)/100);
            System.out.println(s);
        }
        else
            System.out.println("Invalid Input");
    }
}