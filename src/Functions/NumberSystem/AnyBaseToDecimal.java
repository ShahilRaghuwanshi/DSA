package Functions.NumberSystem;

import java.util.Scanner;

public class AnyBaseToDecimal {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	int b=sc.nextInt();
	
	anyBaseToDecimal(n, b);
}
	public static void anyBaseToDecimal(int n, int b){
		int rev=0;
		int place=1;
		while(n>0) {
			int rem=n%10;
			n=n/10;
			rev=rev+rem*place;
			if(b==2) place*=2;
			if(b==8) place*=8;
		}
		System.out.println(rev);
	}
}
