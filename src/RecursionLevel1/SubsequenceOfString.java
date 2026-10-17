package RecursionLevel1;

import java.util.*;
import java.util.Scanner;

public class SubsequenceOfString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		ArrayList<String> list = gss(str);
	}
	
	public static ArrayList<String> gss(String str){
		if(str.length() == 0) {
			ArrayList<String> list = new ArrayList<>();
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rres = gss(ros);
		
		ArrayList<String> mres = new ArrayList<>();
		
	}
}
