package RecursionLevel1;

import java.util.Scanner;

public class PrintFactorial {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f = printFactorial(n);
		System.out.println(f);
	}
	
	public static int printFactorial(int n) {
		if(n == 1) return 1;
		int fnm1 = printFactorial(n - 1);
		int fn = n * fnm1;
		return fn;
	}
}
