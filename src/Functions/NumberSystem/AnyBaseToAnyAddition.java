package Functions.NumberSystem;

import java.util.Scanner;

public class AnyBaseToAnyAddition {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int b = sc.nextInt();
	int n1 = sc.nextInt();
	int n2 = sc.nextInt();
	
	int sum = getSum(b, n1, n2);
	System.out.println(sum);
}
public static int getSum(int b, int n1, int n2) {
	int res = 0;
	int p = 1;
	int carry = 0;
	while(n1 > 0 || n2 > 0 || carry > 0) {
		
		int rem1 = n1 % 10;
		int rem2 = n2 % 10;
		
		n1 = n1 / 10;
		n2 = n2 / 10;
		
		int rem = rem1 + rem2 + carry;
		
		carry = rem / b;
		rem = rem % b;
		
		res += rem * p;
		p = p * 10;
	}
	return res;
}
}
