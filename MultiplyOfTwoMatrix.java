package javaTask;

public class MultiplyOfTwoMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int n = 2;
	      int[][] a = { {1, 2, 1}, {2, 1, 2}};
	      int[][] b = { {2, 2, 2}, {1, 1, 1}};
	      int[][] c = new int[n][n];
	      System.out.println("Matrix A:");
	      for (int i = 0; i < n; i++) {
	         for (int j = 0; j < n; j++) {
	            System.out.print(a[i][j] + " ");
	         }
	         System.out.println();
	      }
	      System.out.println("Matrix B:");
	      for (int i = 0; i < n; i++) {
	         for (int j = 0; j < n; j++) {
	            System.out.print(b[i][j] + " ");
	         }
	         System.out.println();
	      }
	      for (int i = 0; i < n; i++) {
	         for (int j = 0; j < n; j++){
	            for (int k = 0; k < n; k++) {
	               c[i][j] = c[i][j] + a[i][k] * b[k][j];
	            }
	         }
	      }
	      System.out.println("The product of two matrices is:");
	      for (int i = 0; i < n; i++) {
	         for (int j = 0; j < n; j++) {
	            System.out.print(c[i][j] + " ");
	         }
	         System.out.println();
	      }
	}

}
