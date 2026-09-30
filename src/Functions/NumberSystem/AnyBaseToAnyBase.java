package Functions.NumberSystem;

import java.util.Scanner;

public class AnyBaseToAnyBase {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n = sc.nextInt();
	int b1= sc.nextInt();
	int b2= sc.nextInt();
	
	int d=anyBaseToAnyBase(n, b1, b2);
	System.out.println(d);
	
}
public static int anyBaseToAnyBase(int n, int b1, int b2) {
	int rv=0;
	int p=1;
	while(n>0) {
		int rem=n%b2;
		n/=b2;
		rv = rv + rem*p;
		p=p*b1;
	}
	return rv;
 }
}
