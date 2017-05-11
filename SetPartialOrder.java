package TopCoder;

import icsV1dot1.Time;

public class SetPartialOrder {

	public static void main(String[] args) {
		int[]a = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98}	
		;
		int[]b = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98}	
		;
		Time.startTime();
		String res = compareSets(a,b);
		Time.endTime();
		System.out.println(res);

	}

	public static String compareSets(int[] a, int[] b) {

		int n = a.length;
		int m = b.length;
		boolean b1 = false;
		boolean b2 = false;
		if (a.length<=b.length) 
			for (int i = 0; i < n; i++) {
				boolean bool1 = false;
				for (int j = 0; j < m; j++) {
					if (a[i]==b[j]) {
						bool1 = true;
						break;
					}
				}
				b1 = bool1;
				if (!bool1)break;
			}

		if (a.length>b.length) 
			for (int i = 0; i < m; i++) {
				boolean bool2 = false;
				for (int j = 0; j < n; j++) {
					if (a[j]==b[i]) {
						bool2 = true;
						break;
					}
				}
				b2 = bool2;
				if (!bool2) break;
			}
		if (!b1 && !b2) return "INCOMPARABLE";
		if (a.length==b.length) return "EQUAL";
		if (a.length<b.length) return "LESS";
		if (a.length>b.length) return "GREATER";
		
		return null;
	}
}
