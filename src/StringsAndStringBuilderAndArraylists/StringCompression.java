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
	}
}
