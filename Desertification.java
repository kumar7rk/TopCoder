package TopCoder;

import icsV1dot1.Time;

public class Desertification {

	public static void main(String[] args) {
		String[] island =
			{"DDDDDDDDD", "DDDDDDDDD", "DDDDDDDDD", "DDDDDDDDD", "DDDDDDDDD", "DDDDDDDDD", "DDDDDDDDD", "DDDDDDDDD", "DDDDDDDDD"}
		;
		int T = 999999999;
		Time.startTime();
		int res = desertArea(island, T);
		Time.endTime();
		System.out.println(res);
	}
	
	public static int desertArea(String[] island, int t) {

		int n = island.length;
		int n1 = island[0].length();
		int tempCount = 0;
		String []new_island = new String[n];
		int count = 0;
		
		for (int i = 0; i < n; i++) 
			for (int j = 0; j < n1; j++) 
				if (island[i].charAt(j)=='D') tempCount++;
		
		if (tempCount == 0) return 0;
		if (t >= n*n1 && tempCount>0) return n*n1;
		if ((n*n1)/2 < tempCount) 
			return n*n1;
		
		for (int year = 0; year < t; year++) {
			for (int i = 0; i < n; i++) {
				StringBuilder builder = new StringBuilder(island[i]);
				for (int j = 0; j < n1; j++) {
					char c = island[i].charAt(j);
					if (c=='F') {
						int new_i_minus = i-1;
						int new_j_minus = j-1;
						int new_i_plus = i+1;
						int new_j_plus = j+1;
						
						if (i==0) new_i_minus = i;
						if (j==0) new_j_minus = j;
						if (i==n-1) new_i_plus = i;
						if (j==n1-1) new_j_plus = j;
						
						if (island[i].charAt(new_j_minus) == 'D'||
								island[i].charAt(new_j_plus) == 'D'||
								island[new_i_minus].charAt(j)== 'D' ||
								island[new_i_plus].charAt(j) == 'D') builder.setCharAt(j, 'D');
					}
				}
				new_island[i] = builder+"";
			}
			for (int i = 0; i < new_island.length; i++) {
				island[i] = new_island[i];
			}
		}
		for (int i = 0; i < n; i++) 
			for (int j = 0; j < n1; j++) 
				if (island[i].charAt(j)=='D') count++;
		return count;
	}
}