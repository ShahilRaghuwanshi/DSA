package Pattern;

import java.util.Scanner;

public class Pattern12 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int num1=0;
		int num2=1;
	
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				int feb=num1+num2;
				num1=num2;
				num2=feb;
				System.out.print(num1+"\t");
			}
			System.out.println();
		}
		
	}
}
