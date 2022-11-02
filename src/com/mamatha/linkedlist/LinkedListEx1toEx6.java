package com.mamatha.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx1toEx6 {

	public static void main(String[] args) {
		// create an empty linked list
		LinkedList<String> inputList = new LinkedList();

		// use add() method to add values in the linked list
		inputList.add("RED");
		inputList.add("WHITE");
		inputList.add("YELLOW");
		inputList.add("ORANGE");
		inputList.add("GREEN");
		System.out.println(inputList);

		// Ex 2
		// iterate each item in the Linkedlist one by one using for each loop
		for (String temp : inputList) {
			System.out.println(temp);
		}

		// Ex 3
		System.out.println();
		System.out.println("Iterating data from given index");
		for (int i = 2; i < inputList.size(); i++) {

			System.out.println(inputList.get(i));
		}

		// another way to iterate
		// set Iterator at specified index
		Iterator p = inputList.listIterator(1);

		System.out.println();

		// print list from second position

		while (p.hasNext()) {
			System.out.println(p.next());
		}

		//Ex 4 
		System.out.println();System.out.println("printing in reverse order");
		System.out.println();
		for(int i = inputList.size()-1;i>=0;i--)
		{
			System.out.println(inputList.get(i));
		}
		//another way
		System.out.println();
		  // print original list
		   System.out.println("Original linked list:" + inputList);  
		 
		    Iterator it = ((LinkedList) inputList).descendingIterator();

		     // Print list elements in reverse order
		     System.out.println("Elements in Reverse Order:");
		     while (it.hasNext()) {
		        System.out.println(it.next());
	}
		    
		     System.out.println();
		     //Ex 5
		     int index = 1;
		     String color = "Brown";
		     System.out.println("setting the "+index+" element with "+color+"color");
		     inputList.add(index, color);
		     System.out.println("printing modifed list : "+inputList);
		     System.out.println();
		     
		     //Ex6 insert data at first and last index of the list
		     
		     System.out.println("insertig data at first and last index of the linked list");
		     inputList.add(0, "Pink");
		     inputList.add(inputList.size(), "BLack");
		     System.out.println("after inserting list :"+inputList);
		     //another way of inserting
		  // Add an element at the beginning 
		   //  ((LinkedList) inputList).addFirst("White"); // these should be casted if it is given as list in cration
		  
		     inputList.addFirst("pink");
		    // Add an element at the end of list 
		     inputList.addLast("GOLD");
		      System.out.println("Final linked list:" + inputList); 
		   
		    
}}

