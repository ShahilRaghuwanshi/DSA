package Introduction_To_Arrays;

import java.util.Scanner;

public class FirstAndLastIndex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int low  = 0;
		int high = arr.length - 1;
		
		int data = sc.nextInt();
		int fi = -1; // first index
		while(low <= high) {
			int mid = (low+high) / 2;
			
			if(data < arr[mid]) {
				high = mid - 1;
			}
			else if(data > arr[mid]) {
				low = mid + 1;
			}
			else {
				fi = mid;
				high  = mid - 1;
			}
		}
		System.out.println(fi);
		
		 low  = 0;
		 high = arr.length - 1;
		
		int li = -1; // last index
		while(low <= high) {
			int mid = (low+high) / 2;
			
			if(data < arr[mid]) {
				high = mid - 1;
			}
			else if(data > arr[mid]) {
				low = mid + 1;
			}
			else {
				li = mid;
				low  = mid + 1;
			}
		}
		System.out.println(li);
	}
}
