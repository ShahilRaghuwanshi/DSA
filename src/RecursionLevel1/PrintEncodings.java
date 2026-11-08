package RecursionLevel1;

import java.util.Scanner;

public class PrintEncodings {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		printEncodings(str, "");
	}
	
	public static void printEncodings(String ques, String asf) {
		
		if(ques.length() == 0) {
			System.out.println(asf);
			return;
		}
		
		else if(ques.length() == 1) {
			char ch = ques.charAt(0);
			if(ch == 0) {
				return;
			}
			else {
				int chv = ch - '0';
				char code = (char)('a' + chv - 1);
				System.out.println(asf + code);
			}
		}
		else {
			char ch = ques.charAt(0);
			String roq = ques.substring(1);
			
			if(ch == '0') {
				return;
			}else {
				int chv = ch - '0';
				char code = (char)('a' + chv - 1);
				printEncodings(roq, asf + code);
			}
			
			String ch12 = ques.substring(0, 2);
			String roq12 = ques.substring(2);
		
			int chv12 = Integer.parseInt(ch12);
			if(chv12 <= 26) {
				char code = (char)('a' + chv12 - 1);
				printEncodings(roq12, asf + code);
			}
		}
	}
}
