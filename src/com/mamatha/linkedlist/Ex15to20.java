package com.mamatha.linkedlist;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Ex15to20 {

	public static void main(String[] args) {
	LinkedList<String> lsdata = new LinkedList();
	lsdata.add("blue");
	lsdata.add("orange");
	lsdata.add("purple");
	lsdata.add("black");
	lsdata.add("green");
	System.out.println(lsdata);
	//Collections.swap(lsdata, 0, 2);
	
	//now without using collection  swapping
	
		String temp =  lsdata.get(0);
	String  ls = 	lsdata .set(0, lsdata.get(2));
	System.out.println(ls);
		String lt = lsdata.set(2, temp);
		System.out.println(lt);
		
		System.out.println("after swapping LL");
		System.out.println(lsdata);
		//ex 16 th code
		Collections.shuffle(lsdata);
		System.out.println("after shuffling ");
		System.out.println(lsdata);
		//Ex 17
		LinkedList l2 = new LinkedList<>();
		l2.add("Red Roses");
		l2.add("yellow sunflower");
		l2.add("green leafs");
		
	
	

	}

}
