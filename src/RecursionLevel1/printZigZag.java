package RecursionLevel1;

import java.util.Scanner;

public class printZigZag {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printZigZag(n);
	}
	
	public static void printZigZag(int n) {
		if(n == 0) {
			return;
		}
		System.out.println(n);
		printZigZag(n - 1);
		System.out.println(n);
		printZigZag(n - 1);
		System.out.println(n);
	}
}
