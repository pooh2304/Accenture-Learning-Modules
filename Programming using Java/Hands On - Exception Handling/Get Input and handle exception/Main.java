import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        try{
            int input = sc.nextInt();
            System.out.println("The input is "+input);
        }
        catch (InputMismatchException e){
            System.out.println("Input should be a number");
        }
	}
}