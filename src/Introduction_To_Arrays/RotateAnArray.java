package Introduction_To_Arrays;

import java.util.Scanner;

public class RotateAnArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println();
		
		int k = sc.nextInt();
		if(k >= 0) {
			k = k % n;
		}
		else {
			int p = (k % n);
			k = n + p;
		}
		
		int[] arr2 = new int[n];
		
		int j = 0;
		int i = arr1.length - k;
		while(k > 0) {
		arr2[j] = arr1[i];
		i++;
		j++;
		k--;
		}
		i = 0;
		while(j < arr1.length) {
			arr2[j] = arr1[i];
			j++;
			i++;
		}
		
		for(int l = 0; l < arr2.length; l++) {
			System.out.print(arr2[l]+" ");
		}
	} 
}
