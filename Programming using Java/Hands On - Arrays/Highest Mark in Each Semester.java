/*

Ram wants to know the maximum marks scored by him in each semester. The mark should be between 0 to 100 ,if goes beyond the range display "You have entered invalid mark."

Sample Input 1:
Enter no of semester:
3
Enter no of subjects in 1 semester:
3
Enter no of subjects in 2 semester:
4
Enter no of subjects in 3 semester:
2
Marks obtained in semester 1:
50
60
70
Marks obtained in semester 2:
90
98
76
67
Marks obtained in semester 3:
89
76

Sample Output 1:
Maximum mark in 1 semester:70
Maximum mark in 2 semester:98
Maximum mark in 3 semester:89


Sample Input 2:
Enter no of semester:
3
Enter no of subjects in 1 semester:
3
Enter no of subjects in 2 semester:
4
Enter no of subjects in 3 semester:
2
Marks obtained in semester 1:
55
67
98
Marks obtained in semester 2:
67
-98

Sample Output 2:
You have entered invalid mark.

*/

import java.util.*;

class HighestMarkPerSem{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter no of semester:");
        int numberofsem = scn.nextInt();
        int[] semsubj = new int[numberofsem];
        for(int i=0;i<numberofsem;i++){
            System.out.println("Enter no of subjects in "+(i+1)+" semester:");
            semsubj[i] = scn.nextInt();
        }
        int ch = 0;
        int[] marks = new int[numberofsem];
        for(int i=0;i<numberofsem && ch==0;i++){
            int high=0,mark=0;
            System.out.println("Marks obtained in semester "+(i+1)+":");
            for(int j=0;j<semsubj[i];j++){
                mark = scn.nextInt();
                if(mark<0){
                    System.out.println("You have entered invalid mark");
                    ch=1;
                    break;
                }
                if(mark>high)
                    high = mark;
            }
            marks[i] = high;
        }
        for(int i=0;i<numberofsem && ch==0;i++)
            System.out.println("Maximum mark in " +String.valueOf(i+1)+" semester:"+marks[i]);
    }
}