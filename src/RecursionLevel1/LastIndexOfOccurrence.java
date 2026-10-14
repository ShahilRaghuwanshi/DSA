package RecursionLevel1;

import java.util.Scanner;

public class LastIndexOfOccurrence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		int l = lIOA(arr, 0, x);
		System.out.println(l);
	}
	
	public static int lIOA(int[] arr, int idx, int x) {
		int l = arr.length - 1;
		if(l == 0) {
			return -1;
		}
		
		int li = lIOA(arr, l - 1, x);
		if(arr[l] == x) {
			return l;
		}else {
			return li;
		}
	}
}
