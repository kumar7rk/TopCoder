package TopCoder;

import java.util.Arrays;

public class OnLineRank {

	public static void main(String[] args) {
		int k = 21;
		int[]scores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1;
		int res = calcRanks(k,scores);
		System.out.println(res);
	}
	public static int calcRanks(int k, int[] scores){
		int res = 0;
		for (int i = scores.length-1; i >=0; i--) {
			int[] temp = new int[k+1];
			int count = 0;
			temp[count++] = scores[i];
			if (k>scores.length) k = scores.length-1;
			if (i<k) k = i;
			for (int j = i-k; j <i; j++) temp[count++] = scores[j];
			Arrays.sort(temp);
			res+=rank(scores[i],temp);
		}
		return res;
	}
	private static int rank(int val, int[] temp) {
		int res = 0;
		for (int i = 0; i<=temp.length-1; i++) 
			if (temp[i]==val) res = temp.length-i; 
		return res;
	}
}