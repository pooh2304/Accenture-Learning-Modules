/*

Get  the input for date of birth as String from the user.  Check whether the given date is valid using SimpleDateFormat.

Write a java program to meet the above requirement.

Implement throws clause in this requirement.

In the Main class implement the below method:
	public static Date convertStringToDate(String str) – This method should convert the String str in the format dd/MM/yyyy to java.util.Date using SimpleDateFormat.  
							     This method should throw ParseException. If valid return the converted Date object.

Note: When using SimpleDateFormat to convert String to Date it will allow the code to compile only if you handle the exception “ParseException” available in java.text package.

Now try to recollect what type of Exception is ParseException – Checked or unchecked ?

In the main method, get the date as String in the format dd/MM/yyyy and invoke the method convertStringToDate.  If date is valid display “<String> is a valid date”.

Else handle the Exception thrown and print “<String> is not a valid date”.

Sample Input 1 :
31/10/2020

Sample Output 1:
31/10/2020 is a valid date


Sample Input 2 :
31/11/2020

Sample Output 2:
31/11/2020 is not  a valid date

*/

import java.util.*;
import java.text.ParseException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	   String dateString = sc.nextLine();
	   try{
	       Date parsedDate=convertStringToDate(dateString);
	       System.out.println(dateString+" is a valid date");
	   }
	   catch(ParseException e){
	       System.out.println(dateString+" is not a valid date");
	   }
	}
	
	public static Date convertStringToDate(String str) throws ParseException  {
		DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		sdf.setLenient(false);
		date=sdf.parse(str);
		return date;
	}
}
