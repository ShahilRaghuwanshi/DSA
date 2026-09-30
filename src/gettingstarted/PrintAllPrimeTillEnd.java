package gettingstarted;
import java.util.*;

public class PrintAllPrimeTillEnd {
	public static void isPrime(int num) {
		if(num==0||num==1) System.err.println("not prime");
		else if(num==2) System.out.println("prime");
		else {
			for(int i=2;i*i<=num;i++) {
				if(num%i==0) {
					System.out.println("not prime"+num);
					return;
				}
			}
			System.out.println("prime"+num);
			
		}
	}
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int low=scan.nextInt();
	int high=scan.nextInt();
	
	for(int i=low;i<=high;i++) {
		isPrime(i);
	}
}
}
