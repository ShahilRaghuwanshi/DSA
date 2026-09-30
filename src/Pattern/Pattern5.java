package Pattern;

import java.util.Scanner;

public class Pattern5 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if(j==3||i==3 || (i==2&&j==2||j==4&&i==2||i==4&&j==2||i==4&&j==4) ) {
				System.out.print("*");
			}
			else System.out.print(" ");
		}
		System.out.println();
	}
}
}
