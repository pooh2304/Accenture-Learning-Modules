import java.util.Scanner;
import java.lang.Math.*;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the type of shape:");
        String a=s.nextLine();
        if(a.equals("Circle")){
            System.out.println("Enter the radius:");
            float b=s.nextFloat();
            Circle c=new Circle(b);
            double d=c.calculateArea();
            System.out.print("The area of Circle is :");
            System.out.printf("%.2f",d);
        }
        else if(a.equals("Rectangle")){
         System.out.println("Enter the length:");
         float b=s.nextFloat();
         System.out.println("Enter the breadth:");
         float c=s.nextFloat();
         Rectangle r=new Rectangle(b,c);
         double d=r.calculateArea();
         System.out.print("The area of Rectangle is :");
         System.out.printf("%.2f",d);
        }
        else{
            System.out.println("Enter the base :");
            float b=s.nextFloat();
            System.out.println("Enter the height :");
            float c=s.nextFloat();
            Triangle d=new Triangle(b,c);
            double e=d.calculateArea();
            System.out.print("The area of Triangle is :");
            System.out.printf("%.2f",e);
        }
    }
}