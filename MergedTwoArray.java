package javaTask;

import java.util.Arrays;

public class MergedTwoArray {
	
	    public static void main(String[] args) {
	        int[] arr1 = {1, 3, 5};
	        int[] arr2 = {2, 4, 6};
	        
	        int[] mergedArray = new int[arr1.length + arr2.length];
	        
	        int i = 0;
	        for (int element : arr1) {
	            mergedArray[i] = element;
	            i++;
	        }
	        
	        for (int element : arr2) {
	            mergedArray[i] = element;
	            i++;
	        }
	        
	        Arrays.sort(mergedArray);
	        String mergeArrayVallue = Arrays.toString(mergedArray);
	        System.out.println(mergeArrayVallue);
	    }
	}
