package StringsAndStringBuilderAndArraylists;
import java.util.*;

public class StringCompression {
	
		public static String compression1(String str) {
			
			String s = str.charAt(0) + "";
			
			for(int i = 1; i < str.length(); i++) {
				char curr = str.charAt(i);
				char prev = str.charAt(i - 1);
				
				if(curr != prev) {
					s += curr;
				}
			}
			return s;
	}
		
		public static String compression2(String str) {
			
				String s = str.charAt(0) + "";
				int cnt = 1;
				for(int i = 1; i < str.length(); i++) {
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
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String str = sc.next();
			System.out.println(compression1(str));
			System.out.println(compression2(str));

		}
}
