package javaTask;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the word :");

		String str=sc.nextLine();
		sc.close();
		String reverse="";
		if(str==null || str.isEmpty()) {
			System.out.println("its not applicable");
		}

		for(int i=str.length()-1; i>=0; i--){

			reverse=reverse+str.charAt(i);
		}
		System.out.println("Reverse of entered word: "+reverse);
	}

}
