package javaTask;

import java.util.Scanner;

public class ToCheckArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("Please enter the 3 digits number for if is a armstrong number or not : ");
		int num=scanner.nextInt();
		scanner.close();
		if(isArmStrong(num)) 
			System.out.println("Number: "+ num +" is ArmStrong Number...");//153 and 1634
		
		else
			System.out.println("Number: "+ num + " is Not ArmStrong Number...");

	}

	private static boolean isArmStrong(int num) {
		// TODO Auto-generated method stub
		int result=0;
		int original=num;
		while(num!=0) {
			int reminder=num%10;
			result=result+reminder*reminder*reminder;
			num=num/10;
		}
		if(result==original) {
			return true;
		}
		return false;
	}

}
