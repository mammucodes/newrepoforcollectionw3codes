package com.mamatha.linkedlist;

import java.util.LinkedList;

public class Ex7to14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ls = new LinkedList();
		ls.add("riya");
		ls.add("limbu");
		ls.add("manoj");
		System.out.println("pritnting elements before adding at front end");
		for (int i = 0; i < ls.size(); i++)
			System.out.println("list data : " + ls.get(i));
//		//entering at firdt position
//		     ls.add(0, "aadhi");
//		   System.out.println("after adding at front end");
//		   for(int i =0;i<ls.size();i++)
//				System.out.println("list data : "+ls.get(i));
//		   //entering at last position
//		   ls.add(ls.size()-1, "raaj");
//		   System.out.println("after adding at last position");
//		   for(int i =0;i<ls.size();i++)
//				System.out.println("list data : "+ls.get(i));

		/***************************/

		// entering at firdt position or at first linked list
		ls.addFirst("aadhi");
		// entering at last position or at end linked list
		ls.addLast("naag");
		System.out.println(ls);
		// inserting at the given specified postion
		ls.add(3, "harish");
		System.out.println(ls);
		// to get the first and last occurrence of the specified elements
		System.out.println("first ellemt in list: " + ls.getFirst());
		System.out.println("last element in the list: " + ls.getLast());

		System.out.println();
		// display the elements and their positions in a linked list.
		System.out.println("display the elements and their positions in a linked list.");
		for (int i = 0; i < ls.size(); i++) {
			System.out.println("element at index  " + i + " " + ls.get(i));
		}

		// to remove specifed element from LL
		System.out.println();
		ls.remove(2);
		ls.removeFirst();
		ls.removeLast();
		// printing
		System.out.println("printing after remvoing  few  elements from LL");
		System.out.println(ls);
		ls.removeAll(ls);
		System.out.println("printing after remvoing  all elements from LL");
		System.out.println(ls);

	}

}
