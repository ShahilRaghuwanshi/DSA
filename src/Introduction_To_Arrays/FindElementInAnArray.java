package Introduction_To_Arrays;

import java.util.Scanner;

public class FindElementInAnArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i = 0; i < arr.length; i++) {
		arr[i] = sc.nextInt();
	}
	
	int ele = sc.nextInt();
	
	for(int i = 0; i < arr.length; i++) {
		if(ele == arr[i]) {
			System.out.println(i);
			return;
		}
	}
	System.out.println(-1);
}
}
