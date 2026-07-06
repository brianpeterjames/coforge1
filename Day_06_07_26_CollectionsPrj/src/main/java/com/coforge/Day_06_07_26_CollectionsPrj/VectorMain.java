package com.coforge.Day_06_07_26_CollectionsPrj;

import java.util.List;
import java.util.Vector;

public class VectorMain {

    public static void main(String[] args) {
        // 1. Declare and initialize the Vector inside the method
        List<Integer> v = new Vector<Integer>();
        for(int i=1;i<=10;i++)
        	v.add(i);
        System.out.println(v);
        System.out.println(((Vector<Integer>) v).capacity());
        
        // 2. Add elements to the vector
//        v.add(56);
//        v.add(67);
        v.add(11);
        System.out.println(((Vector<Integer>) v).capacity());
        // vector capacity doubled 
        
    }
}