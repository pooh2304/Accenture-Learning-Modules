/*

Nancy wanted to check her son with the count of prime numbers between the given range. Help Nancy by writing a java program to find the count of prime numbers.

Sample Input 1
Enter starting range
67
Enter ending range
90

Sample Output 1
6

*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting range");
		int a = sc.nextInt();
		System.out.println("Enter ending range");
		int b = sc.nextInt();
		int f, count = 0;
		for(int i=a;i<=b;i++) {
		    f = 0;
		    for(int j=2;j<=i/2;j++) {
		        if(i%j==0) {
		            f = 1;
		            break;
		        }
		    }
		    if(f==0 && i>=2) 
		        count++;
		}
		System.out.print(count);
	}
}
