package Functions.NumberSystem;

import java.util.Scanner;

public class DecimalToAnyBase {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int b = sc.nextInt();
	
	conversion(n, b);
}
public static void conversion(int n, int b) {
	int res = 0;
	int p = 1;
	while(n > 0) {
		int rem = n % 10;
		n  /= 10;
		res += rem * p;
		p *= b;
	}
	System.out.println(res);
}
}
