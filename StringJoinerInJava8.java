package javaTask;

import java.util.StringJoiner;

public class StringJoinerInJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        StringJoiner joiner = new StringJoiner(", "); // create a new StringJoiner object with a delimiter of ', '
	        joiner.add("apple"); // add a string to the joiner
	        joiner.add("banana");
	        joiner.add("orange");
	        String result = joiner.toString(); // convert the joiner to a string
	        System.out.println(result); // print the result
	    }

	}