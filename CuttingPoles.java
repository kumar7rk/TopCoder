package TopCoder;

import java.util.Arrays;

public class CuttingPoles {

	public static void main(String[] args) {
		int[]poles = {10,10,10,10,10,10,10,18};
		int res = countCuts(poles);
		System.out.println(res);
	}

	public static int countCuts(int[] poles) {
		int res = 0;
		int sum = 0;
		for (Integer integer : poles) sum+=integer;
		int average = sum/poles.length;
		while (true) {
			Arrays.sort(poles);
			
			if (poles[poles.length-1]==average) return res;
			int diff = poles[poles.length-1]-average;
			poles[poles.length-1] = average;
			poles[0]+= diff;
			
			res++;
		}
	}
}
