/*

One of the least Insurance agencies recruited employees for their collection department. Now the HR needs a report as the average age of all the employees working in that
department. Write a code to calculate the average age.

Implement a method "calculateAverage(int[] age)" to calculate the average age and return the result to the caller function.

Note :
    1. Age limit should be minimum of 28 years and maximum of 40 years.
    2. Minimum of 2 employees is mandatory to calculate average age, if fails, the output should be "Please enter a valid employee count"
    3. If any of the age is invalid, terminate the process and display "Invalid age encountered!"

Please do not use System.exit(0) to terminate the program.

Refer the sample given for read and display the output.

Sample Input 1:
Enter total no.of employees:
3
Enter the age for 3 employees:
30
31
32

Sample Output 1:
The average age is 31.00


Sample Input 2:
Enter total no.of employees:
2
Enter the age for 2 employees:
29
36

Sample Output 2:
The average age is 32.50


Sample Input 3:
Enter total no.of employees:
1

Sample Output 3:
Please enter a valid employee count


Sample Input 4:
Enter total no.of employees:
3
Enter the age for 3 employees:
30
15

Sample Output 4:
Invalid age encountered!

*/

import java.util.*;

class Test{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter total no. of employees: ");
        int noofemployees = scn.nextInt();
        if(noofemployees>1){
            double temp = 0.0; 
            int i=0,avarage = 0,count=0;
            int[] arr = new int[noofemployees];
            System.out.println("Enter the age for "+noofemployees+" employees:");
            for(i = 0; i<noofemployees; i++){
                arr[i]=scn.nextInt();
                if(arr[i]>=28 && arr[i]<=40)
                    temp= temp+arr[i];
                else if(arr[i]<28 || arr[i]>40){
                    count++;
                    break;
                }
            }
            if(count!=1){
                temp = temp/noofemployees;
                System.out.println("The average age is "+String.format("%.02f",temp));
            }
            else
               System.out.println("Invalid age encountered!"); 
        }
        else
           System.out.println("Please enter a valid employee count");
    }
}
