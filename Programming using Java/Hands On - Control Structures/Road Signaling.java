/*

Write a java program to demonstrate the road signaling with default as 'prepare to go' operation.
Assume red for 'stop', green for 'go', and yellow for 'proceed with caution'.

Sample Input 1:
Enter the color
green

Sample Output 1:
go


Sample Input 2:
Enter the color
red

Sample Output 2:
stop


Sample Input 3:
Enter the color
yellow

Sample Output 3:
proceed with caution


Sample Input 4:
Enter the color
white

Sample Output 4:
prepare to go

*/

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the color");
        String color = sc.nextLine();
        
        switch(color){
            case "green":
                System.out.println("go");
            break;
            case "red":
                System.out.println("stop");
            break;
            case "yellow":
                System.out.println("proceed with caution");
            break;
            case "white":
                System.out.println("prepare to go");
            break;
            default: 
                System.out.println("prepare to go");
        }
    }
}