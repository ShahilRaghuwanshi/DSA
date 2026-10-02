package Introduction_To_Arrays;

import java.util.Scanner;

public class SubtractionOfTwoArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int[] a1 = new int[n1];
		for(int i = 0; i < a1.length; i++) {
			a1[i] = sc.nextInt();
		}
		
		int n2 = sc.nextInt();
		int[] a2 = new int[n2];
		for(int i = 0; i < a2.length; i++) {
			a2[i] = sc.nextInt();
		}
		
		int[] sub = new int[n1>n2?n1:n2];
		
		int i = a1.length-1;
		int j = a2.length-1;
		int k = sub.length-1;
		
		int c = 0;
		while(k >= 0) {
			int d = 0;
			
			if(j >= 0) {
				d += a2[j]+c;
			}
			int a1v = i >= 0? a1[i] : 0;
			if(i >= 0) {
				if(d >= a1v) {
					d -= a1v;
					c = 0;
				}
				else {
					d += 10;
					c = -1;
					d -= a1v;
				}
			}
			
			sub[k] = d;
			i--;
			j--;
			k--;
		}
		int idx=0;
		while(idx < sub.length) {
			if(sub[idx] == 0) idx++;
			else break;
		}
		if(idx == sub.length) {
			System.out.print(0);
		} else {
		while(idx < sub.length) {
			System.out.print(sub[idx]+" ");
			idx++;
			}
		}
	}
}
