package javaTask;
import java.util.Arrays;

public class TwoArrayContainSameElement {

	    public static void main(String[] args) {
	        int[] arr1 = {1, 2, 3, 4, 5};
	        int[] arr2 = {5, 4, 3, 2, 1};

	        boolean areEqual = Arrays.equals(arr1, arr2);

	        if (areEqual) {
	            System.out.println("The two arrays contain the same elements.");
	        } else {
	            System.out.println("The two arrays do not contain the same elements.");
	        }
	    }
	}