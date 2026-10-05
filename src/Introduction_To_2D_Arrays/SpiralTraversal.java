package Introduction_To_2D_Arrays;

import java.util.Scanner;

public class SpiralTraversal {
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
		
		int minr = 0;       				//min row
		int minc = 0;						//min column
		int maxr = arr.length - 1;			//max row
		int maxc = arr[0].length - 1;		//max column
		int tne = r * c;					//total number of elements
		int cnt = 0;
		while(cnt < tne) {
			//left wall
			for(int i = minr, j = minc; i <= maxr && cnt < tne; i++) {
				System.out.println(arr[i][j]);
				cnt++;
			}
			minc++;
			//bottom wall
			for(int i = maxr, j = minc; j <= maxc && cnt < tne; j++) {
				System.out.println(arr[i][j]);
				cnt++;
			}
			maxr--;
			//right wall
			for(int i = maxr, j = maxc; i >= minr && cnt < tne; i--) {
				System.out.println(arr[i][j]);
				cnt++;
			}
			maxc--;
			//top wall
			for(int i = minr, j = maxc; j >= minc && cnt < tne; j--) {
				System.out.println(arr[i][j]);
				cnt++;
			}
			minr++;
		}
	}
}
