package gettingstarted;

import java.util.Scanner;

public class PythaGoreanTriplets {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	
	boolean d=false;
	if(a>b&&a>c) {
		if(a*a==b*b+c*c) d=true;
	}else if(b>a&&b>c) {
		if(b*b==a*a+c*c) d= true;
	}else {
		if(c*c==a*a+b*b) d= true;
	}
	System.out.println(d);
}
}
