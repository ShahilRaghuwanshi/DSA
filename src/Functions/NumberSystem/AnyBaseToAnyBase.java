package Functions.NumberSystem;

import java.util.Scanner;

public class AnyBaseToAnyBase {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int b1 = sc.nextInt();
	int b2 = sc.nextInt();
	
	int dec = anyBaseToDecimal(n, b1);
	int res = decimalToAnyBase(dec, b2);
	System.out.println(res);
}
public static int anyBaseToDecimal(int n, int b1) {
	int res = 0;
	int p = 1;
	while(n > 0) {
		int rem = n % 10;
		n = n / 10;
		
		res += rem * p;
		p *= b1;
	}
	return res;
}
public static int decimalToAnyBase(int n, int b2) {
	int res = 0;
	int p = 1;
	while(n > 0) {
		int rem = n % b2;
		n = n / b2;
		
		res += rem * p;
		p *= 10;
	}
	return res;
}
}
