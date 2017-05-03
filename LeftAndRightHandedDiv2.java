package TopCoder;

public class LeftAndRightHandedDiv2 {

	public static void main(String[] args) {
		String s = "LLLLLLLLRRLRLRLLLRRLLLRLRRL";
		int res = count(s);
		System.out.println(res);
	}
	public static int count(String s) {
		int count = 0;
		int n = s.length();
		for (int i = 0; i < n;i++) {
			if (s.contains("RL")) {
				count++;
				int i1 = s.indexOf("RL");
				s = s.substring(i1+1);
			}
		}
		return count;
	}
}