/*

Nirmal wants to know the palindrome numbers between the given range of numbers. Help him by writing a java program to find the palindrome numbers.

Sample Input 1
Enter the starting range
78
Enter the ending range
100

Sample Output 1
88 99

*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting range");
		int s = sc.nextInt();
		System.out.println("Enter the ending range");
		int e = sc.nextInt();
		
		for(int i=s;i<=e;i++) {
		    int rev = 0;
		    for(int j=i;j>0;j/=10)
		        rev = rev * 10 + j % 10;
		    if(i==rev)
		        System.out.print(i+ " ");
		}
	}
}
