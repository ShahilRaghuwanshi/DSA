package RecursionLevel1;
import java.util.*;

public class PrintMazePathsWithJump {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		printMazePathWithJumps(1, 1, n, m, "");
	}
	
	// sr - source row
	// sc - source column
	// dr - destination row
	// dc - destination column
	public static void printMazePathWithJumps(int sr, int sc, int dr, int dc, String psf) {
		//base case
		if(sr == dr && sc == dc) {
			System.out.println(psf);
			return;
		}
		
		for(int ms = 1; ms <= dc - sc; ms++) {
			printMazePathWithJumps(sr, sc + ms, dr, dc, psf + "h" + ms);
		}
		
		for(int ms = 1; ms <= dr - sr; ms++) {
			printMazePathWithJumps(sr + ms, sc, dr, dc, psf + "v" + ms);
		}
		
		for(int ms = 1; ms <= dr - sr && ms <= dc - sc; ms++) {
			printMazePathWithJumps(sr + ms, sc + ms, dr, dc, psf + "d" + ms);
		}
	}
}
