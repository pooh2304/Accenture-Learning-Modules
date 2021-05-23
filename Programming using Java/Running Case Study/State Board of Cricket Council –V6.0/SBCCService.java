package com.sbcc.service;

import com.sbcc.dao.*;
import java.util.Map;

public class SBCCService {
	private SBCCBoard sb = new SBCCBoard();
	public void setSBCCBoard(SBCCBoard sb){
	    this.sb=sb;
	}
	public SBCCBoard getSBCCBoard(){
	    return sb;
	}
	public int addPlayerObject(String[] pDetails){
	    return sb.addPlayerObject(pDetails);
	}
	public Map<String,Double> findTopPlayerDetails(String playerType){
	    return sb.findTopPlayerDetails(playerType);
	}
}