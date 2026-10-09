package StringsAndStringBuilderAndArraylists;

import java.util.Scanner;

public class PrintAllpalndromeSubstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		for(int i = 0; i < s.length(); i++) {
			for(int j = i + 1; j <= s.length(); j++) {
				String ss = s.substring(i, j);
				if(isPalindrome(ss) == true) {
					System.out.println(ss);
				}
			}
		}
	}
	public static boolean isPalindrome(String s) {
		
		int i = 0;
		int j = s.length() - 1; 
		
		while(i <= j) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
