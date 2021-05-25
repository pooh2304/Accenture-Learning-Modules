import java.util.Scanner;

public class Main{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       Vehicle obj=new Vehicle(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextDouble());
       System.out.println(obj.getVehicleNumber()+" "+obj.getModelName()+" "+obj.getVehicleType()+" "+obj.getPrice());
       System.out.println(obj.issueLoan());
       System.out.println(obj.takeInsurance());
    }
}