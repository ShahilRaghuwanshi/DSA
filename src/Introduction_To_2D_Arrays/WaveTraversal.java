package Introduction_To_2D_Arrays;

import java.util.Scanner;

public class WaveTraversal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		int[][] arr = new int[r][c];
		
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				for(int k = 0; k < r; k++) {
					System.out.print(arr[k][j]);
				}
				for(int k = r - 1; k >= 0; k--) {
					System.out.print(arr[k][j]);
				}
			}
		}
	}
}
