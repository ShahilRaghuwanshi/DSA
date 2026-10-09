package StringsAndStringBuilderAndArraylists;
import java.util.*;
public class StringVsBuilder {
	public static void main(String[] args) {
		int n = 10000;
		//using string
		String s = "";
		long start = System.currentTimeMillis();
		for(int i = 0; i < n; i++) {
			s += i;
		}
		long end = System.currentTimeMillis();
		long duration = end - start;
		System.out.println(duration);				//194
		
		//using StringBuilder
		StringBuilder sb = new StringBuilder();
		long start1 = System.currentTimeMillis();
		for(int i = 0; i < n; i++) {
			sb.append(i);
		}
		long end1 = System.currentTimeMillis();
		long duration1 = end1 - start1;
		System.out.println(duration1);				//3
	}
}
