package javaTask;


import java.util.Scanner;

public class BubbleSort {

	
public static void main(String[] args) {

		
		int a,b,c,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the how many number to sort :");
		a=sc.nextInt();

		int array[]=new int[a];
		System.out.println("enter the numbers :");
		sc.close();
		for(b=0;b<a;b++) {
		array[b]=sc.nextInt();
		}
		for(b=0;b<array.length;b++) {
			for(c=0;c<array.length-b-1;c++) {
				if(array[c]>array[c+1]) {     //---> use lesser than < to get reverse order
					temp=array[c];
					array[c]=array[c+1];
					array[c+1]=temp;
					
				}
			}
		}
		for(c=0;c<a;c++)
		System.out.println(array[c]);
		System.out.println("");
		
		
		
	} 
}
