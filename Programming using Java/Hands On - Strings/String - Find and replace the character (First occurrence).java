/*

Write a Java program to find a character from a sentence and replace it with another character. If the character is not found in the string print "character not found".

Note: Replace only the first occurrence.

Sample input 1:
Enter the string:
java programming
Enter the character to be searched:
a
Enter the character to replace:
o

Sample output 1:
jova programming


Sample input 2:
Enter the string:
java programming
Enter the character to be searched:
b
Enter the character to replace:
o

Sample output 2:
character not found

*/

import java.util.*;

class FirstOccurence{
    public static void main(String args[]){
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Enter the character to be searched:");
        String searchKey = sc.nextLine();
        System.out.println("Enter the character to replace:");
        String replaceKey = sc.nextLine();
        if(str.contains(searchKey))
            System.out.println(str.replaceFirst(searchKey,replaceKey));
        else
            System.out.println("character not found");
    }
}