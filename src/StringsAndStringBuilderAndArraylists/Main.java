package StringsAndStringBuilderAndArraylists;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//String s1 = "hello";
		//System.out.println(s1);
		
		/*
		String s1 = sc.next();				//abc
		String s2 = sc.next();				//def
		System.out.println(s1);
		System.out.println(s2);
		*/
		
		/*
		String s1 = sc.nextLine();
		String s2 = sc.next();
		System.out.println(s1);
		System.out.println(s2);				//not in eclipse but this will give an error in normal console 
		*/
		
		/*
		 * //length() 
		 * String s1 = sc.nextLine(); 
		 * System.out.println(s1);					//abc
		 * System.out.println(s1.length());			//3
		 * 
		 * //char 
		 * for(int i = 0; i < s1.length(); i++) 
		 * { 
		 * char ch = s1.charAt(i);
		 * System.out.println(ch); 
		 * }
		 * 
		 * //set char
		 * //s1.charAt(0) = 's'; 					//Won't work
		 */		
		
	/*	//substring()
		String s = "abcd";
		System.out.println(s.substring(1, 3));		//bc
		System.out.println(s.substring(0, 1));		//a	
		System.out.println(s.substring(0, 2));		//ab
		System.out.println(s.substring(1, 1));		//
		System.out.println(s.substring(3, 2));		//Exception
		
	*/
	/*
	 * //sari sustrings print krni hai 
	 * String s = "abcd";
	 *  for(int i = 0; i < s.length(); i++) 
	 *  { 
	 *  for(int j = i + 1; j <= s.length(); j++) 
	 *  {
	 * System.out.println(s.substring(i, j)); 
	 *  }
	 * }
	 */
		
	//do String add kaise hoti hai
		String s1 = "hello";
		String s2 = "world";
		String s3 = s1 + " " + s2;
		System.out.println(s3);
	}
}
