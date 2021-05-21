/*

Write a program to convert  Celsius to Farenheit.  Display the result correct to 1 decimal.
Create a class "CelsiusConversion.java" and write the main method.
Hint : 5 * (F – 32) = 9 * C,  F-Farenheit , C- Celsius

Sample Input  1 :
80

Sample Output  1 :
176.0


Sample Input  2 :
88

Sample Output  2 :
190.4

*/

import java.util.Scanner;

class CelsiusConversion{
    public static void main (String[] args) {
        double c = 0.0, f = 0.0;
        Scanner sc = new Scanner(System.in);
        c = sc.nextDouble();
        f = 32 + ((9 * c) / 5);
        System.out.format("%.1f",f);
    }
}