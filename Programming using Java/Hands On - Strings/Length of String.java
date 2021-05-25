/*

A test conducted by an IT corporate requires two participants. One of them will provide his/her opponent with a long text. The opponent must code and find the no of characters in the string.The string should be validated ,spaces are allowed between the string. If valid Sting is provided   then find the length of the string .If the string is invalid then display the message "Invalid String". So help him/her code the logic in Java for the same.

[Use length() of the String class.]

Sample Input 1:
She sells seashells on the seashore

Sample Output 1:
No of characters is:35


Sample Input 2:
hi @ welcome

Sample Output 2:
Invalid String

*/

import java.util.*;

class FindLength{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        int length = sentence.length();
        int count = 0,i;
        for(i=0 ; i<length ; i++){
            int ascii = sentence.charAt(i);
            if((ascii>=97 && ascii<=122) || (ascii>=65 && ascii<=90) || ascii==32)
                count++;
        }
        if(count == i)
            System.out.println("No of characters is: "+length);
        else
            System.out.println("Invalid String");
    }
}