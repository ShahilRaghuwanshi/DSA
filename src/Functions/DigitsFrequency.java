package Functions;

import java.util.Scanner;

public class DigitsFrequency {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int num = sc.nextInt();
	int d = sc.nextInt();
	int f=countDigitFrequency(num, d);
	System.out.println(f);
}
public static int countDigitFrequency(int num, int d) {
	int cnt=0;
	while(num>0) {
		int rem = num%10;
		num/=10;
		if(rem==d) {
			cnt++;		}
	}
	return cnt;
}
}
