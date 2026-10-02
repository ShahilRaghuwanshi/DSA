package Introduction_To_Arrays;

import java.util.Scanner;

public class ReverseAnArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int i = 0;
		int j = arr.length-1;
		while(i < j) {
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			i++;
			j--;
		}
		for(int a : arr) {
			System.out.print(a+" ");
		}
	}
}
