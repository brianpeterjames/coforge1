package com.coforge;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        ArrayList alist = new ArrayList();
//        alist.add(10);  
//        alist.add("swapna"); //insertion order preserved 
//        alist.add(56.78f); //56.78 ---> Float OBJECT 
//        alist.add(98.06);
//        alist.add(true);
//        alist.add(null);
//        alist.add(10);
//        alist.add(10);
//        alist.add(10);
//        System.out.println("Array List Elements");
//        for(int i=0;i<alist.size();i++)
//        {
//        	System.out.println(alist.get(i));
//        }

//        
	ArrayList<Integer> iList = new ArrayList<Integer>();
	iList.add(34);
	iList.add(89);
	iList.add(32);
	iList.add(4);
	iList.add(3);
	//iList.add(null);
	//iList.add(null);
	for(int i=0;i<iList.size();i++)
     {
      	System.out.println(iList.get(i));
     }
	iList.add(3, 78);
	for(int i=0;i<iList.size();i++)
    {
     	System.out.println(iList.get(i));
    }
	ArrayList<Integer> aList = new ArrayList<Integer>();
	aList.add(78);
	aList.add(66);
	aList.add(59);
	
	iList.addAll(aList);
	System.out.println("****************");
	
	System.out.println("Array List Elements");
  for(int i=0;i<iList.size();i++)
  {
  	System.out.println(iList.get(i));
  }
  System.out.println("****************");
  System.out.println(iList.contains(34));
    System.out.println("****************");
  //Using enhanced for loop 
  for(Integer i:iList)
  {
	  System.out.println(i);
  }
  System.out.println("****************");
  System.out.println(iList.containsAll(aList));
  System.out.println("****************");
 // System.out.println(iList.remove(0));
 // System.out.println("****************");
  Integer rem = 34;
  System.out.println(iList.remove(rem));
  System.out.println("****************");
  System.out.println(iList.removeAll(aList));
  
  for(int i=0;i<iList.size();i++)
  {
  	System.out.println(iList.get(i));
  }
  System.out.println("****************");
  iList.ensureCapacity(35);
  System.out.println(iList.size());
  System.out.println("****************");
  iList.forEach(i->System.out.println(i));   // important 
  System.out.println("****************");
  // Iterators 
//  Iterator<Integer> itr = iList.iterator();
//  while(itr.hasNext())
//  {
//	  int value = itr.next();
//  	  if(value == 32)
//  	  {
//  		  itr.remove();
//  		  System.out.println(value);
//  	  }
//  }
//  	  System.out.println(iList);
//  
  ListIterator<Integer> itr = iList.listIterator();
  while(itr.hasNext())
	  System.out.println(itr.next());
  System.out.println("****************");
  System.out.println("Reversed List");
  while(itr.hasPrevious())
  {
	  System.out.println(itr.previous());
  }
  System.out.println("****************");
  System.out.println("Clone ArrayList");
  ArrayList<Integer> clonedList = (ArrayList<Integer>) iList.clone();
		  System.out.println(iList.hashCode());
  System.out.println(clonedList.hashCode());
  iList.add(500);
  System.out.println(iList.hashCode());
  System.out.println(clonedList.hashCode());
    }
}
