/*

Each birthday, Meenu’s parents gift her gold coins. On her 1st birthday she got one coin from them, 2nd birthday 8 coins, 3rd birthday 27 coins, 4th birthday 64 coins, 
5th birthday 125 coins and so on. Meenu is now 10 years old. Given her age, help her calculate how many coins she can get for that birthday.

Note : Age should be a valid positive number(>0). Incase of any invalid input, the output should be "Invalid Age".

Sample Input 1:
Enter the age: 3

Sample Output 1:
Meenu gets 27 coins


Sample Input 2:
Enter the age: 8

Sample Output 2:
Meenu gets 512 coins

*/

import java.util.*;

class Coins {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        int coins = 0;
        
        if(age>0) {
            coins += age*age*age;
            System.out.println("Meenu gets "+coins+" coins");
        }
        else
            System.out.println("Invalid Age");
    }
}
