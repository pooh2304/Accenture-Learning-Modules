/*

Raji wants to count the no of occurrences of the given character.Write a program to accept a word from the user. Get a character from the user and find the no of occurrences .

Check whether the given character and word is valid

The word is valid if it contains only alphabets and no space or any special characters or numbers.

The character is valid if it is an alphabet alone.

Sample Input 1:
Enter a word:
programming
Enter the character:
m

Sample Output 1:
No of 'm' present in the given word is 2.


Sample Input 2:
Enter a word:
programming
Enter the character:
s

Sample Output 2:
The given character 's' not present in the given word.


Sample Input 3:
Enter a word:
56

Sample Output 3:
Not a valid string


Sample Input 4:
Enter a word:
Hello
Enter the character:
6

Sample Output 4:
Given character is not an alphabet

*/

import java.util.*;
import java.util.regex.*;

class OccurrenceOfChar{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = sc.nextLine();
        Pattern pattern = Pattern.compile("^[A-Za-z]+$");
        Matcher matcher = pattern.matcher(word);
        if(matcher.matches()){
            System.out.println("Enter the character:");
            char character = sc.next().charAt(0);
            Pattern pattern1 = Pattern.compile("^[A-Za-z]+$");
            Matcher matcher1 = pattern1.matcher(String.valueOf(character));
            if(matcher1.matches()){
                int cn = 0;
                for(char cc:word.toCharArray()){
                    if(cc==character)
                        cn++;
                }
                if(cn!=0)
                    System.out.println("No of '"+character+"' present in the given word is "+cn+".");
                else
                    System.out.println("The given character'"+character+"' not present in the given word.");
                sc.close();
            }
            else
                System.out.println("Given character is not an alphabet");
        }
        else
            System.out.println("Not a valid string");
    }
}