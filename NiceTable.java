package TopCoder;

public class NiceTable {

	public static void main(String[] args) {
		String []t = {"0100", "1011", "0100"};
		String res = isNice(t);
		System.out.println(res);
	}

	public static String isNice(String[] t) {
		int N = t.length;
		int M = t[0].length();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				int c = Integer.parseInt(t[i].charAt(j)+"");
				boolean equal = i==j;
//				if (i>1||j>1) continue;
				if ((equal && c ==0)|| (!equal && c ==1)) continue;
				else{
					System.out.println(i+ " "+ j);
					return "Not nice";
				}
			}
			
		}
		return "Nice";
	}

}
