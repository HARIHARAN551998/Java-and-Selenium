package javaTask;

import java.util.Scanner;

public class FactorialUsingRecursion {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number :");

		int num=sc.nextInt();
		sc.close();
		
		long factorial = multiplyNumbers(num);
		System.out.println("Factorial of " + num + " = " + factorial);
	}
	public static long multiplyNumbers(int num)
	{
		if (num >= 1)
			return num * multiplyNumbers(num - 1);
		else
			return 1;
	}

}