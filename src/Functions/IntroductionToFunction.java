package Functions;

import java.util.Scanner;

public class IntroductionToFunction {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n = sc.nextInt();
	int r = sc.nextInt();
	int ncrFact=1;
	int nmrFact=1;
	for(int i=1;i<=n;i++) {
		ncrFact *= i;
	}
	for(int i=1;i<=n-r;i++) {
		nmrFact*=i;
	}
	int npr=ncrFact/nmrFact;
	System.out.println(n+"p"+r+"="+npr);
}
}
