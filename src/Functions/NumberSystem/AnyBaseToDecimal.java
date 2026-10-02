package Functions.NumberSystem;

import java.util.Scanner;

public class AnyBaseToDecimal {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	int b=sc.nextInt();
	
	anyBaseToDecimal(n, b);
}
	public static void anyBaseToDecimal(int n, int b){
		int rev = 0;
		int place = 1;
		while(n > 0) {
			int rem = n % b;
			n = n / b;
			rev += rem * place;
			place = place * 10;
		}
		System.out.println(rev);
	}
}
