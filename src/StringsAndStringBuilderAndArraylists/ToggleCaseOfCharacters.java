package StringsAndStringBuilderAndArraylists;

import java.util.Scanner;

public class ToggleCaseOfCharacters {
	public static String toggleCase(String s) {
		
		StringBuilder sb = new StringBuilder(s);
		
		for(int i = 0; i < s.length(); i++) {
			char ch = sb.charAt(i);
			
			if(ch >= 'a' && ch <= 'z') {
				char uch = (char)('A' + ch - 'a');
				sb.setCharAt(i, uch);
			}else if(ch >= 'A' && ch <= 'Z') {
				char lch = (char)('a' + ch - 'A');
				sb.setCharAt(i,  lch);
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ans = toggleCase(s);
		System.out.println(ans);
	}
}
