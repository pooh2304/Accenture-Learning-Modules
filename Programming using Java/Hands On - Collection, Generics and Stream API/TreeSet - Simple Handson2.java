/*

Write a Java program to create a new tree set, add some Vegetables (String) and iterate through all elements in tree set.

Note: Import only required classes

Sample Input / Output:
Enter number of elements to add
4
Carrot
Cauliflower
Broccoli
Mushrooms

Broccoli
Carrot
Cauliflower
Mushrooms

*/

import java.util.*;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements to add");
		Integer elements = sc.nextInt();
		sc.nextLine();
		TreeSet<String> ts = new TreeSet<String>();
		for(int j=0; j<elements;j++){
		    String Vegatables = sc.nextLine();
		    ts.add(Vegatables);
		}
		Iterator<String> itr=ts.iterator();
		while(itr.hasNext()){
		    System.out.println(itr.next());
		}
	}
}
