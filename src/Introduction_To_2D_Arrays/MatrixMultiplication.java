package Introduction_To_2D_Arrays;

import java.util.Scanner;

public class MatrixMultiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int[][] arr1 = new int[n1][n2];
		for(int i = 0;i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
			arr1[i][j] = sc.nextInt();
			}
		}
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int[][] arr2 = new int[n3][n4];
		for(int i = 0;i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
			arr2[i][j] = sc.nextInt();
			}
		}
		
		int[][] arr3 = new int[n1][n4];
		for(int i = 0;i < arr3.length; i++) {
			for(int j = 0; j < arr3[i].length; j++) {
			
			}
		}
	}
}
