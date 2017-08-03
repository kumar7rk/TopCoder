package TopCoder;

import java.util.Arrays;

public class Istr {

	public static void main(String[] args) {
		String s = "jeonkhmoibnkojlionoijlhdcgoooollnfomomlnojigjgmebo";
		int k = 21;
		int result = count(s,k);
		System.out.println(result);
	}

	public static int count(String s, int k){
		int[]frequency = new int[26];
		int totalChar = 0;
		int count = 0;
		int res = 0;
		for (char c : s.toCharArray()) frequency[c-'a']++;
		for (int i = 0; i < frequency.length; i++) if (frequency[i]!=0) totalChar++;
		int[] occ = new int[totalChar];
		for (int i = 0; i < frequency.length; i++) if (frequency[i]!=0) occ[count++] = frequency[i];
		Arrays.sort(occ);
		while (k>0) {
			occ[occ.length-1] = --occ[occ.length-1];
			Arrays.sort(occ);
			k--;
		}
		for (int i : occ) res+=i*i;
		return res;
	}
}