package gettingstarted;

import java.util.Scanner;

public class ReverseANumber {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n=scan.nextInt();
	while(n>0) {
		int rem=n%10;
		System.out.println(rem);
		n=n/10;
	}
}
}
