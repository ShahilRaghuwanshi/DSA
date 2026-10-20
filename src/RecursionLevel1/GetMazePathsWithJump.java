package RecursionLevel1;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePathsWithJump {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		ArrayList<String> paths = gatMezePaths(1, 1, n, m);
		System.out.println(paths);
	}
	
	public static ArrayList<String> gatMezePaths(int sr, int sc, int dr, int dc) {
		if(sr == dr && sc == dc) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
		}
		ArrayList<String> paths = new ArrayList<>();
		
		for(int ms = 1; ms <= dc - sc; ms++) {
			ArrayList<String> hpaths = gatMezePaths(sr, sc + ms, dr, dc);
			for(String hpath: hpaths) {
				paths.add("h" + ms + hpath);
			}
		}
		for(int ms = 1; ms <= dr - sr; ms++) {
			ArrayList<String> vpaths = gatMezePaths(sr + ms, sc, dr, dc);
			for(String vpath: vpaths) {
				paths.add("h" + ms + vpath);
			}
		}
		for(int ms = 1; ms <= dc - sc &&  ms <= dc - sc; ms++) {
			ArrayList<String> dpaths = gatMezePaths(sr + ms, sc + ms, dr, dc);
			for(String path: dpaths) {
				paths.add("h" + ms + dpath);
			}
		}
		return paths;
	}
}
