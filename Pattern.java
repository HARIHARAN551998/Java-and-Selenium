package javaTask;

public class Pattern {

	public static void main(String[] args)   
	{  
		int n = 7; // number of rows in the pattern
		System.out.print("*");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.print("*"); // move to the next line and add *
		}
	}
}  

