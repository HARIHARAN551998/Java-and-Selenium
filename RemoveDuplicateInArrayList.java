package javaTask;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicateInArrayList {
	
	
	    public static void main(String[] args) {
	        ArrayList<String> inputList = new ArrayList<>();
	        inputList.add("apple");
	        inputList.add("banana");
	        inputList.add("orange");
	        inputList.add("apple");
	        inputList.add("banana");
	        inputList.add("orange");

	        System.out.println("Original list: " + inputList);

	        HashSet<String> uniqueSet = new HashSet<>(inputList);
	        ArrayList<String> outputList = new ArrayList<>(uniqueSet);

	        System.out.println("List with duplicates removed: " + outputList);
	    }
	}
