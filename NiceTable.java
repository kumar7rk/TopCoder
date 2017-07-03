package TopCoder;

public class NiceTable {

	public static void main(String[] args) {
		String []t = 
			{"001", "000", "001"}
		;
		String res = isNice(t);
		System.out.println(res);
	}

	public static String isNice(String[] t) {
		for (int i = 0; i < t.length-1; i++) {
			int count = 0;
			for (int j = 0; j < t[0].length(); j++) 
				count+=t[i].charAt(j)==t[i+1].charAt(j)?1:0;
			if (count>0&&count<t[0].length()) return "Not nice";
		}
		return "Nice";
	}
}
