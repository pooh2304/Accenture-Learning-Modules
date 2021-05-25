public class Driver{
    public static void main(String[] args){
        Doctor d = new Doctor();
        d.name = "Pooja";
        d.specializationType = "neurologist";
        System.out.println(d.displayDetails());
    }
}