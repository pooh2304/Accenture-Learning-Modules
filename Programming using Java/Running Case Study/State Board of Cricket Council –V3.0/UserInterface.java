package com.sbcc.main;

import com.sbcc.model.*;
import com.sbcc.utility.*;
import java.util.*;
import java.lang.*;
import com.sbcc.skeletonvalidator.SkeletonValidator;

public class UserInterface {
    public static Player pl;

	public static void main(String[] args) {
		SkeletonValidator validator = new SkeletonValidator();
		Scanner sc = new Scanner(System.in);
		int choice=0;
        while(choice!=2){
            System.out.println("1.Validate player details\n2.Exit");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the player details");
                    String inp= sc.next();
                    Player obj;
                    SBCCUtility obj1= new SBCCUtility();
                    obj=obj1.parsePlayerDetails(inp);
                    if(obj==null){
                        System.out.println("Please provide a valid record");
                        break;
                    }
                    System.out.println("Player id: "+obj.getPlayerId());
                    System.out.println("Player name: "+obj.getPlayerName());
                    System.out.println("Matches played: "+obj.getMatchesPlayed());
                    System.out.println("Total runs scored: "+obj.getRunScored());
                    System.out.println("Playing zone: "+obj.getPlayingZone());
                    break;
                case 2:
                    System.out.println("Thank you for using SBCC application");
                    System.exit(0);
                    break;
            }
	    }
	}
}