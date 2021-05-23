import java.util.*;

public class Main {
	public static void main(String[] args) {
		Player[] pObj=new Player[4];
		pObj[0]=new Player(146,"Athul",16,9876543210l);
		pObj[1]=new Player(135,"Rakshana",16,9956231045l);
		pObj[2]=new Player(168,"Christy",16,9856471230l);
		pObj[3]=new Player(194,"Athulya",16,9768541230l);
		
		int id;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id to be searched");
		id=sc.nextInt();
		Player p=new PlayerUtility().findPlayerDetailsById(pObj,id);
		if(p==null)
		    System.out.println("No player found");
		else{
		    System.out.println("Name:"+p.getPlayerName());
		    System.out.println("Phone number:"+p.getPhoneNumber());
		}   
	}
}