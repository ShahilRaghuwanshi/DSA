package RecursionLevel1;

import java.util.Scanner;

public class LastIndexOfOccurrence1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		 arrLength(arr, 0, x);

	}
	
	public static void arrLength(int[] arr, int idx, int x) {
		int l = lIOA(arr, arr.length - 1, x);
		System.out.println(l);
	}
	public static int lIOA(int[] arr, int idx, int x) {
		
		if(idx <  0) {
			return -1;
		}
		
		if(arr[idx] == x) {
			return idx;
		}else {
			int li = lIOA(arr, idx - 1, x);
			return li;
		}
	}
}
