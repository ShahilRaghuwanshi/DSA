package StringsAndStringBuilderAndArraylists;
import java.util.*;

public class StringCompression {
	
		public static String comparision1(String str) {
			
			String s = str.charAt(0) + "";
			
			for(int i = 0; i < str.length(); i++) {
				char curr = str.charAt(i);
				char prev = str.charAt(i - 1);
				
				if(curr != prev) {
					s += curr;
				}
			}
			return s;
	}
		
		public static String comparision2(String str) {
			
				String s = str.charAt(0) + "";
				int cnt = 1;
				for(int i = 0; i < str.length(); i++) {
					char curr = str.charAt(i);
					char prev = str.charAt(i - 1);
				
					if(curr == prev) {
						cnt++;
					}else {
						if(cnt > 1) {
							s += cnt;
							cnt = 1;
						}
						s += curr;
					}
				}
				if(cnt > 1) {
					s += cnt;
					cnt = 1;
				}
				
				return s;
		}
}
