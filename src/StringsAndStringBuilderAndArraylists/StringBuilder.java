package StringsAndStringBuilderAndArraylists;

public class StringBuilder {
	public static void main(String[] args) {
		int n = 10000;
		String s = "";
		long start = System.currentTimeMillis();
		for(int i = 0; i < n; i++) {
			s += i;
		}
		long end = System.currentTimeMillis();
		long duration = end - start;
		System.out.println(duration);
	}
}
