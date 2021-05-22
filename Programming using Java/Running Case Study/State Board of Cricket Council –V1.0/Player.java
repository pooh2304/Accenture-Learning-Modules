package com.sbcc.model;

public class Player {
    private String playerId;
    private String playerName;
    private int matchesPlayed;
    private int runScored;
    private String playingZone;
    
    public Player(String playerId, String playerName, int matchesPlayed, int runScored, String playingZone){
        this.playerId=playerId;
        this.playerName=playerName;
        this.matchesPlayed=matchesPlayed;
        this.runScored=runScored;
        this.playingZone=playingZone;
    }
    public Player(){}
    
    public void setPlayerId(String playerId){
        this.playerId=playerId;
    }
    public String getPlayerId(){
        return playerId;
    }
    public void setPlayerName(String playerName){
        this.playerName=playerName;
    }
    public String getPlayerName(){
        return playerName;
    }
    public void setMatchesPlayed(int matchesPlayed){
        this.matchesPlayed=matchesPlayed;
    }
    public int getMatchesPlayed(){
        return matchesPlayed;
    }
    public void setRunScored(int runScored){
        this.runScored=runScored;
    }
    public int getRunScored(){
        return runScored;
    }
    public void setPlayingZone(String playingZone){
        this.playingZone=playingZone;
    }
    public String getPlayingZone(){
        return playingZone;
    }
}