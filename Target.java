package TopCoder;

public class Target {

	public static void main(String[] args) {
		int n = 5;
		String[] res = draw(n);
		for (String s : res) 
			System.out.println(s);
	}

	public static String[] draw(int n) {
		char [][]res = new char [n][n];
		int s = 0;
		int e = n-1;

		for (int i = 0; i < res.length; i++) 
			for (int j = 0; j < res.length; j++) 
				res[i][j] = ' ' ;
		
		for (int i = 0; i < res.length; i++,s+=2,e-=2) {
			for (int j = s; j <= e; j++) {
				res[s][j] = '#';
				res[e][j] = '#';
			}
			for (int j =s; j <= e; j++) {
				res[j][s] = '#';
				res[j][e] = '#';	
			}
		}
		String []r = new String[n];
		for (int i = 0; i < n; i++) {
			r[i] = new String(res[i]);
		}
		return r;
	}
}
