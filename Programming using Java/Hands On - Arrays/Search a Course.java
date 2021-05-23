/*

IIHT institution is offering a variety of courses to students. Students have a facility to check whether a particular course is available in the institution. 
Write a program to help the institution accomplish this task. If the number is less than or equal to zero display "Invalid Range".

Assume maximum number of courses is 20.

Sample Input 1:
Enter no of course:
5
Enter course names:
Java
Oracle
C++
Mysql
Dotnet
Enter the course to be searched:
C++

Sample Output 1:
C++ course is available


Sample Input 2:
Enter no of course:
3
Enter course names:
Java
Oracle
Dotnet
Enter the course to be searched:
C++

Sample Output 2:
C++ course is not available


Sample Input 3:
Enter no of course:
0

Sample Output 3:
Invalid Range

*/

import java.util.*;

class Course{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter no of course: ");
        int number = scn.nextInt();
        if(number>0 && number<=20){
            String[] course = new String[number+1];
            System.out.println("Enter course names:");
            for(int i=0;i<=number;i++)
                course[i]=scn.nextLine();
            System.out.println("Enter the course to be searched:");
            String searchitem=scn.nextLine();
            int count = 0;
            for(int i=0;i<=number;i++){
                if(course[i].equals(searchitem)){
                    count++;
                    break;
                }
            }
            if(count==1)
                System.out.println(searchitem + " course is available");
            else
                System.out.println(searchitem + " course is not available");
        }
        else
            System.out.println("Invalid Range");
    }
}                                                                               
