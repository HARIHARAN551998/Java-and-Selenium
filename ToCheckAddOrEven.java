package javaTask;

import java.util.Scanner;

public class ToCheckAddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        sc.close();
	        if(num % 2 == 0)
	            System.out.println(num + " is even");
	        else
	            System.out.println(num + " is odd");
	}

}