import java.util.*;

public class TestMain {
    public static void main(String[] args) {
        VolumeCalculator vc=new VolumeCalculator();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the choice");
        System.out.println("1.Find Volume For Cylinder\n2.Find Volume for Cuboid");
        int choice=sc.nextInt();
        switch(choice) {
            case 1: {
                System.out.println("Enter the radius");
                double r=sc.nextDouble();
                System.out.println("Enter the height");
                double h=sc.nextDouble();
                System.out.println("Volume of the Cylinder is "+String.format("%.2f",vc.calculateVolume(r,h)));
                break;
            }
            case 2: {
                System.out.println("Enter the length");
                int l=sc.nextInt();
                System.out.println("Enter the breadth");
                int b=sc.nextInt();
                System.out.println("Enter the height");
                int h=sc.nextInt();
                System.out.println("Volume of the cuboid is "+String.format("%.2f",vc.calculateVolume(l,b,h)));
                break;
            }
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}