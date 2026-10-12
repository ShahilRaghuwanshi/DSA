package RecursionLevel1;

import java.util.Scanner;

public class ArrayInReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		displayArrInReverse(arr, 0);
	}
	
	public static void displayArrInReverse(int[] arr, int n) {
		if(n == 0) {
			System.out.println(arr[0]);
			return;
		}
		displayArrInReverse(arr, n + 1);
		System.out.println(arr[n]);
	}
}
