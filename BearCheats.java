package TopCoder;

public class BearCheats {

	public static void main(String[] args) {
		int A = 508;
		int B = 540;
		String res = eyesight(A, B);
		System.out.println(res);
	}
	public static String eyesight(int a, int b) {

		String s1 = new String(a+"");
		String s2 = new String(b+"");
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);
			if (c1!=c2) count++;
			if (count>1) return "glasses";
		}
		return "happy";
	}

}
