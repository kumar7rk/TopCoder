package TopCoder;

import java.util.Arrays;
import java.util.HashSet;

public class AnagramFree {

	public static void main(String[] args) {

		String []S = {"creation","sentence","reaction","sneak","star","rats","snake"};
		int res = getMaximumSubset(S);
		System.out.println(res);
	}

	public static int getMaximumSubset(String[] S) {
		HashSet<String> hashSet = new HashSet<>();
		for (String s : S) {
			char c[] = s.toCharArray();
			Arrays.sort(c);
			String s1 = new String(c);
			hashSet.add(s1);
		}
		return hashSet.size();
	}
}
