package RecursionLevel1;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePathsWithJump {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		ArrayList<String> paths = getMazePaths(1, 1, n, m);
		System.out.println(paths);
	}
	
	public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
		if(sr == dr && sc == dc) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
		}
		
		ArrayList<String> paths = new ArrayList<>();
		
		// Horizontal moves
		for(int ms = 1; ms <= dc - sc; ms++) {
			ArrayList<String> hpaths = getMazePaths(sr, sc + ms, dr, dc);
			for(String hpath: hpaths) {
				paths.add("h" + ms + hpath);
			}
		}
		
		// Vertical moves
		for(int ms = 1; ms <= dr - sr; ms++) {
			ArrayList<String> vpaths = getMazePaths(sr + ms, sc, dr, dc);
			for(String vpath: vpaths) {
				paths.add("v" + ms + vpath); // Fixed: changed "h" to "v"
			}
		}
		
		// Diagonal moves
		for(int ms = 1; ms <= dr - sr && ms <= dc - sc; ms++) { // Fixed: checks both dr and dc bounds
			ArrayList<String> dpaths = getMazePaths(sr + ms, sc + ms, dr, dc);
			for(String dpath: dpaths) {
				paths.add("d" + ms + dpath); // Fixed: changed "h" to "d"
			}
		}
		
		return paths;
	}
}