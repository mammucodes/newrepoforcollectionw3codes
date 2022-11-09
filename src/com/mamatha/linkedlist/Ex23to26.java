package com.mamatha.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex23to26 {

	public static void main(String[] args) {
		LinkedList<String> ls = new LinkedList<String>();
		ls.add("ram");
		ls.add("sita");
		ls.add("hanuman");
		ls.add("laxaman");
		ls.add("raaj");
		ls.add("ll");
		ArrayList al = new ArrayList();
		al.addAll(ls);
		System.out.println(al);
		
		List<String> list = new ArrayList<String>(ls);
		for(String str : list)
		{
			System.out.println(str);
		}
		//ex 24
		LinkedList<String> l2 = new LinkedList<String>();
		l2.add("ram");
		l2.add("sita");
		l2.add("raaj");
		l2.add("hanuman");
		LinkedList<String> contain = new LinkedList<String>();
		for(String e :ls)
		
			contain.add(l2.contains(e)?"Yes":"NO");
		
		System.out.println(contain);
		//ex 25
		System.out.println("is list empty :"+l2.isEmpty());
		LinkedList l = new LinkedList();
		System.out.println("is list empty :"+l.isEmpty());
		//ex 26
	//	l2.add(0, "ramaraju"); //it will add at 0th place
		System.out.println(l2);
		l2.set(0, "ramaraju"); //it will replace element at 0th index
		System.out.println(l2);
	
		

	}

}
