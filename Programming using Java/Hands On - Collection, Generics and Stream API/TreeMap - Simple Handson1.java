/*

Write a Java program to associate the specified value, country name (String as Value) with the specified key, country code (Integer as key) in a Tree Map and iterate 
through all elements in tree map.

Note: Import only required classes

Sample Input / Output:
Enter number of elements to add
4
Enter the country code
91
Enter the country name
India
Enter the country code
973
Enter the country name
Bahrain
Enter the country code
1
Enter the country name
Canada
Enter the country code
52
Enter the country name
Mexico
1 : Canada
52 : Mexico
91 : India
973 : Bahrain

*/

import java.util.*;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements to add");
		int elements = sc.nextInt();
		sc.nextLine();
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		for(int i=0;i<elements;i++){
		    System.out.println("Enter the country code");
		    Integer code = sc.nextInt();
		    sc.nextLine();
		    System.out.println("Enter the country name");
		    String countryName=sc.nextLine();
		    map.put(code,countryName);
		}
		for(Map.Entry m:map.entrySet()){
		    System.out.println(m.getKey()+" : "+m.getValue());
		}
	}
}
