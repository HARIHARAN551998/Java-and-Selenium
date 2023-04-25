package javaTask;

public class DuplicateCharacterDetector {
	
	
	    public static void main(String[] args) {
	        String inputStr = "hello world";
	        String duplicateChars = "";

	        for (int i = 0; i < inputStr.length(); i++) {
	            char currentChar = inputStr.charAt(i);
	            if (inputStr.indexOf(currentChar) != i && duplicateChars.indexOf(currentChar) == -1) {
	                duplicateChars += currentChar + " ";
	            }
	        }

	        System.out.println("Duplicate characters in the string '" + inputStr + "' are: " + duplicateChars);
	    }
	}