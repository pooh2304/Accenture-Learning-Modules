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