package com.kh.Test2402062;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class LotteryController {

	private HashSet lottery = new HashSet();
	
	private HashSet win = new HashSet();
	
	public boolean insertObject(Lottery l) {
		
		return lottery.add(l);
		
	}

	public boolean deleteObject(Lottery l) {
		
		if (win != null) {
			
			win.remove(l);
			
			return lottery.remove(l);
			
		} else {
			
			return lottery.remove(l);
			
		}
	}
	
	public HashSet winObject() {

		ArrayList winArray = new ArrayList();
		
		Iterator iterator = lottery.iterator();
		
		while (iterator.hasNext()) {
			
			winArray.add(iterator.next());
			
		}
		
		for (int i = 0; i < 4; i++) {
			
			win.add(winArray.get(i));
			
		}
		
		return win;
	}
	
	public TreeSet sortedWinObject() {

		
		
	}
	
	public boolean searchWinner(Lottery l) {
		
		return win.contains(l);
		
	}

}
