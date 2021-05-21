/*

Ruya’s teacher gave her an assignment to practice the spelling of “RAINBOW”. Ruya’s mother helped her in
doing this by spelling each letter as Ruya wrote it in her notebook. If Ruya writes wrong spelling her mother should say "The spelling is wrong"

Sample Input 1:
Enter the first letter:R
Enter the second letter:A
Enter the third letter:I
Enter the fourth letter:N
Enter the fifth letter:B
Enter the sixth letter:O
Enter the seventh letter:W

Sample Output 1:
RAINBOW


Sample Input 2:
Enter the first letter:R
Enter the second letter:E
Enter the third letter:I
Enter the fourth letter:N
Enter the fifth letter:B
Enter the sixth letter:O
Enter the seventh letter:W

Sample Output 2:
The spelling is wrong

*/

import java.util.Scanner;
class Character{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
		
        System.out.println("Enter the first letter:");
        char c1 = scan.next().charAt(0);
        System.out.println("Enter the second letter:");
        char c2 = scan.next().charAt(0);
        System.out.println("Enter the third letter:");
        char c3 = scan.next().charAt(0);
        System.out.println("Enter the fourth letter:");
        char c4 = scan.next().charAt(0);
        System.out.println("Enter the fifth letter:");
        char c5 = scan.next().charAt(0);
        System.out.println("Enter the sixth letter:");
        char c6 = scan.next().charAt(0);
        System.out.println("Enter the seventh letter:");
        char c7 = scan.next().charAt(0);
        
        if(c1 == 'R' && c2 == 'A' && c3 == 'I' && c4 == 'N' && c5 == 'B' && c6 == 'O' && c7 == 'W')
            System.out.println("RAINBOW");
        else
            System.out.println("The spelling is wrong");
    }
}