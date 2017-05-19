package TopCoder;

import java.util.Arrays;

public class UnsortedSequence {

	public static void main(String[] args) {
		int[] s = {1, 2, 3, 3, 3, 3}	
;
		int[] res = getUnsorted(s);
		for (int i : res) System.out.print(i+ " ");
	}

	public static int[] getUnsorted(int[] s) {
		Arrays.sort(s);
		int []ret = {};
		boolean flag = true;
		int first = s[0];
		for(int i = 1; i < s.length && flag; i++)
		  if (s[i] != first) flag = false;
		if (flag) 
			return ret;
		for (int i = s.length-1; i >0;) {
			int current = s[i];
			int prev = s[--i];
			if (current != prev) {
				int temp = current;
				s[i+1] = prev;
				s[i] = temp;
				break;
			}
		}
		return s;
	}
}