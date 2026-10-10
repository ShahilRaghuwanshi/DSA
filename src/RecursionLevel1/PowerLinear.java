package RecursionLevel1;

import java.util.Scanner;

public class PowerLinear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int p = power(x, n);
		System.out.println(p);
	}
	
	public static int power(int x, int n) {
		if(n == 0) return 1;
		int fnm1 = power(x, n - 1);
		int p = x * fnm1;
		return p;
	}
}
