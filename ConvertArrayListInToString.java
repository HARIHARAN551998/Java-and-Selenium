package javaTask;

import java.util.ArrayList;

public class ConvertArrayListInToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> languages= new ArrayList<>();

	    // Add elements in the array list
	    languages.add("HARI");
	    languages.add("HARAN");
	    languages.add("PRIYA");
	    languages.add("DHARSHNI");
	    System.out.println("ArrayList: " + languages);

	    // convert the arraylist into a string
	    String arraylist = languages.toString();
	    System.out.println("String: " + arraylist);

	}

}
