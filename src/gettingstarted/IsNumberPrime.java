package gettingstarted;
import java.util.*;
public class IsNumberPrime {
	public static void isPrime(int num) {
		int count=0;
		if(num ==0||num==1) {
			System.out.println("Not Prime");
		}else if(num==2) {
			System.out.println("Prime");
		}else {
			 
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					System.out.println("Not Prime"+num);
					return;
				}
			}
			System.out.println("prime"+num);
		}
	}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int t = scan.nextInt();
	while(t>0) {
		int number=scan.nextInt();
		isPrime(number);
		t--;
		
	}
}
}
