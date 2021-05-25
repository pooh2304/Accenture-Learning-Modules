/*

Get  a date as String from user. Check if that date is a valid date using SimpleDateFormat.
Date entered by the user is in the format dd/MM/yyyy.
If the given date is valid then display  “<Date> is a valid date”. Else display “<Date> is not a valid date”.

Sample Input 1
31/08/2020

Sample Output 1
31/08/2020 is a valid date


Sample Input 2
31/11/2020

Sample Output 2
31/11/2020 is not a valid date

*/

import java.util.*;
import java.text.*;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String dt = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setLenient(false);
		int flag = 0;
		try {
		    Date dateObj = sdf.parse(dt);
		}
		catch(ParseException e) {
		    System.out.println(dt+" is not a valid date");
		    flag = 1;
		}
		if(flag!=1)
		    System.out.println(dt+" is a valid date");
	}
}
