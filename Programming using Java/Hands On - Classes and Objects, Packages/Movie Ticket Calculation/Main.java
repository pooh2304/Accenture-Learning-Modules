import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Movie m1 = getMovieDetails();
        String c = getCircle();
        System.out.println("Movie name = "+m1.getMovieName());
        System.out.println("Movie category = "+m1.getMovieCategory());
        int flag = m1.calculateTicketCost(c);
        if(flag==0)
            System.out.println("The ticket cost is = "+m1.getTicketCost());
        else if(flag==-1)
            System.out.println("Sorry there is no "+m1.getMovieCategory().toLowerCase()+" type of category in theater.");
        else if(flag==-2)
            System.out.println("Sorry!!! Circle is Invalid.");
        else if(flag ==-3)
            System.out.println("Sorry!!! Both circle and category are Invalid.");
    }
    public static Movie getMovieDetails(){
        Movie m = new Movie();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the movie name:");
        String mName = sc.nextLine();
        m.setMovieName(mName);
        System.out.println("Enter the movie category:");
        String mCat= sc.next();
        m.setMovieCategory(mCat);
        return m;
    }
    public static String getCircle(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the circle:");
        String circle = sc1.next();
        return circle;
    }
}