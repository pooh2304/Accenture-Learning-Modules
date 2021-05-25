import java.util.Scanner;
    
public class Main{
	public static void getMessage(int price, String name) throws InvalidPriceException{
		if(price<100)
			throw new InvalidPriceException("InvalidPriceException - Product price invalid");
		else{
			System.out.println("Name:"+name);
			System.out.println("Price:"+price);
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter product name");
	    String name = sc.nextLine();
	    System.out.println("Enter price");
	    int price = sc.nextInt();
	    try{
	        getMessage(price,name);
	    }
	    catch(InvalidPriceException e){
	        System.out.println(e.getMessage());
	    }
	}
}
