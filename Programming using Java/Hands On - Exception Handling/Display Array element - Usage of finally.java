/*

Get 5 names from the user and store it in an array.  Get the index position from the user and display the name in that position of the array.

If the index is beyond the range of array, handle it using ArrayIndexOutOfBoundsException  and display message as “Index is out of bounds of the array”.

Whether the exception occurs or not, display the message as “Thank you Have a nice day”.

Write a java program for the above requirement.

Sample Input 1 :
John
Arun
Sachin
Dravid
Ashwin
3

Sample Output 1:
Dravid
Thank you Have a nice day


Sample Input 2 :
Azhar
Sachin
Pranav
Ashwin
Dravid
5

Sample Output 2:
Index is out of bounds of the array
Thank you Have a nice day

*/

import java.util.*;

public class Main {
	public static void main(String[] args) {
	    String [] array = new String[5];
		Scanner sc = new Scanner(System.in);
	    try{
	        for(int i=0;i<5;i++)
	            array[i]=sc.nextLine();
	        int index=sc.nextInt();
	        System.out.println(array[index]);
	    }
	    catch(ArrayIndexOutOfBoundsException e){
	        System.out.println("Index is out of bounds of the array");
	    }
	    finally{
	        System.out.println("Thank you Have a nice day");
	    }
	}
}
