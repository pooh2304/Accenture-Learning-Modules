public class Passenger{
    private int ticketid;
    private String name;
    private String gender;
    private String address;
    
   public Passenger(int b,String c,String d,String e){
       ticketid = b;
       name = c;
       gender = d;
       address = e;
   }
   public void setTicketid(int a){
       ticketid = a;
   }
   public void setName(String b){
       name = b;
   }
   public void setGender(String c){
       gender = c;
   }
   public void setAddress(String d){
       address = d;
   }
   public int getTicketid(){
       return ticketid; 
   }
   public String getName(){
       return name;
   }
   public String getGender(){
       return gender;
   }
   public String getAddress(){
       return address;
   }
    public String toString(){
        return "ticketid:"+ticketid+","+"name:"+name+","+"gender:"+gender+","+"address:"+address;
    }
}