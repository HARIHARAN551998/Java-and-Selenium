package javaTask;

import java.util.*; 
import java.util.stream.Stream; 
public class ConvertSetInToStream {

	    public static void main(String[] args) { 
	     
	    Set<Integer> set1 = new HashSet<>(); 

	    set1.add(12); 
	    set1.add(18); 
	    set1.add(24); 
	    set1.add(36); 
	    set1.add(48); 
	    set1.add(50); 

	    System.out.println(set1);
	    
	    Stream<Integer> stream1 = set1.stream(); 
	    System.out.println("\nAfter converting Set values into Stream values\n");
	    stream1.forEach(i->System.out.print(i+" ")); 
	      
	    } 
	}