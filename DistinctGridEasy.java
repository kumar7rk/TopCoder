package TopCoder;

import java.util.HashSet;

public class DistinctGridEasy {

	public static void main(String[] args) {
		int n = 5;
		int k = 3;
		int[] grid = 
				{ 2,2,0,0,1, 0,1,2,2,0, 0,2,1,0,0, 1,0,0,0,2, 0,0,2,1,0 }
		;
		String res = checkGrid(n,k,grid);
		System.out.println(res);

	}

	public static String checkGrid(int n, int k, int[] grid) {
		int start = 0;
		while(start<grid.length){
			HashSet<Integer> count = new HashSet<>();
			for (int j = start; j < start+n; j++) {
				count.add(grid[j]);
			}
			if (count.size()!=k) {
				return "Bad";
			}
			start+=n;
		}
		return "Good";
	}
}
