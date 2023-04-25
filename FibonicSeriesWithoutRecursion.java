package javaTask;

import java.util.Scanner;

public class FibonicSeriesWithoutRecursion {

	public static void main(String[] args) {

		
		int prev=0;
		int next=1;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the how many number for fabonic series :");
		int num=sc.nextInt();
		System.out.println("**********");
		System.out.println(prev);
		System.out.println(next);
		for(int i=0;i<num;i++) {
			sum=prev+next;
			System.out.println(sum);
			prev=next;
			next=sum;
		}
		
		sc.close();
	}

}
