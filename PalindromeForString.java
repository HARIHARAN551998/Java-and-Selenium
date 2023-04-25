 package javaTask;

import java.util.Scanner;

public class PalindromeForString {

	public static void main(String[] args) {

		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the palindrome :");
		String str=scanner.nextLine();
		String reverse="";
		
		for(int i=str.length()-1; i>=0; i--) {
			reverse=reverse+str.charAt(i);
		}
		System.out.println("your entered word is reversed in :"+reverse);
		if(reverse.equals(str)) {
			System.out.println("your enetered word is palindrome...");
		}
		else {
			System.out.println("it not palindrome...");
		}
		scanner.close();
	}

}
