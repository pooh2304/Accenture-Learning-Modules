/*

Rohan wants a magic board, which displays a character for a corresponding number for his science exhibition. Help him to develop such application.
For example when the digits 65,66,67,68 are entered, the alphabet ABCD are to be displayed.
[Assume the number of inputs should be always 4 ]

Sample Input 1:
Enter the digits:
65
66
67
68

Sample Output 1:
65-A
66-B
67-C
68-D


Sample Input 2:
Enter the digits:
115
116
101
112

Sample Output 2:
115-s
116-t
101-e
112-p

*/

import java.util.Scanner;

public class AsciValue{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the digits: ");
        int d1 = in.nextInt();
        int d2 = in.nextInt();
        int d3 = in.nextInt();
        int d4 = in.nextInt();

        char ch1 = (char)d1;
        char ch2 = (char)d2;
        char ch3 = (char)d3;
        char ch4 = (char)d4;
        
        System.out.println(d1+"-"+ch1);
        System.out.println(d2+"-"+ch2);
        System.out.println(d3+"-"+ch3);
        System.out.println(d4+"-"+ch4);
    }
}