package com.sbcc.model;

public class Batsman extends Player {
	private int noOfHundreds,noOfFifties;
	private double starRating;

	public Batsman(){}

	public Batsman(String playerId , String playerName , int matchesPlayed , int runScored , String playingZone ,int noOfHundreds, int noOfFifties){
	    super(playerId,playerName,matchesPlayed,runScored,playingZone);
	    this.noOfHundreds = noOfHundreds;
	    this.noOfFifties = noOfFifties;
	}
	public void setNoOfHundreds(int h){
	    noOfHundreds = h;
	}
	public int getNoOfHundreds(){
	    return noOfHundreds;
	}
	public void setNoOfFifties(int f){
	    noOfFifties = f;
	}
	public int getNoOfFifties(){
	    return noOfFifties;
	}
	public void setStarRating(double r){
	    starRating = r;
	}
	public double getStarRating(){
	    return starRating;
	}
	public void findStarRating(){
	    this.starRating=((this.noOfHundreds*10.0)+(this.noOfFifties*5.0))*this.getMatchesPlayed()/100;
	}
}