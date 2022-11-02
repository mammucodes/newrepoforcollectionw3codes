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
	System.out.println(lsdata);
	//Collections.swap(lsdata, 0, 2);
	
	//now without using swapping
	
		String temp =  lsdata.get(0);
	String  ls = 	lsdata .set(0, lsdata.get(2));
	System.out.println(ls);
		String lt = lsdata.set(2, temp);
		System.out.println(lt);
		
		System.out.println("after swapping LL");
		System.out.println(lsdata);
	

	}

}
