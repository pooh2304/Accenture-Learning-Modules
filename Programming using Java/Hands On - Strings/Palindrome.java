/*

Astrologist believes that having a palindromic name is very auspicious . As we all know, a palindrome is a word that can be read the same way in either direction.There should not be a space or any special character in the word entered. If yes, display "Invalid Input". Write a Java program to determine whether a given word is a palindrome or not.

Sample Input 1:
Enter the word :
Malayalam

Sample Output 1:
Malayalam is a Palindrome


Sample Input 2:
Enter the word :
Apple

Sample Output 2:
Apple is not a Palindrome


Sample Input 3:
Enter the word :
no on

Sample Output 3:
Invalid Input


Sample Input 4:
Enter the word :
@nnn

Sample Output 4:
Invalid Input

*/

import java.util.*;

class Palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word:");
        String input = sc.nextLine();
        String originalinput = input;
        input = input.toLowerCase();
        char[] charArray = input.toCharArray();
        for(char c:charArray){
            if(!Character.isLetter(c)){
                System.out.println("Invalid Input");
                return;
            }
        }
        StringBuilder s = new StringBuilder();
        s.append(input);
        StringBuilder reversed = s.reverse();
        String rev = reversed.toString();
        if(rev.equals(input))
            System.out.println(originalinput+" is a Palindrome");
        else
            System.out.println(originalinput+" is not a Palindrome");
    }
}
