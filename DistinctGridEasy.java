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
		int start1 = 0;
		while(start<grid.length){
			HashSet<Integer> row = new HashSet<>();
			for (int j = start; j < start+n; j++) row.add(grid[j]);
			if (row.size()!=k) return "Bad";
			start+=n;
		}
		while(start1<n){
			HashSet<Integer> column = new HashSet<>();
			for (int i = start1; i < grid.length; i+=start1) column.add(grid[i]);
			start1++;
			if (column.size()!=k) return "Bad";
		}
		return "Good";
	}
}
