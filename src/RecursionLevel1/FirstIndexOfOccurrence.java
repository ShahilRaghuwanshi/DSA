package RecursionLevel1;

import java.util.Scanner;

public class FirstIndexOfOccurrence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		int m = firstIndexOfOccurrence(arr, 0, x);
		System.out.println(m);
	}
	
	public static int firstIndexOfOccurrence(int[] arr, int idx, int x) {
		if(idx == arr.length - 1) {
			return idx;
		}
		firstIndexOfOccurrence(arr, idx + 1, x);
		if(arr[idx] != x) {
			return idx;
		}
		return idx;
	}
}
