package Introduction_To_Arrays;

import java.util.Scanner;

public class RotateAnArray2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int k = sc.nextInt();
		k =  k % n;
		if(k < 0) {
			k = k + n;
		}
		// p1
		reverse(arr, 0, arr.length - k - 1);
		//p2
		reverse(arr, arr.length - k, arr.length -1);
		//whole array
		reverse(arr, 0, arr.length - 1);
	
		
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void reverse(int[] arr, int i, int j) {
		int li = i;
		int ri = j;
		while(li < ri) {
			int temp = arr[li];
			arr[li] = arr[ri];
			arr[ri] = temp;
			ri--;
			li++;
		}
	}
}
