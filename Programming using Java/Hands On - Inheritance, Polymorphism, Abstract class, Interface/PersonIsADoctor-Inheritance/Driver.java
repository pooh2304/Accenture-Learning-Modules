public class Driver {
    public static void main(String[] args) {
        Doctor d = new Doctor();
        d.setName("Manoj Kumar");
        d.setSpecializationType("MALSKSP");
        String s = d.displayDetails();
        System.out.println(s);
    }
}