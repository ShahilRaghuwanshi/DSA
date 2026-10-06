package Introduction_To_2D_Arrays;

import java.util.Scanner;

public class DiagonalTraversal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] arr = new int[n][m];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				
					if(i == j) System.out.println(arr[i][j]);
					else if(i+1 == j) System.out.println(arr[i][j]);
					else if(i+2 == j) System.out.println(arr[i][j]);
					else if(i+3 == j) System.out.println(arr[i][j]);

			}
		}
	}
}
