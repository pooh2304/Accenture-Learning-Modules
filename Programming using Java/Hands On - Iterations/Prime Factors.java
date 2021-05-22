/*

Willams wanted to find the prime factorization of the given number. Help him by writing a java program to find the factors of a number in terms of prime numbers.

Sample Input 1
315

Sample Output 1
3 3 5 7

Explanation:
	 315
    /   \
	3   105
	   /   \
	  3	   35
		  /	 \
		 5	  7

Hence the prime factorization of 315 is 3 3 5 7.

*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n%2==0) {
		    System.out.print(2 + " ");
		    n /= 2;
		}
		for(int i=3;i<=Math.sqrt(n);i+=2) {
		    while(n%i==0) {
		        System.out.print(i + " ");
		        n /= i;
		    }
		}
		if(n>2)
		    System.out.print(n);
	}
}
