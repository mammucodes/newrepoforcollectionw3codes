package com.mamatha.linkedlist;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Ex15to22 {

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
		LinkedList<String> l2 = new LinkedList<>();
		l2.add("Red Roses");
		l2.add("yellow sunflower");
		l2.add("green leafs");
		LinkedList joinlist = new LinkedList();
		joinlist.addAll(lsdata);
		joinlist.addAll(l2);
		System.out.println("joined two Linked List "+joinlist);
		//Ex 18
		//clone the liunked list
		System.out.println("orginal list "+l2);
		LinkedList newcopylist = new LinkedList();
		newcopylist = (LinkedList) l2.clone();
		System.out.println("copied list "+newcopylist);
		//ex19; remove and return first element in the list
		
		System.out.println("Removed element: "+l2.pop());
		//another way to do it

	 
	//remove first is used to remove and return first element in the list same as pop()
//	String firstElementinList = l2.removeFirst();
//	System.out.println("first element in list "+firstElementinList);
//	System.out.println("after removing first element in list :"+l2);
	
	//Ex20
		String firstElementList = lsdata.peekFirst();
		System.out.println("first element in list "+firstElementList);
	
//ex21 
		String lastElementinList = lsdata.peekLast();
		System.out.println("last element in the list "+lastElementinList);
		//Ex 22
		System.out.println();
	boolean ispresent =	lsdata.contains("green");
	System.out.println("contains data :"+ispresent);
	}

}
