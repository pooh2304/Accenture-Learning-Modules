package com.sbcc.model;

public class Batsman extends Player{
    private double starRating;
    private int noOfHundreds;
    private int noOfFifties;
    public double getStarRating(){
        return starRating;
    }
    public void setStarRating(double starRating){
        this.starRating=starRating;
    }
    public void setNoOfHundreds(int noOfHundreds){
        this.noOfHundreds=noOfHundreds;
    }
    public void setNoOfFifties(int noOfFifties){
        this.noOfFifties=noOfFifties;
    }
    public int getNoOfHundreds(){
        return noOfHundreds;
    }
    public int getNoOfFifties(){
        return noOfFifties;
    }
    public void findStarRating(){
        starRating=((noOfHundreds*10.0)+(noOfFifties*5.0))*getMatchesPlayed()/100;
    }
    public Batsman(){
        super();
        noOfFifties=0;
        noOfHundreds=0;
    }
    public Batsman(String playerId,String playerName,int matchesPlayed,int runScored,String playingZone,int noOfHundreds,int noOfFifties){
        super(playerId,playerName,matchesPlayed,runScored,playingZone);
        this.noOfHundreds=noOfHundreds;
        this.noOfFifties=noOfFifties;
    }
}
