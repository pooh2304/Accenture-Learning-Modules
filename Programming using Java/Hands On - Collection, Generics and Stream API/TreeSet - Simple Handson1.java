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