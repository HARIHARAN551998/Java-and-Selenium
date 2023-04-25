package javaTask;

public class MethodOverLoading {

	 public void printNumber(int num) {
	        System.out.println("The integer number is: " + num);
	    }
	    
	    public void printNumber(long num) {
	        System.out.println("The long number is: " + num);
	    }
	    
	    public void printNumber(float num) {
	        System.out.println("The float number is: " + num);
	    }
	    
	    public void printNumber(double num) {
	        System.out.println("The double number is: " + num);
	    }
	    public static void main(String[] args) {
	    	 MethodOverLoading example = new  MethodOverLoading();
	        example.printNumber(10);
	        example.printNumber(20L);
	        example.printNumber(30.0f);
	        example.printNumber(40.0);
	    }
	    
	   
	}


