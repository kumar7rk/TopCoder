package TopCoder;

import java.util.Arrays;

public class PeacefulLine {

	public static void main(String[] args) {
		int[]x = {3,3,3,3,13,13,13,13,3};
		String res = makeLine(x);
		System.out.println(res);
	}

	public static String makeLine(int[] x) {
		int length = x.length/2;
		Arrays.sort(x);
		int []count = new int[25];
		for (int i = 0; i < x.length; i++)
			count[x[i]-1]++;
		for (int i : count)
			if ((x.length%2!=0 && i>length+1) || (x.length%2==0 && i>length)) return "impossible";
		return "possible";
	}

}
