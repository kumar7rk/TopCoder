package TopCoder;

import java.util.ArrayList;

public class Permutiple {
	static ArrayList<Integer> res = new ArrayList<>();
	public static void main(String[] args) {
		int x = 10011;
		String res = isPossible(x);
		System.out.println(res);
	}

	public static String isPossible(int x) {
		permutation(new String(x+""), x);
		for (Integer i : res) {
			double d = (double)i/x;
			System.out.println((int)i/x+" "+d);
			if ((int) (i/x) == d) return "Possible";
		}
		return "Impossible";
	}

	public static void permutation(String str, int x) { 
	    permutation("", str, x); 
	}

	private static ArrayList<Integer> permutation(String prefix, String str, int x) {
	    int n = str.length();
	    if (n == 0){
//	    	System.out.print(prefix+ " " + x);
	    	if (!prefix.equals(x+"")) {
	    		res.add(Integer.parseInt(prefix));
//	    		System.out.println(prefix);
			}
	    }
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), x);
	    }
	    return res;
	}
}
