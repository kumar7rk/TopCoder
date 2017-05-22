package TopCoder;

public class TwoWaysSorting {
	public static void main(String[] args) {
		String[] stringList = {"abcdef", "bcdef", "cdef", "def", "ef", "f", "topcoder"};
		String res = sortingMethod(stringList);
		System.out.println(res);
	}

	public static String sortingMethod(String[] stringList) {
		boolean lexo = true;
		boolean length = true;
		for (int i = 0; i < stringList.length-1; i++) {
			String s1 = stringList[i];
			String s2 = stringList[i+1];
			if (s1.compareTo(s2)>0) {
				lexo=false;
				break;
			}
		}
		for (int i = 0; i < stringList.length-1; i++) {
			String s1 = stringList[i];
			String s2 = stringList[i+1];
			if (s1.length()>s2.length()) {
				length=false;
				break;
			}
		}
		if (lexo&&length) return "both";
		if (lexo) return "lexicographically";
		if (lexo&&length) return "lengths";
		return "none";
	}
}
