package TopCoder;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CuttingPoles {

	public static void main(String[] args) {
		int[]poles = {10,10,10,10,10,10,10,18};
		int res = countCuts(poles);
		System.out.println(res);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static int countCuts(int[] poles) {
		int res = 0;
		int sum = 0;
		for (Integer integer : poles) sum+=integer;
		int average = sum/poles.length;
		Integer[] pole = new Integer[poles.length];
		for (int i = 0; i < pole.length; i++) pole[i] = poles[i];
		while (true) {
			Arrays.sort(pole);
			
			Set<Integer> set = new HashSet(Arrays.asList(pole));
			if (set.size()==1) return res;
			
			int diff = pole[pole.length-1]-average;
			pole[pole.length-1] = average;
			pole[0]+= diff;
			
			res++;
		}
//		return res;
	}

}
