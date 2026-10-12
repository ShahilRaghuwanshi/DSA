package RecursionLevel1;

import java.util.Scanner;

public class DisplayAnArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		displayArray(arr, 0);
	}
	
	public static void displayArray(int[] a, int n) {
		
		if(n == a.length) {
			return;
		}
		System.out.println(a[n]);
		displayArray(a, n + 1);
	}
}
