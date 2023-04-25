package javaTask;

public class RemoveTheSpecialCharacter {
	
	    public static void main(String[] args) {
	        String str = "Hello! I am Hariharan i am prepare to interview <-->&~#@$";
	        String regex = "[^a-zA-Z0-9 ]"; // matches any character that is not a letter, digit, or space
	        String cleanStr = str.replaceAll(regex, ""); // replaces all non-alphanumeric characters with empty string
	        System.out.println("Original string: " + str);
	        System.out.println("Cleaned string: " + cleanStr);
	    }
	}
