/*

There is an app for  bike race which provides bonus points for the  player.  In this app the player has to play the race and on completion, the total kilometers travelled 
by the player is calculated. Based on this distance travelled, the product of digits in the odd position and also product of digits in the even position is calculated.  
Whichever is highest, that is the bonus points given to the user.   If the product of odd and even position digits are same, then the player should receive double the 
product as bonus.

Example : If the distance travelled  is 5632
Product of digits in odd position = 5 * 3 = 15
Product of digits in even  position = 6 * 2 = 12
As 15 > 12, the bonus points the player gets is 15.

Write a program  to do this operation.

Create a class BikeRace.java with the main method.

Note : Input should be the distance travelled and the output is the bonus points.  If the input is less than zero, the output should be “Invalid input”.

Sample Input 1 :
Enter the distance travelled
8694

Sample Output 1 :
Your bonus points is 72


Sample Input 2 :
Enter the distance travelled
263

Sample Output 2 :
Your bonus points is 12

*/

import java.util.Scanner;

class BikeRace{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the distance travelled");
        int dist = scan.nextInt();
        
        if(dist < 0)
            System.out.println("Invalid Input");
        else if(dist == 0)
            System.out.println("Your bonus points is 0");
        else {
            int digit, even = 1, odd = 1;
            while(dist > 0){
                digit = dist % 10;
                odd *= digit;
                dist /= 10;
                
                if(dist == 0)   
                    break;
                digit = dist % 10;
                even *= digit;
                dist /= 10;
            }
            if(even == odd)
                System.out.println("Your bonus points is " + (2*even));
            else if(even > odd)
                System.out.println("Your bonus points is " + even);
            else
                System.out.println("Your bonus points is "+ odd);
        }
    }
}
