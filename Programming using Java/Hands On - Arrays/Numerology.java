/*

Write a program to find the numerological value for a given name.

Note: Store the numerological number and the corresponding character in a 2-D array(2*26). Always the given  name should be in capital case ,else the name is not valid. Check for the valid name,if the name is invalid print the message "Invalid name".There should not be any space in the name provided.

For example:
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
1 2 3 4 5 8 3 5 1 1 2 3 4 5 7 8 1 2 3 4 6 6 6 5 1 7

Sample Input 1:
Enter your name:
SUDHA

Sample Output 1:
Your numerology no is:19


Sample Input 2:
Enter your name:
kiran

Sample Output 2:
Invalid name


Sample Input 3:
Enter your name:
ANI34

Sample Output 3:
Invalid name

*/

import java.util.*;
import java.util.regex.*;

public class Numerology{
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^[A-Z]*$");
        char[][] table = new char[][]{
            "12345678".toCharArray(),
            "ABCDEUOF".toCharArray(),
            "IKGMHVZP".toCharArray(),
            "JRLTNW-Z".toCharArray(),
            "Q-S-X---".toCharArray(),
            "Y-------".toCharArray()
        };
        System.out.println("Enter your name: ");
        String name = scn.nextLine();
        Matcher matcher = pattern.matcher(name);
        if(matcher.matches()){
            char[] nameArray = name.toCharArray();
            ArrayList<Integer> nums = new ArrayList<>();
            for(char ch: nameArray){
                for(int j=1;j<6;j++){
                    for(int k=0;k<8;k++){
                        if(ch==table[j][k])
                            nums.add(((int)table[0][k])-48);
                    }
                }
            }
            int sum = 0;
            for(int i = 0; i< nums.size();i++)
                sum+=nums.get(i);
            System.out.println("Your numerology no is:"+(sum));
        }
        else
            System.out.println("Invalid name");
    }
}