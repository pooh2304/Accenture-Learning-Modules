/*

Jack wanted to display the String for a particular number of times. Help him by writing a java program to display the string.

Note: number of times of display cannot be less than 1, if so display “<number> is not a valid input”

Sample Input 1
Enter the String
Rainbow
Enter the number
4

Sample Output 1
Rainbow
Rainbow
Rainbow
Rainbow


Sample Input 2
Enter the String
Rainbow
Enter the number
-9

Sample Output 2
-9 is not a valid input

*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String text = sc.nextLine();
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if(num>1) {
            for(int i=0;i<num;i++)
                System.out.println(text);
        }
        else
            System.out.println(num+" is not a valid input");
    }
}
