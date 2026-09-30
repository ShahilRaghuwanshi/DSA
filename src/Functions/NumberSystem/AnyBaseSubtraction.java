package Functions.NumberSystem;

import java.util.Scanner;

public class AnyBaseSubtraction {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int b = sc.nextInt();
	int n1 = sc.nextInt();
	int n2 = sc.nextInt();
	
	int d = getSubtraction(b, n1, n2);
}

public static int getSubtraction(int b, int n1, int n2) {
	int rv = 0;
	int c = 0;
	int p = 1;
	
	while(n2 > 0) {
		int d1 = n1 % 10;
		int d2 = n2 % 10;
		
		n1 = n1 / 10;
		n2 = n2 / 10;
		
		int d = n2 - n1 + c;
		c = d / b;
		b = b / 8;
		
	}
	return rv;
	
}
}
