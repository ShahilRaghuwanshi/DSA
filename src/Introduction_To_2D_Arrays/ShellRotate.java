package Introduction_To_2D_Arrays;

import java.util.Scanner;

public class ShellRotate {
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
		
		int s = sc.nextInt();			//noOfShell
		int r = sc.nextInt();			//noOfRatation
		
		rotateShell(arr, s, r);
		display(arr);
		
	}
	
	public static void rotateShell(int[][] arr, int s, int r) {
		int[] oneD = fillOneDFromShell(arr, s);						//step 1: shell ko 1D me bhre
		rotate(oneD, r);											//step 2: rotate 1D
		fillShellFromOneD(arr, s, oneD); 							//step 3: oneD ko shell me fill
	}
	
	public static int[] fillOneDFromShell(int[][] arr, int s) {
		int minr = s - 1;
		int minc = s - 1;
		int maxr = arr.length - s;
		int maxc = arr[0].length - s;
		int sz = 2 * (maxr - minr + maxc - minc);
		
		int[] oneD = new int[sz];
		
		//lw
		int idx = 0;
		for(int i = minr, j = minc; i <= maxr; i++) {
			oneD[idx] = arr[i][j];
			idx++;
		}
		//bw
		for(int i = maxr, j = minc + 1; j <= maxc; j++) {
			oneD[idx] = arr[i][j];
			idx++;
		}
		//rw
		for(int i = maxr - 1, j = maxc; i >= minr; i--) {
			oneD[idx] = arr[i][j];
			idx++;
		}
		//tw
		for(int i = minr, j = maxc - 1; j >= minc + 1; j--) {
			oneD[idx] = arr[i][j];
			idx++;
		}
		
		return oneD;
	}
	
	public static void fillShellFromOneD(int[][] arr, int s, int[] oneD) {
		int minr = s - 1;
		int minc = s - 1;
		int maxr = arr.length - s;
		int maxc = arr[0].length - s;
		
		//lw
		int idx = 0;
		for(int i = minr, j = minc; i <= maxr; i++) {
			arr[i][j] = oneD[idx];
			idx++;
		}
		//bw
		for(int i = maxr, j = minc + 1; j <= maxc; j++) {
			arr[i][j] = oneD[idx];
			idx++;
		}
		//rw
		for(int i = maxr - 1, j = maxc; i >= minr; i--) {
			arr[i][j] = oneD[idx];
			idx++;
		}
		//tw
		for(int i = minr, j = maxc - 1; j >= minc + 1; j--) {
			arr[i][j] = oneD[idx];
			idx++;
		}
	}
	
	public static void rotate(int[] oneD, int r) {
		r  = r % oneD.length;
		if(r < 0) {
			r = r + oneD.length;
		}
		
		reverse(oneD, 0, oneD.length - r - 1);
		reverse(oneD, oneD.length - r, oneD.length - 1);
		reverse(oneD, 0, oneD.length - 1);
	}
	
	public static void reverse(int[] oneD, int li, int ri) {
		while(li < ri) {
			int temp = oneD[li];
			oneD[li] = oneD[ri];
			oneD[ri] = temp;
			
			li++;
			ri--;
		}
	}
	
	public static void display(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
