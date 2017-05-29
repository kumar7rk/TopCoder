package TopCoder;

public class SquareFreeString {

	public static void main(String[] args) {
		String s = "abcdab";
		String res = isSquareFree(s);
		System.out.println(res);
	}

	public static String isSquareFree(String s) {
		int n = s.length();
		for (int i = 0; i < n; i++) 
			for (int j = i+1; j <=n; j++) 
				for (int k = j+1; k <=n; k++) 
					if (s.substring(i, j).equals(s.substring(j,k))) 
						return "not square-free";
		return "square-free";
	}
}