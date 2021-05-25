import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of passengers:");
        int n = s.nextInt();
        Passenger arr[] = new Passenger [n];
        for( int i=0;i<n;i++){
            System.out.println("Passenger "+(i+1));
            System.out.println("Enter the ticketid:");
            int b=s.nextInt();
            System.out.println("Enter the name:");
            s.nextLine();
            String c=s.nextLine();
            System.out.println("Enter the gender:");
            String d=s.nextLine();
            System.out.println("Enter the address:");
            String e=s.nextLine();
            arr[i]=new Passenger(b,c,d,e);
        }
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);
    }
}