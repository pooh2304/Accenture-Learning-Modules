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