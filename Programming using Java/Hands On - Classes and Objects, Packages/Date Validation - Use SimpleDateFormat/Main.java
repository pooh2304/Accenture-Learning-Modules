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
