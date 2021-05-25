public class Doctor extends Person{
    String specializationType;
    public String displayDetails(){
        return (name+" is a "+specializationType);
    }
}