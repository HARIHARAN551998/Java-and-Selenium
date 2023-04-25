package javaTask;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the table : ");
		int num=scanner.nextInt();
		scanner.close();
	        for(int i = 1; i <= 10; ++i)
	        {
	            System.out.println(i+"*"+num +"="+i*num );
	        }
	    }
	}