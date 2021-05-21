/*

Write a java program to find the entered number is even. If the entered number is even print "<number> is an even number".

Sample Input 1:
Enter the number
12

Sample Output 1:
12 is an even number

*/

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        
        if(num%2==0)
            System.out.println(num+" is an even number");
    }
}