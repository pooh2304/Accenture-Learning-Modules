/*

Help Mr.Ben who is a programmer, in developing a registration form on console. Customers will not just input data, but also view the details once he/she finishes the registration.

Sample Input 1:
Enter your name:Jany
Enter age:25
Enter gender:Female
Hailing from:Mexico


Sample Output 1:
Welcome, Jany
Age:25
Gender:Female
City:Mexico

*/

import java.util.Scanner;

class Customer{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your name:");
        String name = scan.nextLine();
        
        System.out.println("Enter age:");
        int age = scan.nextInt();
        
        scan.nextLine();
        
        System.out.println("Enter gender:");
        String gender = scan.nextLine();
        
        System.out.println("Hailing from:");
        String city = scan.nextLine();
        
        System.out.println("Welcome, " + name + "!");
        System.out.println("Age:"+age);
        System.out.println("Gender:"+gender);
        System.out.println("City:"+city);
    }
}