package javaTask;

public class MethodOverLoadingDifferArgument {
	
	
	    public static void main(String[] args) {
	    	MethodOverLoadingDifferArgument example = new MethodOverLoadingDifferArgument();
	        example.printNumbers(10);
	        example.printNumbers(20, 30);
	        example.printNumbers(40, 50, 60);
	    }
	    
	    public void printNumbers(int num1) {
	        System.out.println("The single number is: " + num1);
	    }
	    
	    public void printNumbers(int num1, int num2) {
	        System.out.println("The two numbers are: " + num1 + " and " + num2);
	    }
	    
	    public void printNumbers(int num1, int num2, int num3) {
	        System.out.println("The three numbers are: " + num1 + ", " + num2 + ", and " + num3);
	    }
	}

