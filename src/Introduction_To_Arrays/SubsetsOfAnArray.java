package Introduction_To_Arrays;

import java.util.Scanner;

public class SubsetsOfAnArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int  p = 2 ^ n;
		for(int i = 0; i < n - 1; i++) {
			for(int  j = 0; j < n - 1; j++) {
				for(int k = 0; k < n - 1; k++) {
					if(i == 0) System.out.print(" ");
					else System.out.println(arr[i]);
					if(j == 0) System.out.print(" ");
					else System.out.println(arr[j]);
					if(k == 0) System.out.print(" ");
					else System.out.println(arr[k]);
				}
				System.out.println();
			}
		}
		
	}
}
