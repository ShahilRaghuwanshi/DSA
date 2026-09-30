package gettingstarted;

import java.util.Scanner;

public class FibonacciNumbers {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	int num1=0;
	int num2=1;
	if(num==num1) System.out.println(0);
	else if (num==num2) System.out.println(1);
	else {
		for(int i=3;i<=num;i++) {
			int feb = num1+num2;
			num1=num2;
			num2=feb;
			System.out.println(feb);
		}
	}
		}
}
