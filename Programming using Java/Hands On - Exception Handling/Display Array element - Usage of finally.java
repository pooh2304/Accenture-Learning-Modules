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