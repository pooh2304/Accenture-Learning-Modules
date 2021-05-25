import java.util.*;

public class Division {
    public String divideTwoNumbers(int number1,int number2){
        int value = 0;
        String str = "";
        try{
            value=number1/number2;
            str = ("The answer is "+value);
        }
        catch(ArithmeticException e){
            str = "Division by zero is not possible";
        }
        finally{
            return(str+". Thanks for using the application.");
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        Division div = new Division();
        System.out.println(div.divideTwoNumbers(num1,num2));
    }
}