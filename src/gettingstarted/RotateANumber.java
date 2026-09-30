package gettingstarted;

import java.util.Scanner;

public class RotateANumber {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n = sc.nextInt();
	int k=sc.nextInt();
	
	int nod=0;
	int temp=n;
	while(temp>0) {
		temp/=10;
		nod++;
	}
	
	if(k<0) k=k+nod;
	k=k%nod;
	
	int mul=1;
	int div=1;
	for(int i=1;i<=nod;i++) {
		if(i<=k) div*=10;
		else mul*=10;
	}
	
	int q=n/div;
	int rem=n%div;
	
	int rot=rem*mul+q;
	System.out.println(rot);
}
}
