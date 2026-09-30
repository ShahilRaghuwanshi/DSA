package Functions.NumberSystem;

import java.util.Scanner;

public class DecimalToAnyBase {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n= sc.nextInt();
	int b = sc.nextInt();
	
	conversion(n, b);
}
public static void conversion(int n, int b) {
	int oct = 0;
	int p=0;
	while(n>0) {
		int rem = n%b;
		n/=b;
		oct += (int)(rem*(Math.pow(10, p)));
		p++;
	}
	System.out.println(oct);
}
}
