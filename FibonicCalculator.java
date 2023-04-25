package javaTask;
import java.util.Scanner;
public class FibonicCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number for Fibonic series: ");
		int number=scanner.nextInt();
		scanner.close();
		for(int i=0;i<=number;i++) {
			
			System.out.print(fibonic1(i)+" ");
		}
		
	}

	private static int fibonic1(int number) {
		// TODO Auto-generated method stub
		if(number==1 || number==2 ||number==0) {
			if(number==0) {
				return 0;
			}
			return 1;
		}
		int fibo=1,fibo2=1,fibonic=1;
		for(int i=3;i<=number;i++) {
			fibonic=fibo+fibo2;
			fibo=fibo2;
			fibo2=fibonic;
		}
		return fibonic;
	}

}
