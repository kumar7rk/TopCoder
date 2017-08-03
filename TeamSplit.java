package TopCoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TeamSplit {

	public static void main(String[] args) {
		int[] strengths = 	
			{824, 581,   9, 776, 149, 493, 531, 558, 995, 637,
					 394, 526, 986, 548, 344, 509, 319,  37, 790, 491,
					 479,  34, 776, 321, 258, 851, 711, 365, 763, 355,
					 386, 877, 596,  96, 151, 166, 558, 109, 874, 959,
					 845, 181, 976, 335, 930,  22,  78, 120, 907, 584};
		int res = difference(strengths);
		System.out.println(res);

	}	

	public static int difference(int[] strengths) {
		Arrays.sort(strengths);
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i < strengths.length; i++) arrayList.add(strengths[i]);
		Collections.reverse(arrayList);
		int first = 0;
		int second = 0;
		for (int i = 0; i < arrayList.size(); i++) {
			if (i%2!=0) first+=arrayList.get(i);
			else second +=arrayList.get(i);
			
		}
		return Math.abs(first-second);
	}

}
