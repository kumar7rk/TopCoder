package TopCoder;

import java.math.BigDecimal;

public class RepeatNumberCompare {

	public static void main(String[] args) {
		int x1 = 1010;
		int k1 = 3;
		int x2 = 101010;
		int k2 = 2;
		String res = compare(x1,k1,x2,k2);
		System.out.println(res);
		
	}
	public static String compare(int x1, int k1, int x2, int k2){
		StringBuffer sb1 = new StringBuffer(x1+"");
		StringBuffer sb2 = new StringBuffer(x2+"");
		for (int i = 0; i < k1-1; i++)
			sb1.append(x1);
		for (int i = 0; i < k2-1; i++)
			sb2.append(x2);
		
		BigDecimal big1 = new BigDecimal(sb1.toString());
		BigDecimal big2 = new BigDecimal(sb2.toString());
		System.out.println(big1 + "\n"+big2);

		int val = big1.compareTo(big2);
		
		if (val == 0) return "Equal";
		if (val == 1) return "Greater";
		if (val == -1) return "Less";
		return null;
	}
}
