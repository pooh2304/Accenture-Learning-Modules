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
		System.out.println(fruits);
	}
}