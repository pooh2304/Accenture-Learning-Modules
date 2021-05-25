/*

Get the date of manufacturing (as String) as input from the user. Also get the number of months of validity of that product.
Calculate the expiry date by adding that months to the date of manufacturing and display the result.
Assume the given date is a valid date and the format is dd/MM/yyyy.

Sample Input 1
15/12/2020
6

Sample Output 1
15/06/2021

Hint :
1)  Parse the input string to Date (say Date d) using SimpleDateFormat
2)  Use Calendar to add months
    Calendar c = Calendar.getInstannce();  //Get Instance
    c.setTime(dd1);   // Set date to Calendar
    c.add(Calendar.MONTH, month);  //add month value to the Calendar
3)  Convert Calendar to Date using getTime
    Date dd=c.getTime();
4)  Again use the same SimpleDateFormat and convert date to String of the format dd/MM/yyyy using the format method

*/

import java.util.*;
import java.text.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String d = sc.next();
		int n = sc.nextInt();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    try{
	        Date date = sdf.parse(d);
    	    Calendar c = Calendar.getInstance();
    	    c.setTime(date);
    	    c.add(Calendar.MONTH, n);
    	    Date expiry = c.getTime();
    	    String strDate = sdf.format(expiry);
    	    System.out.println(strDate);
	    }
	    catch(ParseException e){
	        System.out.println("dn");
	    }
	}
}