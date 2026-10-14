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
		int li = lI(arr, 0, x);
		System.out.println(li);
	}
	
	public static int lI(int[] arr, int idx, int x) {
		if(idx == arr.length) {
			return -1;
		}
		int liisa = lI(arr, idx + 1, x);
		if(arr[idx] == x) {
			if(arr[idx] == x) {
				return idx;
			}else {
				return -1;
			}
		}else {
			return liisa;
		}
	}
	
}
