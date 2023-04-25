package javaTask;
import java.util.Arrays;

public class RemoveDuplicateElementFromArray {

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 3, 4, 4, 5}; // original array
	        int[] newArr = new int[arr.length]; // new array to hold unique elements
	        int index = 0; // index of the new array

	        for (int i = 0; i < arr.length; i++) {
	            boolean isDuplicate = false;
	            for (int j = 0; j < index; j++) {
	                if (arr[i] == newArr[j]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }
	            if (!isDuplicate) {
	                newArr[index++] = arr[i];
	            }
	        }

	        newArr = Arrays.copyOf(newArr, index); // resize the new array to remove unused elements
	        System.out.println(Arrays.toString(newArr)); // print the new array
	    }
	}
