/*

Harry and Amy were playing a game. Harry would give out number, and Amy has to reverse the given number. Help Amy by writing java program to reverse the number.

Sample Input 1
Enter the number
61987

Sample Output 1
78916

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number");
	    int num = sc.nextInt();
	    int reverse = 0, rem;
	    while(num>0) {
	        rem = num%10;
	        reverse = reverse * 10 + rem;
	        num /= 10;
	    }
	    System.out.print(reverse);
    }
}
