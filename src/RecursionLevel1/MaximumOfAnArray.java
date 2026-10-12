package RecursionLevel1;

import java.util.Scanner;

public class MaximumOfAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int m = maximumOfArray(arr, 0);
		System.out.println(m);
	}
	
	public static int maximumOfArray(int[] arr, int idx) {
		if(idx == arr.length - 1) {
			return arr[idx];
		}
		int misa = maximumOfArray(arr, idx + 1);
		if(misa > arr[idx]) {
			return misa;
		}
		else {
			return arr[idx];
			}
	}
}
