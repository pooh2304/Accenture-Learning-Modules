import java.util.*;

public class Calculator{
    public static Calculate performAddition(){
        Calculate add = (a,b)->a+b;
        return add;
    }
    public static Calculate performSubtraction(){
        Calculate sub = (a,b)->a-b;
        return sub;
    }
    public static Calculate performProduct(){
        Calculate mul = (a,b)->a*b;
        return mul;
    }
    public static Calculate performDivision(){
        Calculate div = (a,b)->(float)a/b;
        return div;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Calculate c = performAddition();
        System.out.println("The sum is "+c.performCalculation(a,b));
        Calculate d = performSubtraction();
        System.out.println("The difference is "+d.performCalculation(a,b));
        Calculate e = performProduct();
        System.out.println("The product is "+e.performCalculation(a,b));
        Calculate f = performDivision();
        System.out.println("The division value is "+f.performCalculation(a,b));
    }
}