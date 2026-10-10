	package StringsAndStringBuilderAndArraylists;
	
	import java.util.*;
	
	public class RemovePrimeNumberFromArrayList {
	
		public static void solution(ArrayList<Integer> list) {
			for(int i = list.size() - 1; i >= 0; i--) {
				int res = list.get(i);
				if(isPrime(res) == true) {
					list.remove(i);
				}
			}
		}
		
		public static boolean isPrime(int n) {
			if(n == 0 || n == 1) {
				return false;
			}
			else if(n == 2) {
				return true;
			}else {
				for(int i = 2; i * i <= n; i++) {
					if(n % i == 0) {
						return false;
					}
				}
			}
			return true;
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			ArrayList<Integer> list = new ArrayList<>();
			
			for(int i = 0; i < n; i++) {
				list.add(sc.nextInt());
			}
			
			solution(list);
			System.out.println(list);
		}
	}
