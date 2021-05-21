/*

Write a java program to find the range of the entered value.
a)If the entered value is greater than 0 and less than or equal to 100 then display "Range of the number <number> is 0 to 100"
b)If the entered value is greater than 100 and less than or equal to 200 then display "Range of the number <number> is 100 to 200"
c)If the entered value is greater than 200 and less than or equal to 500 then display "Range of the number <number> is 200 to 500"
If the given number is not in the above list then display "Entered number <number> is not in the expected range".

Sample Input 1:
Enter the number
20

Sample Output 1:
Range of the number 20 is 0 to 100


Sample Input 2:
Enter the number
180

Sample Output 2:
Range of the number 180 is 100 to 200


Sample Input 3:
Enter the number
320

Sample Output 3:
Range of the number 320 is 200 to 500


Sample Input 4:
Enter the number
650

Sample Output 4:
Entered number 650 is not in the expected range

*/

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if(num>0 && num<=100)
            System.out.println("Range of the number "+num+" is 0 to 100");
        else if(num>100 && num<=200)
            System.out.println("Range of the number "+num+" is 100 to 200");
        else if(num>200 && num<=500)
            System.out.println("Range of the number "+num+" is 200 to 500");
        else
            System.out.println("Entered number "+num+" is not in the expected range");
    }
}