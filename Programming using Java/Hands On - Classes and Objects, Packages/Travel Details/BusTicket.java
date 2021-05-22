public class BusTicket {
    private int ticketNo;
    private float ticketPrice;
    private float totalAmount;
    private Person person;
    
    public int getTicketNo() {
        return ticketNo;
    }
    public float getTicketPrice() {
        return ticketPrice;
    }
    public float getTotalAmount() {
        return totalAmount;
    }
    public Person getPerson() {
        System.out.println("Passenger Name:"+person.getName());
        return person;
    }
    public void setPerson(Person p) {
        person = p;
    }
    public void setTicketNo(int t) {
        ticketNo = t;
    }
    public void setTicketPrice(float p) {
        ticketPrice = p;
    }
    public void setTotalAmount(float a) {
        totalAmount = a;
    }
    public void calculateTotal() {
        float percent = 0;
        if(person.getAge()<16)
        percent = 50;
        else if(person.getAge()>=16 && person.getAge()<60) {
            if(person.getGender()=='F' || person.getGender()=='f')
            percent = 10;
            else
            percent = 0;
        }
        else if(person.getAge()>=60)
            percent = 25;
        totalAmount = ticketPrice-((percent*ticketPrice)/100);
    }
}