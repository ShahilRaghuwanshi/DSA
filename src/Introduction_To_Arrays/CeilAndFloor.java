package Introduction_To_Arrays;

import java.util.Scanner;

public class CeilAndFloor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int low = 0;
		int high = arr.length-1;
		int data = sc.nextInt();
		while(low <= high) {
			int mid = (low + high)/2;
			if(data < arr[mid]) {
				high = mid - 1;
			}else if(data > arr[mid]) {
				low = mid + 1;
			}else {
				if(data == arr[mid]) {
					System.out.println("ceil" + arr[mid]);
					System.out.println("floor" + arr[mid]);
				}
				
			}
		}
	}
}
