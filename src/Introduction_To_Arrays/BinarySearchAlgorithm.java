package Introduction_To_Arrays;

import java.util.Scanner;

public class BinarySearchAlgorithm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int data = sc.nextInt();
		int low = 0;
		int high = arr.length-1;
		
		for(int i = 0; i < arr.length; i++) {
			int mid  = (low+high)/2;
			if(data < arr[mid]) {
				high = mid - 1;
			}else if(data > arr[mid]) {
				low = mid + 1;
			}
			else {
				System.out.println(mid);
				return;
			}
		}
		System.out.println(-1);
	}
}
