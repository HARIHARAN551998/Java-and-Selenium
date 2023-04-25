package javaTask;

public class MaximumRepeatedCharCount {

	    public static void main(String[] args) {
	        String str = "Hello, i am hariharan i'm looking for job";
	        int maxCount = 0;
	        
	        for (int i = 0; i < str.length(); i++) {
	            int count = 1;
	            char c = str.charAt(i);
	            
	            for (int j = i + 1; j < str.length(); j++) {
	                if (c == str.charAt(j)) {
	                    count++;
	                }
	            }
	            
	            if (count > 1 && count > maxCount) {
	                maxCount = count;
	            }
	        }
	        
	        System.out.println("Maximum repeated character count: " + maxCount); // Output: 3
	    }
	}