package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.TreeSet;

public class arratlist {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList hs=new ArrayList();
		hs.add(10);
		hs.add(1);
		hs.add(77);
		hs.add(55);
		hs.add(10);
		hs.add(12);
		//System.out.println(hs);
        ListIterator li = hs.listIterator();

        while (li.hasNext()) {	
        	li.next();}
        System.out.println("========================");
        while (li.hasPrevious()) {	
        	System.out.println(li.previous());
		}
	
		}
	
		
	}

