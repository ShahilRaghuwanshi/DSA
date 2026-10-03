package Introduction_To_Arrays;

import java.util.Scanner;

public class InverseOfAnArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int[] a2 = new int[n];
		for(int i = 0 ; i < a.length; i++) {
			 int num = a[i];
			 a2[num] = i;
		}
		for(int val : a2) {
			System.out.print(val+" ");
		}
	}
}
