/*

Given a year, check if the year is leap year or not. If yes, the output should be “Leap Year”. Else output should be “Not a Leap Year”. The input should be a positive four 
digit number.  Else,  the output should be “Invalid Year”.

Sample Input  1 :
Enter the Year
2016

Sample Output  1 :
Leap Year


Sample Input  2 :
Enter the Year
2001

Sample Output  2 :
Not a Leap Year

*/

import java.util.Scanner;

class LeapYear{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the Year");
        int year = scan.nextInt();
        
        if(year >= 1000 && year < 10000){
            if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                System.out.println("Leap Year");
            else
                System.out.println("Not a Leap Year");
        }
        else
            System.out.println("Invalid Year");
    }
}
