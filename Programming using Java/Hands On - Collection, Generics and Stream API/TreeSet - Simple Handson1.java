/*

Write a Java program to create a new tree set, add some vegetables (String) and print out the collection.

Note: Import only required classes

Sample Input / Output:
Enter number of elements to add
4
Carrot
Cauliflower
Broccoli
Mushrooms

[Broccoli, Carrot, Cauliflower, Mushrooms]

*/

import java.util.*;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements to add");
		int elements = sc.nextInt();
		sc.nextLine();
		TreeSet<String> tree_set=new TreeSet<String>();
		for(int i=0;i<elements;i++){
		    String vegetables = sc.nextLine();
		    tree_set.add(vegetables);
		}
		System.out.println(tree_set);
	}
}
