package com.sitstech.java8ForEach;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	List<Integer> values= Arrays.asList(2,3,4,5);
    	// normal and enhanced for loop and iterator are external loop and it consumes time 
    	//normal for loop
    	System.out.println(" normal for loop");
    	for (int i=0 ; i<values.size(); i++) {
    		System.out.println(i);
    	}
    	// enhanced for loop

    	System.out.println(" enhanced for loop");
    	for(int i :values) {
    		System.out.println(i);
    	}
    	// using iterator
    	System.out.println(" using iterator");
    	Iterator<Integer> iterator=values.iterator();
    	while(iterator.hasNext()) {
    		System.out.println(iterator.next());
    	}
    	// using iterator3
    	System.out.println(" using iterator");
    	Iterator<Integer> iterator1=values.iterator();
    	while(iterator.hasNext()) {
    		System.out.println(iterator.next());
    	}
    	
        // using iterator4
    	System.out.println(" using iterator");
    	Iterator<Integer> iterator1=values.iterator();
    	while(iterator.hasNext()) {
    		System.out.println(iterator.next());
    	}
    	
    	System.out.println(" for each lambda expression");
    	// for each method in java - foreach method is internal loop method , for each is internal part of collections  
    	values.forEach(i -> System.out.println(i));// this is an implementation of consumer interface
    }
}
