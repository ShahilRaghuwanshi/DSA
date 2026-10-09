package StringsAndStringBuilderAndArraylists;
import java.util.*;

public class StringCompression {
	public static void main(String[] args) {
		String s = "aaabbcccddaeef";
		StringBuilder sb = new StringBuilder();
		
		char ch = s.charAt(0);
		sb.append(ch);
		for(int i = 1; i < s.length(); i++) {
			if(ch != s.charAt(i)) {
				sb.append(s.charAt(i));
				ch = s.charAt(i);
			}
		}
		System.out.println(sb);
		
		String s1 = "aaabbcccddaeef";
		StringBuilder sb1 = new StringBuilder();
		char ch1 = s1.charAt(0);
		sb1.append(ch1);
		int cnt = 1;
		for(int i = 1; i < s1.length(); i++) {
			if(ch1 != s.charAt(i)) {
				if(cnt > 1) sb1.append(cnt);
				sb1.append(s1.charAt(i));
				ch1 = s.charAt(i);
				cnt = 1;
			}else {
				cnt++;
			}
		}
		System.out.println(sb1);
	}
}
