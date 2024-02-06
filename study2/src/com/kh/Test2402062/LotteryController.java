package com.kh.Test2402062;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class LotteryController {

	private HashSet lottery = new HashSet();
	
	private HashSet win = new HashSet();
	
	public boolean insertObject(Lottery l) {
		
		return lottery.add(l);
		
	}

	public boolean deleteObject(Lottery l) {
		
		lottery.remove(l);
		
		
				
	}
	
	public HashSet winObject() {
		
		ArrayList winArray = new ArrayList();
		
		winArray.add(lottery);
		
		
		
		
		
	}
	
	public TreeSet sortedWinObject() {
		
	}
	
	public boolean searchWinner(Lottery l) {
		return true;
	}

}
