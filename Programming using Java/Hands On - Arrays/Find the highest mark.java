/*

Raj is a professor who handles Mathematics ,he wants to conduct evaluation for the students.He wants to find the highest mark among the students to give the proficiency .Write a Java program to help Raj. (Assume 6 set of marks provided always)

Sample Input 1 :
89
90
67
78
98
76

Sample Output 1 :
Highest mark is 98


Sample Input 2:
96
-89

Sample Output 2 :
Invalid mark

*/

import java.util.*;

class Highestmark{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        int[] marks = new int[6];
        for(int i=0;i<6;i++){
            marks[i] = sc.nextInt();
            if(marks[i]<0){
                flag = 1;
                break;
            }
        }
        if(flag==1)
            System.out.println("Invalid mark");
        else{
            int max=marks[0];
            for(int i=1;i<6;i++){
                if(marks[i]>max)
                    max=marks[i];
            }
            System.out.println("Highest mark is "+max);
        }
    }
}