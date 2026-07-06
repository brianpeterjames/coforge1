package com.coforge.Day_06_07_26_CollectionsPrj;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        LinkedList<String> namesList = new LinkedList<>();
        namesList.add("Brian");
        namesList.add("James");
        namesList.add("Peter");
        namesList.add("Brian");
        namesList.add(null);
        System.out.println(namesList);
        System.out.println("*****************");
        namesList.addLast("Sarthak");
        namesList.addFirst("Nisha");
        System.out.println(namesList);
        System.out.println("*****************");
        Iterator<String> itr = namesList.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
        System.out.println("*****************");
        itr = namesList.descendingIterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
        System.out.println("*****************");
        System.out.println(namesList.element());
        System.out.println("*****************");
        System.out.println(namesList.offer("Devesh")); // returns true if element added 
        System.out.println(namesList);
        System.out.println(namesList.offerFirst("Rajeev"));
        System.out.println(namesList);
        
        System.out.println("Peek name or first name : "+namesList.peek());
        System.out.println("Last name : "+namesList.peekLast());
        
        //Collections.sort(namesList);
        //System.out.println(namesList);
     
    }
}
