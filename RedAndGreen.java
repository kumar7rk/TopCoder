package TopCoder;

public class RedAndGreen {

	public static void main(String[] args) {
		String row = "RRRGGGRGGGRGGRRRGGRRRGR";
		int res = minPaints(row);
		System.out.println(res);		
	}
	public static int minPaints(String row) {
		int r = 0;
		int g = 0;
		for (char c : row.toCharArray()) {
			if(c=='R') r++;
			else g++;
		}
		int res = Math.min(r, g);
		for (int i = 1; i < row.length(); i++) {
			int min = 0;
			for (int j = 0; j < row.length(); j++) {
				if (j<i && row.charAt(j)=='G') min++;
				if (j>i && row.charAt(j)=='R') min++;
			}
			res = Math.min(res, min);
		}
		return res;
	}
}
/*
 * int count = 0;
		for (int i = 0; i < row.length(); i++) {
			int R = 0;
			int G = 0;
			String rw = row.substring(i);
			for (char c : rw.toCharArray()) {
				if(c=='R') R++;
				else G++;
			}
			if (R==0||G==0) {
				return count;
			}
			if (R<G && row.charAt(i)=='R') count++;
			else if (R>=G && row.charAt(i)=='G') count++;
//			else if (R==G) count++;
			System.out.println(R+" "+ G + " " +count);
			}
		return count;
 */