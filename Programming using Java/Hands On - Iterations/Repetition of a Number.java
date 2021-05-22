/*

Pinky’s mom provides Pinky  with a number  and a key digit.  She wants Pinky to find out how many times that key digit appears in that number.  Help Pinky to do that by writing a program.

Sample Input 1:
Enter the number  16466
Enter the key digit   6

Sample Output 1:
6 appears 3 times in 16466


Sample Input 2:
Enter the number  8458
Enter the key digit   6

Sample Output 2:
6 appears 0 times in 8458

*/

import java.util.Scanner;

class NumberRepetition{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number ");
        int num = scan.nextInt();
        System.out.println("Enter the key digit ");
        int key = scan.nextInt();
        
        int temp = num, count = 0;
        while(temp > 0){
            if(temp % 10 == key)
                count++;
            temp /= 10;
        }
        System.out.println(key + " appears " +count + " times in " +num);
    }
}