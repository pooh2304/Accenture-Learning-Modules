/*

Maheer wanted to check his son with names of month and days of the week. Maheer will choose whether his son has to display the names of month or day, If the choice is 1,
he has to display the names of the month and if the choice is 2, he has to display the days of the week. This has to continue until Maheer chooses 3. Help him in 
displaying the names as per his father’s choice.

Note: Do not use System.exit

Sample Input / Output 1
1.Display the Months
2.Display the Days
3.Exit
1
1.January
2.February
3.March
4.April
5.May
6.June
7.July
8.August
9.September
10.October
11.November
12.December
1.Display the Months
2.Display the Days
3.Exit
3


Sample Input / Output 2
1.Display the Months
2.Display the Days
3.Exit
2
1.Monday
2.Tuesday
3.Wednesday
4.Thursday
5.Friday
6.Saturday
7.Sunday
1.Display the Months
2.Display the Days
3.Exit
3

*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
		    System.out.println("1.Display the Months");
		    System.out.println("2.Display the Days");
		    System.out.println("3.Exit");
		    choice = sc.nextInt();
		    switch(choice) {
    		    case 1: {
    		        System.out.println("1.January");
    		        System.out.println("2.February");
    		        System.out.println("3.March");
    		        System.out.println("4.April");
    		        System.out.println("5.May");
    		        System.out.println("6.June");
    		        System.out.println("7.July");
    		        System.out.println("8.August");
    		        System.out.println("9.September");
    		        System.out.println("10.October");
    		        System.out.println("11.November");
    		        System.out.println("12.December");
    		        break;
    		    }
                case 2: {
    		       System.out.println("1.Monday");
    		       System.out.println("2.Tuesday");
    		       System.out.println("3.Wednesday");
    		       System.out.println("4.Thursday");
    		       System.out.println("5.Friday");
    		       System.out.println("6.Saturday");
    		       System.out.println("7.Sunday");
    		       break;     
    		   }
    		    case 3:
    		       choice=0;
    		       break;
		    }
	    }while(choice>0);
    }
}
