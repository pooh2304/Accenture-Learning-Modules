import java.util.*;

public class TestMain {
    public static BusTicket getTicketDetails() {
        Scanner sc = new Scanner(System.in);
        BusTicket bus1 = new BusTicket();
        
        System.out.println("Enter the passenger name:");
        String name = sc.nextLine();
        System.out.println("Enter the gender(M or F/m or f):");
        char g = sc.next().charAt(0);
        System.out.println("Enter the age:");
        int a = sc.nextInt();
        sc.nextLine();
        Person p = new Person();
        p.setName(name);
        p.setGender(g);
        p.setAge(a);
        bus1.setPerson(p);
        System.out.println("Enter the ticket no.");
        bus1.setTicketNo(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter the ticket price");
        bus1.setTicketPrice(sc.nextFloat());
        return bus1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BusTicket bus = new BusTicket();
        bus = getTicketDetails();
        System.out.println("Ticket no:"+bus.getTicketNo());
        bus.getPerson();
        System.out.println("Price of a ticket:"+bus.getTicketPrice());
        bus.calculateTotal();
        System.out.println("Total Amount:"+bus.getTotalAmount());
    }
}