/*

Ram is very weak in converting the numbers into months. But his friends often tease him by asking him to do that. To solve his problem a close friend of him, suggested to meet IIT students, who were very good at programming. Help ram to resolve his problem.
Note :
    Range of inputs is 1 to 12.
    If the input given is beyond the range display error message as given in the sample output.

Sample Input 1:
2

Sample Output 1:
February


Sample Input 2:
15

Sample Output 2:
No month for the number 15

*/

import java.util.Scanner;

class NumToMonth{
    public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
        String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int n = scan.nextInt();
        
        if(n >= 1 && n <= 12)
            System.out.println(months[n-1]);
        else
            System.out.println("No month for the number "+n);
    }
}