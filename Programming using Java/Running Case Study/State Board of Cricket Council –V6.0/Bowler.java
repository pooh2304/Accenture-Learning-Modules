package com.sbcc.model;

public class Bowler extends Player{
	private int noOfMaiden,noOfHattrick;
	private double starRating;
	
	public void setNoOfMaiden(int m){
	    noOfMaiden = m;
	}
	public void setNoOfHattrick(int h){
	    noOfHattrick = h;
	}
	public void setStarRating(double r){
	    starRating = r;
	}
	public int getNoOfMaiden(){
	    return noOfMaiden;
	}
	public int getNoOfHattrick(){
	    return noOfHattrick;
	}
	public double getStarRating(){
	    return starRating;
	}
	public Bowler(){}
	
	public Bowler(String playerId , String playerName , int matchesPlayed, int runScored , String playingZone , int noOfMaiden , int noOfHattrick) {
	    super(playerId,playerName,matchesPlayed,runScored,playingZone);
	    this.noOfMaiden = noOfMaiden;
	    this.noOfHattrick = noOfHattrick;
	}
	public void findStarRating(){
	    this.starRating=((this.noOfMaiden*5.0)+(this.noOfHattrick*10.0))*this.getMatchesPlayed()/100;
	}
}