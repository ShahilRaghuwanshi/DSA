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
		for(int i = 0; i < p; i++) {
			for(int  j = 0; j < n; j++) {
				for(int k = 0; k < n; k++) {
					System.out.print(i+ " "+ j+" "+k);
				}
				System.out.println();
			}
		}
	}
}
