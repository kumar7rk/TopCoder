package TopCoder;

import java.util.HashSet;

public class TwoDogsOnATree {

	public static void main(String[] args) {
		int[] parent = 
			{0, 0, 0, 0}
		;
		int[] w = 
			{1, 2, 4, 8}
		;
		int res = maximalXorSum(parent,w);
		System.out.println(res);
	}
	public static int maximalXorSum(int[] parent, int[] w) {
		HashSet<Integer> hashSet = new HashSet<>();
		for (Integer i : parent) hashSet.add(i);
		for (Integer i : w) hashSet.add(i);
		int vertices = hashSet.size();
		int edges = w.length;
		
		return 0;
	}

}	