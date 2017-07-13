package TopCoder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RelativeHeights {

	public static void main(String[] args) {
		int[] h = {4,2,1,3};
		int res = countWays(h);
		System.out.println(res);
	}

	public static int countWays(int[] h) {
		Set<List<Integer>> set = new HashSet<>();
		for (int i = 0; i < h.length; i++) {
			List<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j < h.length; j++) {
				if (i==j) continue;
				int pos = 0;
				for (int k = 0; k < h.length; k++) {
					if (i==k||k==j) continue;
					if (h[k]>h[j]) {
						pos++;
					}
				}
				list.add(pos);
			}
			set.add(list);
		}
		return set.size();
	}
}