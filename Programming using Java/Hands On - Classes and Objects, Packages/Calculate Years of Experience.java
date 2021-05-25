/*

Get the date of joining(as String) as input from the user.  Calculate the number of years of experience and display the same.

Assume:
1) The given date is a valid date and the format is dd/MM/yyyy.
2) The current date is 15/12/2020.

Sample Input 1:
21/8/2006

Sample Output 1:
14 years

Hint : Create two Date objects- one for the input date and other for the current date. (Say d1 and d2). Find the difference between these two dates in milliseconds as
       d2.getTime() -  d1.getTime().

Convert this milliseconds to number of years.

*/

import java.util.*;
import java.text.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String join = sc.next();
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        try { 
            sdf.setLenient(false); 
            Date d1 = sdf.parse(join); 
            Date d2 = new Date(); 
            long diff = d2.getTime() - d1.getTime(); 
            long l1 = (24*60*60*1000); 
            long l = l1*365; 
            long year=diff/l; 
            System.out.println(year+" years"); 
        } 
        catch(ParseException e) {} 
    }
}