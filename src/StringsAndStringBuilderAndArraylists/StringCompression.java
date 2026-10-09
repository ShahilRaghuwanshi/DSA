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
		
		StringBuilder sb1 = new StringBuilder();
		char ch1 = s.charAt(0);
		sb.append(ch);
		int cnt = 1;
		for(int i = 1; i < s.length(); i++) {
			if(ch != s.charAt(i)) {
				sb1.append(s.charAt(i));
				sb1.append(cnt);
				ch = s.charAt(i);
				cnt = 1;
			}else {
				cnt++;
			}
		}
		System.out.println(sb1);
	}
}
