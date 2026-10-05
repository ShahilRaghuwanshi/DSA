package Introduction_To_2D_Arrays;

import java.util.Scanner;

public class ExitPointOfAMatrix {
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
		
		int dir = 0; 		//direction 0 - E, 1 - S, 2 - W, 4 - N
		int i = 0;
		int j = 0;
		while(true) {
			dir = (dir + arr[i][j]) % 4;
			if(dir == 0) {				//East
				j++;
			}
			else if(dir == 1) { 		//South
				i++;
			}
			else if(dir == 2) {			//West
				j--;
			}
			else if(dir == 3) {			//North
				i--;
			}
			
			if(i < 0) {
				i++;
				break;
			}else if(j < 0) {
				j++;
				break;
			}else if(i == arr.length) {
				i--;
				break;
			}else if(j == arr[0].length) {
				j--;
				break;
			}
		}
		System.out.println(i);
		System.out.println(j);
	}
}
