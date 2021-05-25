public class Driver{
    public static void main(String[] args){
        Multiplier m = new Multiplier();
        System.out.println(m.multiply(3,4));
        System.out.println(m.multiply(3,4,5));
        System.out.println(m.multiply(3.5,4.5));
    }
}