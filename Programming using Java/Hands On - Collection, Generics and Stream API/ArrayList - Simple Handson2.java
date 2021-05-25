/*

Write a Java program to create a new array list, add some Fruits (String) and iterate through all elements in array list.

Note: Import only required classes

Sample Input / Output:
Enter number of elements to add
4
Apple
Mango
Dragon Fruit
Pineapple

Apple
Mango
Dragon Fruit
Pineapple

*/

import java.util.*;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements to add");
		int elements = sc.nextInt();
		sc.nextLine();
		ArrayList<String> fruits = new ArrayList<String>();
		for(int i=0;i<elements;i++){
			String fruit = sc.nextLine();
			fruits.add(fruit);
		}
		Iterator<String> itr = fruits.iterator();
		while(itr.hasNext()){
		    System.out.println(itr.next());
		}
	}
}
