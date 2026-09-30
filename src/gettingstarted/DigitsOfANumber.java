package gettingstarted;

import java.util.Scanner;

public class DigitsOfANumber {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	int digits=0;
	int temp=num;
	while(num>0) {
		num=num/10;
		digits++;
	}
	System.out.println(digits);
	int div=(int)Math.pow(10, digits-1);
	while(div!=0) {
		int q=temp/div;
		System.out.println(q);
		
		temp=temp%div;
		div=div/10;
	}
}
}
